package com.ts.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDao;
import com.model.Product;

@RestController
public class ProductController {
	
	//Implementing Dependency Injection for ProductDao 
		@Autowired
		ProductDao productDao;
		
		@GetMapping("getAllProducts")
		public List<Product> getAllProducts() {		
			return productDao.getAllProducts();
		}
		
		@GetMapping("getProductById/{productId}")
		public Product getProductById(@PathVariable("productId") int productId) {
			return productDao.getProductById(productId);	
		}
		
		@GetMapping("getProductByName/{productName}")
		public List<Product> getProductByName(@PathVariable("productName") String productName) {
			return productDao.getProductByName(productName);
		}
		
		@PostMapping("addProduct")
		public Product addProduct(@RequestBody Product product) {
			return productDao.addProduct(product);
		}
		
		@PutMapping("updateProduct/{productId}")
		public Product updateProduct(@PathVariable("productId") int productId, @RequestBody Product updatedProduct) {
		    updatedProduct.setProdId(productId);
		    return productDao.updateProduct(updatedProduct);
		}
		
		@DeleteMapping("deleteProductById/{productId}")
		public Product deleteProductById(@PathVariable int productId){
		    return productDao.deleteProductById(productId);
		}
	
	//HardCoded
	@GetMapping("getProduct")
	public Product getProduct() {
		Product product = new Product();
		product.setProdId(101);
		product.setProdName("Laptop");
		product.setPrice(45000.00);
		
		return product;
	}
	
	@GetMapping("getProducts")
	public List<Product> getProducts() {
		
		Product product1 = new Product(101, "Laptop",   45000.00);
		Product product2 = new Product(102, "Mobile",   85000.00);
		Product product3 = new Product(103, "Pendrive", 500.00);
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		return productList;
	}
	
}
