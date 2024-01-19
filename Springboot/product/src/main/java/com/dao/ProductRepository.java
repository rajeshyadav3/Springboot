package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	@Query("from Product where prodName = :pName")
	List<Product> findByName(@Param("pName") String productName);

}
