package com.test.CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.test.CRUD.dao.ProductRepository;
import com.test.CRUD.entities.Product;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {
	
	@Autowired
	private ProductRepository prodRep;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {
		/*Product p=new Product("Iphone", "Apple", "madeinKorea", 2.0);
		prodRep.save(p);
		Product p1=new Product("montre", "rolex", "madeinSwitz", 50.0);
		prodRep.save(p1);*/
		
	}

}
