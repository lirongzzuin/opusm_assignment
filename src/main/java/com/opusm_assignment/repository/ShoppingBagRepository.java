package com.opusm_assignment.repository;

import com.opusm_assignment.model.Order;
import com.opusm_assignment.model.ShoppingBag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShoppingBagRepository extends JpaRepository<ShoppingBag, Long> {
    List<ShoppingBag> findShoppingBagByOrder(Order order);
}
