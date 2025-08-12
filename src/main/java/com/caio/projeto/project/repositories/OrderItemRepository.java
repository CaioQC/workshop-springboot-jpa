package com.caio.projeto.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.projeto.project.entities.OrderItem;
import com.caio.projeto.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
