package insper.store.winrecord;

import lombok.Builder;
import lombok.experimental.Accessors;
import java.time.LocalDateTime;

@Builder
@Accessors(fluent = true, chain = true)
public record WinRecordOut (
    String id,
    String playerId,
    LocalDateTime winTime,
    String winCards,
    String gameType
) { }

