import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto {
    private UUID id;
    private String username;
}
