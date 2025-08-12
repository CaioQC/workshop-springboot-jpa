package com.caio.projeto.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.projeto.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
