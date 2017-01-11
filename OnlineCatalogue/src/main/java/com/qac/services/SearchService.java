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
import com.qac.row5project.entities.Rating;
import com.qac.row5project.helpers.ProductItem;
import com.qac.row5project.managers.ProductManager;
import com.qac.row5project.managers.RatingManager;
import com.qac.row5project.managers.offline.RatingManagerOffline;

@Stateless
public class SearchService {
	@Inject
	private ProductManager productRepository;
	@Inject
	private ProductService productService;
	
	@Inject
	private RatingManager rm;

	private List<Product> searchByProductName(String name) {
		return productRepository.readProductByName(name);
	}

	private List<Product> searchByProductDescription(String description) {
		return productRepository.readProductByDescription(description);
	}

	
	public List<ProductItem> search(String sName, int iRating, double dMaxPrice){
		
		List<ProductItem> productResults = searchBy(sName);

		if(iRating > 0 && iRating <=5){		
			productResults = searchByRating(iRating, productResults);			
		}
		
		if(dMaxPrice > 0){
			System.out.println("Price match");
		}		
		
		
		return productResults;
		
	}
	
	
	public List<ProductItem> searchByRating(int iRating, List<ProductItem> results){
		
		List<ProductItem> resultsRating = new ArrayList<>();
		
		for (ProductItem productItem : results) {		
			
		List<Rating> r = rm.findRatingsbyProductID(productItem.getID());
		
		if(r == null)
			continue;
		
			
			if(getAverageRating(r) >= iRating) 
				resultsRating.add(productItem);	
			
		}
		
		
		return resultsRating;
	}
	
	
	public int getAverageRating(List<Rating> r) {
		
		int iAvg = 0;
		
		for (Rating rating : r) {
			iAvg += rating.getScore();
		}
		
		
		
		if(r.size() < 1)
			return 0;
		
		return iAvg / r.size();
		
		
	}
	
	
	
	
	public List<ProductItem> searchBy(String term) {
		
		List<Product> results = new ArrayList<>();
		List<ProductItem> productItems = new ArrayList<>();

		if(term == null)
			return new ArrayList<>();
		
		if(term.equals("")){
			results.addAll(productRepository.findAllProducts());
			
			results.forEach(product -> {
				productItems.add(productService.getProductItem(product));
			});
			
			return productItems;
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

		results.forEach(product -> {
			productItems.add(productService.getProductItem(product));
		});
		return productItems;
	}
}
