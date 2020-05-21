package WerewolfJudge.game;

import WerewolfJudge.game.character.Character;
import WerewolfJudge.game.character.CharacterType;

public class Player {
  Character character;
  Boolean alive;
  public int id;

  public CharacterType getCharacterType() {
    return character.getType();
  }

  public Boolean isAlive() {
    return alive;
  }
}
