package com.caio.projeto.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.projeto.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
