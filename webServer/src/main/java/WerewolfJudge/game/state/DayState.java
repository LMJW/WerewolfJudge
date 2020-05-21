package WerewolfJudge.game.state;

import WerewolfJudge.game.Game;
import WerewolfJudge.game.Player;
import WerewolfJudge.game.character.CharacterType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DayState implements State {
  Game game;
  ArrayList<Player> lastNightDeath = new ArrayList<>();
  Iterator<Player> players = new ArrayList<Player>().iterator();
  Timer timer;
  DayActivityStage stage;
  ArrayList<Player> votedDeath = new ArrayList<>();

  public DayState(Game game) {
    this.game = game;
    this.timer = new Timer();
    this.stage = DayActivityStage.DEATHSKILL;
  }

  public void start() {
    // all the players who are alive start to talk

    // end of day, vote

    // day is on, open eye
    game.notifyAllPlayer("sun is coming out. everyone, open your eye...");

    lastNightDeath = game.getLastNightDeath();
    timer.schedule(new DayTimeTask(this), 3000);
  }

  public void next() {
    if (stage == DayActivityStage.DEATHSKILL) {
      deathShot();
      timer.schedule(new DayTimeTask(this), 3000);
      stage = DayActivityStage.PRESENTATION;
    } else if (stage == DayActivityStage.PRESENTATION) {
      if (players.hasNext()) {
        var player = players.next();
        if (player.isAlive()) {
          game.notifyPlayer(player);
          timer.schedule(new DayTimeTask(this), 3000);
        } else {
          next();
        }
      } else {
        // notify all players to vote
        stage = DayActivityStage.VOTE;
        next();
      }
    } else if (stage == DayActivityStage.VOTE) {
      game.notifyAllPlayer("everyone please vote");
      timer.schedule(new DayTimeTask(this), 3000);
      stage = DayActivityStage.TESTAMENT;
    } else {
      // testament stage
      if (votedDeath.size() > 0) {
        var player = votedDeath.remove(0);
        // dead player make speech
        game.notifyPlayer(player);
        timer.schedule(new DayTimeTask(this), 3000);
      } else {
        end();
      }
    }
  }

  public void end() {
    game.startNightState();
  }

  public void deathShot() {
    log.info("deathshot...");
    for (Player player : lastNightDeath) {
      if (player.getCharacterType() == CharacterType.HUNTER) game.notifyPlayer(player);
    }
    lastNightDeath = null;
  }
}
