package WerewolfJudge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
class User {
  private @Id @GeneratedValue Long id;
  private String name;
  private String session;

  User() {}

  User(String name, String session) {
    this.name = name;
    this.session = session;
  }
}
