package WerewolfJudge.webServer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Room {
  private @Id @GeneratedValue Long id;
  private String name;
  private String addr;

  Room(){}

  Room(String name, String addr){
    this.name = name;
    this.addr = addr;
  }
}