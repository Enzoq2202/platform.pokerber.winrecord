package insper.store.winrecord;

import insper.store.winrecord.WinRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WinRecordRepository extends JpaRepository<WinRecord, Long> {
    List<WinRecord> findByPlayerId(String playerId);
}
