package insper.store.winrecord;

import insper.store.winrecord.WinRecord;
import insper.store.winrecord.WinRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/win-records")
public class WinRecordController {

    private final WinRecordService winRecordService;

    @Autowired
    public WinRecordController(WinRecordService winRecordService) {
        this.winRecordService = winRecordService;
    }

    @PostMapping
    public ResponseEntity<WinRecord> addWinRecord(@RequestBody WinRecord winRecord) {
        WinRecord newWinRecord = winRecordService.saveWinRecord(winRecord);
        return ResponseEntity.ok(newWinRecord);
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<List<WinRecord>> getWinRecordsByPlayerId(@PathVariable String playerId) {
        List<WinRecord> winRecords = winRecordService.getWinRecordsByPlayerId(playerId);
        return ResponseEntity.ok(winRecords);
    }

    // Adicione mais endpoints conforme necessário
}
