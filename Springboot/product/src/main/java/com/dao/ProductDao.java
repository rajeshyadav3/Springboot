package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;

@Service
public class ProductDao {

	//dependency injection
	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
		
	}

	public Product getProductById(int productId) {
		Product product = new Product(0, "Product Not Found!!!", 0.0);
		return productRepository.findById(productId).orElse(product);
		
	}

	public List<Product> getProductByName(String productName) {
		return productRepository.findByName(productName);
		
	}

	public Product addProduct(Product product) {
		return productRepository.save(product);
		
	}

	public Product updateProduct(Product updatedProduct) {
		int productId = updatedProduct.getProdId();

        if (productRepository.existsById(productId)) {
            return productRepository.save(updatedProduct);
        } else {
            return null;
        }

		
	}

	public Product deleteProductById(int productId) {
		productRepository.deleteById(productId);
		return null;
	}
	
}
