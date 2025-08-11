package com.caio.projeto.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.projeto.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
