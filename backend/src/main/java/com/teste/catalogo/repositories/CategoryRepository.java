package com.teste.catalogo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.catalogo.entites.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
	
}
