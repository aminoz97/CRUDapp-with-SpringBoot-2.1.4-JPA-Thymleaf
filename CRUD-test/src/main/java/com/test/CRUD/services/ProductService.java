package com.test.CRUD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import com.test.CRUD.dao.ProductRepository;
import com.test.CRUD.entities.Product;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository prodRep;
	
	public List<Product> listAll() {
		return prodRep.findAll();
	}
	
	
	public void save(Product P) {
		prodRep.save(P);
	}
	public Product get(int id) {
		Product P= prodRep.findById(id).get();
		return P;
	}
	public void delete(int id) {
		prodRep.deleteById(id);
	}

	
	
}
