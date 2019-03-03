package sandbox;

import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class Message {

    private LocalDateTime timeStamp;

    private Message() {

    }

    public Message(String content) {
        this.content = content;
        timeStamp = LocalDateTime.now();
    }


    private String content;
}
