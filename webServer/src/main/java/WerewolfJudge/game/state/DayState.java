package WerewolfJudge.game.state;

import java.util.ArrayList;
import java.util.Iterator;

import WerewolfJudge.game.Game;
import WerewolfJudge.game.Player;
import WerewolfJudge.game.character.CharacterType;

public class DayState implements State {
  Game game;
  ArrayList<Player> lastNightDeath;
  Iterator<Player> players;

  public DayState(Game game){
    this.game = game;
  }

  public void start(){
    // all the players who are alive start to talk

    // end of day, vote

    // day is on, open eye
    game.notifyAllPlayer();

    lastNightDeath = game.getLastNightDeath();
  }

  public void next(){
    if (lastNightDeath.size()>0){
      deathShot();
    }
  }

  public void end() {
  }

  public void testament(){
    
  }

  public void deathShot(){
    for (Player player:lastNightDeath){
      if (player.getCharacterType() == CharacterType.HUNTER)
      game.notifyPlayer(player);
    }
    lastNightDeath = null;
  }
}