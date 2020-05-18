package WerewolfJudge.webServer;
/**
 * As an initial step, I will use sqlite for development purposes.
 *
 * <p>I do not want to perminant store the user info, the only thing I want to store is the user's
 * session just for distinguish different users. These session will be assigned when user register
 * and will be deleted after some times.
 *
 * <p>I will use a sqlite in memory db to store the user info.
 */
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
  static String connectionStr = "jdbc:sqlite::memory:";

  public static void InitNewInMemoryDatabase() throws Exception {

    try (Connection conn = DriverManager.getConnection(connectionStr);
        Statement stmt = conn.createStatement(); ) {
      // load the sql from resources
      String sql = Resources.toString(Resources.getResource("db/init.sql"), Charsets.UTF_8);
      stmt.execute(sql);
    } catch (Exception e) {
      throw new Exception("Error when initialize in memory db: " + e.getMessage(), e);
    }
  }
}
