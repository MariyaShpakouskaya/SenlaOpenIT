package dao.entity;

import java.time.LocalDateTime;

public class Orders {

    private Long id;
    private Long user_id;
    private LocalDateTime timestamp;

    public enum Status {
        CREATED,
        PROCESSED,
        COMPLETED
    }

}
