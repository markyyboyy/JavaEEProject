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

//SEARCH BY THE ID IF IT IS INPUT AS A STRING TO RETURN AN ITEM
	
	public Product readProductByName(String name) {
		try {
			return readProductById(Long.parseLong(name));

		} catch (Exception e) {
			return null;
		}
	}
	//SEARCH BY THE PRODUCT ID TO RETURN AN ITEM
	public Product readProductById(long id) {
		//CALL METHOD IN PRODUCTMANAGER BY PASSING THE ID
		return productManager.readProductById(id);
	}
		//
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

	public ProductItem getProductItem(Product product) {
		return getProductItem(product, stockManager.findStocksbyID(product.getProductId()));
	}

	public ProductItem getProductItem(Product product, Stock stock) {
		ProductItem productItem = new ProductItem();

		
		List<Stock> stock2 = stockManager.getStockByProductID(product.getProductId());
		System.out.println(stock2.size());
		
		productItem.addStockInfo(stock2.size(), stock2.get(0).getPrice());
		
		if (product != null)
			productItem.addProductInfo(product.getProductId(), product.getName(), product.getDesc(), product.getSize(),
					product.getWeight(), product.getStatus(), product.getSupplier(), product.getCategory());

		if (stock != null){
			productItem.addStockInfo(productManager.findsTotalStockLevel(stockManager.getStockByProductID(product.getProductId())), stock.getPrice());
		}

		if (product != null && ratingManager.findRatingsbyProductID(product.getProductId()) != null) {

			List<Rating> r = ratingManager.findRatingsbyProductID(product.getProductId());
			productItem.addRatingInfo(r);

			productItem.setAverageRating(setAverageRating(r));

		} else {
			productItem.setAverageRating(0);
		}

		return productItem;

	}

	public int setAverageRating(List<Rating> rating){
		
		int iRating = 0;
		
		for (Rating r : rating) {
			iRating += r.getScore();
		}
		
		return iRating / rating.size();
		
		
	}
	
	
	
	public List<ProductItem> findAllProducts() {

		List<ProductItem> temp = new ArrayList<>();
		productManager.findAllProducts().forEach(pro -> {
			temp.add(getProductItem(pro));

		});
		
		return temp;

	}
}
