package main.java.dao;

import main.java.dao.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepostory extends JpaRepository<OrderItem, Long> {
}
