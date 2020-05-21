package WerewolfJudge.game.state;

import java.util.TimerTask;

public class NightTimeTask extends TimerTask {
  State state;

  public NightTimeTask(State state) {
    this.state = state;
  }

  @Override
  public void run() {
    state.next();
  }
}
