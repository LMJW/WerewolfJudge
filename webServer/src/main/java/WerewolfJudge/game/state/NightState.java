package WerewolfJudge.game.state;

import java.util.Iterator;
import java.util.Timer;

import WerewolfJudge.game.Game;
import WerewolfJudge.game.character.CharacterType;

public class NightState implements State{
  Game game;
  Timer timer;
  Iterator<CharacterType> characters;
  CharacterType current;
  Integer WAITINGTIME = 5000; // 5 second waiting time

  public NightState(Game game){
    this.game = game;
    timer = new Timer();
    this.characters = game.getAllCharacterTypes().iterator();
  }

  public void start(){
    // everyone close eye
    game.notifyAllPlayer();

    timer.schedule(new NightTimeTask(this), WAITINGTIME);
  }

  public void next(){
    if (characters.hasNext()){
      current = characters.next();
      game.notifyCharacter(current);

      timer.schedule(new NightTimeTask(this), WAITINGTIME);
    }else{
      // night state completed
      end();
    }
  }

  public void end() {
    game.startDayState();
  }

}