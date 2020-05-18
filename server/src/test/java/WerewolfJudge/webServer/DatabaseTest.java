package WerewolfJudge.webServer;

import org.junit.Test;

public class DatabaseTest {
  @Test
  public void InitInMemorySqliteDBShouldNotFail() throws Exception {
    try {
      Database.InitNewInMemoryDatabase();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      throw e;
    }
  }
}
