package dao;

import dao.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepostory extends JpaRepository<OrderItem, Long> {
}
