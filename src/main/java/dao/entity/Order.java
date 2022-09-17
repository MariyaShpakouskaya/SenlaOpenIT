package main.java.dao.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_id")
    private Long user_id;
    @Column(name = "created_at")
    private LocalDateTime timestamp;
    @Column(name = "status")
    private Status status;

    public Order() {

    }

    public enum Status {
        CREATED,
        PROCESSED,
        COMPLETED
    }

    public Order(Long user_id, LocalDateTime timestamp, Status status) {
        this.user_id = user_id;
        this.timestamp = timestamp;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(user_id, order.user_id) && Objects.equals(timestamp, order.timestamp) && status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user_id, timestamp, status);
    }
}
