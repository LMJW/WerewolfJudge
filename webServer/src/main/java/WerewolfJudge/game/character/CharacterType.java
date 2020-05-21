package WerewolfJudge.game.character;

/**
 * Enum that encodes the character type. The order of the characters represents the order of actions
 * during the night stage.
 *
 * <p>Eg. werewolf goes first, followed by seer, then witch, then gardian ...
 */
public enum CharacterType {
  WEREWOLF,
  SEER,
  WITCH,
  GARDIAN,
  HUNTER,
  VILLAGER,
}
