package com.mycompany.store.repository;

import com.mycompany.store.domain.OrderItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * Spring Data  repository for the OrderItem entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    Page<OrderItem> findAllByCustomerUserLogin(String s, Pageable pageable);

    Optional<OrderItem> findOneByIdCustomerUserLogin(Long id, String s);
}
