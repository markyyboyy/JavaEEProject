/**
 * @Author RyanB
 */
package com.qac.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.entities.Rating;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.managers.ProductManager;
import com.qac.row5project.managers.RatingManager;
import com.qac.row5project.managers.StockManager;

@Stateless
public class ProductService {

	@Inject
	private ProductManager productManager;
	@Inject
	private StockManager stockManager;		
	@Inject
	private RatingManager ratingManager;
	
	
	ProductItem productItem; 	
	
	
	public Product readProductByName(String name) {
		try {
			return readProductById(Long.parseLong(name));

		} catch (Exception e) {
			return null;
		}
	}

	public Product readProductById(long id) {
		return productManager.readProductById(id);
	}

	public List<Product> readProductByColour(String colour) {
		try {
			return productManager.readProductByColour(colour);
		} catch (Exception e) {
			return null;
		}
	}

	public ProductItem getProductItem(long id) {
		return getProductItem(productManager.readProductById(id), stockManager.findStocksbyID(id));
	}

	public ProductItem getProductItem(long id, Stock stock) {
		return getProductItem(productManager.readProductById(id), stock);

	}

	public ProductItem getProductItem(Product product, long id) {
		return getProductItem(product, stockManager.findStocksbyID(id));
	}

	public ProductItem getProductItem(Product product, Stock stock) {
		ProductItem productItem = new ProductItem();
		
		if (product != null)
			productItem.addProductInfo(product.getProductId(), product.getName(), product.getDesc(), product.getSize(), product.getWeight(), 
					stock.getQuantity(), stock.getPrice(), product.getStatus(), product.getSupplier(), product.getCategory());
		
		if (stock != null)
			productItem.addStockInfo(stock.getQuantity());
		
		if(product != null && ratingManager.findRatingsbyProductID(product.getProductId()) !=  null){
			
			List<Rating> r = ratingManager.findRatingsbyProductID(product.getProductId());
			productItem.addRatingInfo(r);	
			
			productItem.setAverageRating(ratingManager.findAvgRatingsbyProductID(product.getProductId() -1));

		}else{
			productItem.setAverageRating(0);
		}
				
		
		return productItem;
		
	}
	
	public List<ProductItem> findAllProducts(){
		
		List<ProductItem> temp = new ArrayList<>();
		
		
		productManager.findAllProducts().forEach(pro -> {
			
			temp.add(getProductItem(pro, 0));
			
		});
		
		return temp;
		
		
	}
}

