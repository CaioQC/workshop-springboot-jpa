package com.caio.projeto.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.projeto.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
