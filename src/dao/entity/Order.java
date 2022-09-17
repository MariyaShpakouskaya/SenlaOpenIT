package dao.entity;

import java.time.LocalDateTime;

public class Order {

    private Long id;
    private Long user_id;
    private LocalDateTime timestamp;

    public enum Status {
        CREATED,
        PROCESSED,
        COMPLETED
    }

}
