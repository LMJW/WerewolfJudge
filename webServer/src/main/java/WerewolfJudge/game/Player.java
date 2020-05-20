package WerewolfJudge.game;

import WerewolfJudge.game.character.CharacterType;
import WerewolfJudge.game.character.Character;


public class Player {
  Character character;
  public int id;

  public CharacterType getCharacterType(){
    return character.getType();
  }
}
