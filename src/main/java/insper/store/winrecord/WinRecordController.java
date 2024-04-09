package insper.store.winrecord;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "store-winrecord")
public interface WinRecordController {

    @PostMapping("/winrecord")
    public ResponseEntity<WinRecordOut> create(
        @RequestBody(required = true) WinRecordIn in
    );

    @PutMapping("/winrecord/{id}")
    public ResponseEntity<WinRecordOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) WinRecordIn in
    );

    @GetMapping("/winrecord")
    public ResponseEntity<WinRecordOut> read(
        @RequestHeader(required = true, name = "id-winrecord") String idWinRecord
    );
    
}