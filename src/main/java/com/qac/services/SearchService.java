package com.qac.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.managers.ProductManager;

@Stateless
public class SearchService {
	@Inject
	private ProductManager productRepository;
	@Inject
	private ProductService productService;
	private List<Product> searchByProductName(String name) {
	return productRepository.findByNameLike(name);
	}
	private List<Product> searchByProductDescription(String description) {
	return productRepository.findByDescriptionLike(description);
	}
	public List<ProductItem> searchBy(String term) {
		List<Product> results = new ArrayList<>();
		if(term.matches("[0-9]")) {
		Product result = productService.findProductById(term);
		if(result != null) results.add(result);
		}
		results.addAll(searchByProductName(term));
		results.addAll(searchByProductDescription(term));
		if(results.isEmpty()) return null;
		List<ProductItem> productItems = new ArrayList<>();
		results.forEach(product->{
		productItems.add(productService.getProductItem(product, product.getId()));
		});
		return productItems;
		}
		}

}