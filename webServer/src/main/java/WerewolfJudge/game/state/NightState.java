package WerewolfJudge.game.state;

import WerewolfJudge.game.Game;
import WerewolfJudge.game.character.CharacterType;
import java.util.Iterator;
import java.util.Timer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NightState implements State {
  Game game;
  Timer timer;
  Iterator<CharacterType> characters;
  CharacterType current;
  Integer WAITINGTIME = 5000; // 5 second waiting time

  public NightState(Game game) {
    this.game = game;
    timer = new Timer();
    this.characters = game.getAllCharacterTypes().iterator();
  }

  public void start() {
    // everyone close eye
    game.notifyAllPlayer("everyone close eye...");

    timer.schedule(new NightTimeTask(this), WAITINGTIME);
  }

  public void next() {
    if (characters.hasNext()) {
      current = characters.next();
      game.notifyCharacter(current);

      timer.schedule(new NightTimeTask(this), WAITINGTIME);
    } else {
      // night state completed
      end();
    }
  }

  public void end() {
    log.info("night state completed...");
    game.startDayState();
  }
}
