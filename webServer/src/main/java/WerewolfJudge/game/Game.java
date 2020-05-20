package WerewolfJudge.game;

import java.util.ArrayList;
import WerewolfJudge.game.character.CharacterType;
import WerewolfJudge.game.state.*;

/**
 * Game instance
 */
public class Game {
  State state;
  // keep track of which night is this (first night, second night ...)
  Integer nightNumber = 0;
  // keep track of which day is this (first day, second day, ...)
  Integer dayNumber = 0;


  ArrayList<Player> players;
  ArrayList<CharacterType> allCharacterTypes;

  ArrayList<Player> lastNightDeath;
  // Action logs to replay the game

  public Game(){
    state = new InitialState(this);
  }

  public void start(){
    state.start();
  }

  public void registerPlayer(){}
  public void removePlayer(){}
  public void notifyAllPlayer(){}
  public void notifyCharacter(CharacterType type){}
  public void notifyPlayer(Player p){}

  public void startNightState(){
    nightNumber++;
    state = new NightState(this);
    state.start();
  }

  public void startDayState() {
    dayNumber++;
    state = new DayState(this);
    state.start();
  }

  /**
   * @return the allCharacterTypes
   */
  public ArrayList<CharacterType> getAllCharacterTypes() {
    return allCharacterTypes;
  }

  /**
   * @return the lastNightDeath
   */
  public ArrayList<Player> getLastNightDeath() {
    return lastNightDeath;
  }
}
