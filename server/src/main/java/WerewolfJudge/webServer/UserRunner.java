package WerewolfJudge.webServer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserRunner implements CommandLineRunner {
  @Autowired private UserRepository repo;

  @Override
  public void run(String... args) throws Exception {
    log.info("show all the users");
    for (User u : repo.findAll()) {
      log.info("{}",u.toString());
    }
  }
}
