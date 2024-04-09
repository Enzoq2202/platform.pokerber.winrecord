package insper.store.winrecord;

import insper.store.winrecord.WinRecord;
import insper.store.winrecord.WinRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime; 
import java.util.List;

@Service
public class WinRecordService {

    private final WinRecordRepository winRecordRepository;

    @Autowired
    public WinRecordService(WinRecordRepository winRecordRepository) {
        this.winRecordRepository = winRecordRepository;
    }

    public WinRecord saveWinRecord(WinRecord winRecord) {
        winRecord.setWinTime(LocalDateTime.now()); // Aqui é usado LocalDateTime
        return winRecordRepository.save(winRecord);
    }

    public List<WinRecord> getWinRecordsByPlayerId(String playerId) {
        return winRecordRepository.findByPlayerId(playerId);
    }
}
