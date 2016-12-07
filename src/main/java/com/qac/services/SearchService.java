/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.services;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.managers.ProductManager;

@Stateless
public class SearchService {
	@Inject
	private ProductManager productRepository;
	@Inject
	private ProductService productService;

	private List<Product> searchByProductName(String name) {
		return productRepository.readProductByName(name);
	}

	private List<Product> searchByProductDescription(String description) {
		return productRepository.readProductByDescription(description);
	}

	public List<ProductItem> searchBy(String term) {
		
		List<Product> results = new ArrayList<>();

		if(term == null)
			return null;
		
		if(term.equals("")){
			results.addAll(productRepository.findAllProducts());
			
		}
			
		
		
		if (term.matches("[0-9]")) {
			Product result = productService.readProductByName(term);
			if (result != null)
				results.add(result);
		}
		results.addAll(searchByProductName(term));
		results.addAll(searchByProductDescription(term));
		if (results.isEmpty())
			return null;
		List<ProductItem> productItems = new ArrayList<>();

		results.forEach(product -> {
			productItems.add(productService.getProductItem(product, product.getProductId()));
		});
		return productItems;
	}
}
