package WerewolfJudge.game.state;

import WerewolfJudge.game.Game;

public class InitialState implements State {
  Game game;

  public InitialState(Game game) {
    this.game = game;
  }

  public void start() {
    // check if every player are ready
    end();
  }

  public void next() {}

  public void end() {
    game.startNightState();
  }
}
