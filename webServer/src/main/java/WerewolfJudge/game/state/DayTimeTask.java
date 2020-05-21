package WerewolfJudge.game.state;

import java.util.TimerTask;

public class DayTimeTask extends TimerTask {
  State state;

  public DayTimeTask(State state) {
    this.state = state;
  }

  @Override
  public void run() {
    state.next();
  }
}
