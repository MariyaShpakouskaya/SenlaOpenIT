package main.java.service.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class OrderDto {
    private Long id;
    private Long user_id;
    private LocalDateTime timestamp;
    private Status status;

    public enum Status {
        CREATED,
        PROCESSED,
        COMPLETED
    }

    public OrderDto(Long user_id, LocalDateTime timestamp, Status status) {
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
        OrderDto orderDto = (OrderDto) o;
        return Objects.equals(id, orderDto.id) && Objects.equals(user_id, orderDto.user_id) && Objects.equals(timestamp, orderDto.timestamp) && status == orderDto.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user_id, timestamp, status);
    }
}
