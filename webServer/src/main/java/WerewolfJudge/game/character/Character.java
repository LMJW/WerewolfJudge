package WerewolfJudge.game.character;

import java.util.ArrayList;

public abstract class Character {
  CharacterType type ;
  ArrayList<Trait> traits;

  void vote(int playerID) {}

  void talk() {}

  public String getName() {
    return this.getClass().getSimpleName();
  }

  /**
   * @return the type
   */
  public CharacterType getType() {
    return type;
  }
}
