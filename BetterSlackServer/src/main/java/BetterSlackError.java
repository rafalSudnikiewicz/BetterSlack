import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BetterSlackError {
    private LocalDateTime timestamp;
    private String message;

    public BetterSlackError(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    /**
     * Constructor for serialization
     * and various framework
     */
    private BetterSlackError() {
    }
}
