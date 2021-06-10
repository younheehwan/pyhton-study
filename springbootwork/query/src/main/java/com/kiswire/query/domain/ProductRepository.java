package com.kiswire.query.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	@Query(value = "SELECT e.id, e.name, e.price, e.level FROM (SELECT id, name, price, if(price>1000, 1, 0) as level FROM product WHERE id = :id) e", nativeQuery = true)
	Product mFindTest1(Long id);
	
}