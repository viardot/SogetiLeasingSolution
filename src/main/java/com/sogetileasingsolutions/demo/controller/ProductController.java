package com.sogetileasingsolutions.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sogetileasingsolutions.demo.model.Product;
import com.sogetileasingsolutions.demo.model.ProductId;

@RestController
public class ProductController {
	
	@GetMapping("/")
	public String hello() {
		return "Sogeti Leasing Services"; 
	}
	@PostMapping("/product")
	public ResponseEntity<ProductId> CreateProduct(@RequestBody final Product product) {

        ProductId result = new ProductId(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED)
        		             .contentType(MediaType.APPLICATION_JSON)
        		             .body(result);
	}
	
	@GetMapping("/product")
	public List<Product> GetAllProducts(){
		List<Product> result = new ArrayList<>();
		
		result.add(new Product("1", "Mercedes E220", 82000.00));
		result.add(new Product("2", "BMW 5 serries", 85000.00));
		result.add(new Product("3", "Audi A6", 83000.00));
		result.add(new Product("4", "Toyota Rav4", 4500.00));
		
		return result;
	}
	
	@GetMapping("/product/{id}")
	public Product GetProductbyId(@PathVariable final String id) {
		List<Product> productList = new ArrayList<>();
		
		productList.add(new Product("1", "Mercedes E220", 82000.00));
		productList.add(new Product("2", "BMW 5 serries", 85000.00));
		productList.add(new Product("3", "Audi A6", 83000.00));
		productList.add(new Product("4", "Toyota Rav4", 4500.00));
		
		return productList.get(Integer.valueOf(id)-1);
		
	}

}
