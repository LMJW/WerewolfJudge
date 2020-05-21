package WerewolfJudge;

import WerewolfJudge.game.Game;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
  private final RoomRepository repo;

  RoomController(RoomRepository repo) {
    this.repo = repo;
  }

  @GetMapping("/rooms")
  List<Room> all() {
    return repo.findAll();
  }

  @PostMapping("/rooms")
  Room newRoom(@RequestBody Room room) {
    var game = new Game();
    game.start();
    return repo.save(room);
  }
}
