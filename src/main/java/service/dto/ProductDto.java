package main.java.service.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class ProductDto {

    private Long id;
    private String name;
    private BigDecimal price;
    private LocalDateTime timestamp;
    private Product_status status;

    public enum Product_status {
        OUT_OF_STOCK,
        IN_STOCK,
        RUNNING_LOW
    }

    public ProductDto(String name, BigDecimal price, LocalDateTime timestamp, Product_status status) {
        this.name = name;
        this.price = price;
        this.timestamp = timestamp;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Product_status getStatus() {
        return status;
    }

    public void setStatus(Product_status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto that = (ProductDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(price, that.price) && Objects.equals(timestamp, that.timestamp) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, timestamp, status);
    }
}
