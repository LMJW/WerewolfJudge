package WerewolfJudge.game;

import static org.junit.Assert.assertEquals;

import WerewolfJudge.game.character.Villager;
import WerewolfJudge.game.character.Werewolf;
import org.junit.Test;

public class CharacterTest {
  @Test
  public void testCharacterGetName() {
    var villager = new Villager();
    var werewolf = new Werewolf();
    assertEquals("Villager", villager.getName());
    assertEquals("Werewolf", werewolf.getName());
  }
}
