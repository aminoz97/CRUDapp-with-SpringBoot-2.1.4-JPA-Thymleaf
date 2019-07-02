package com.test.CRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.CRUD.entities.*;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
