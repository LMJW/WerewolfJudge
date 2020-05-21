package WerewolfJudge.game;

import WerewolfJudge.game.character.CharacterType;
import WerewolfJudge.game.state.*;
import java.util.ArrayList;

/** Game instance */
public class Game {
  private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Game.class);

  State state;
  // keep track of which night is this (first night, second night ...)
  Integer nightNumber = 0;
  // keep track of which day is this (first day, second day, ...)
  Integer dayNumber = 0;

  ArrayList<Player> players = new ArrayList<>();
  ArrayList<CharacterType> allCharacterTypes = new ArrayList<>();

  ArrayList<Player> lastNightDeath = new ArrayList<>();
  // Action logs to replay the game

  public Game() {
    state = new InitialState(this);
  }

  public void start() {
    log.info("game started...");
    state.start();
  }

  public void registerPlayer() {}

  public void removePlayer() {}

  public void notifyAllPlayer(String msg) {
    log.info(msg);
  }

  public void notifyCharacter(CharacterType type) {
    log.info(type + " do something...");
  }

  public void notifyPlayer(Player p) {
    log.info("player please do something...");
  }

  public void startNightState() {
    log.info("start the night " + nightNumber);
    nightNumber++;
    state = new NightState(this);
    state.start();
  }

  public void startDayState() {
    log.info("start the day " + dayNumber);
    dayNumber++;
    state = new DayState(this);
    state.start();
  }

  /** @return the allCharacterTypes */
  public ArrayList<CharacterType> getAllCharacterTypes() {
    return allCharacterTypes;
  }

  /** @return the lastNightDeath */
  public ArrayList<Player> getLastNightDeath() {
    return lastNightDeath;
  }
}
