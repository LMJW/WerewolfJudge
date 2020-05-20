package WerewolfJudge.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import WerewolfJudge.game.character.Villager;
import WerewolfJudge.game.character.Werewolf;

public class CharacterTest {
  @Test
  public void testCharacterGetName() {
    var villager = new Villager();
    var werewolf = new Werewolf();
    assertEquals("Villager", villager.getName());
    assertEquals("Werewolf", werewolf.getName());
  }
}
