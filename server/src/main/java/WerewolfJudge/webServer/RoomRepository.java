package WerewolfJudge.webServer;

import org.springframework.data.jpa.repository.JpaRepository;

interface RoomRepository extends JpaRepository<Room, Long> {
  
}