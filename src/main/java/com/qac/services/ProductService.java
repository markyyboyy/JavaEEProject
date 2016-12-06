package com.qac.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.managers.ProductManager;
import com.qac.row5project.managers.StockManager;

@Stateless
public class ProductService {

	@Inject
	private ProductManager productManager;
	@Inject
	private StockManager stockManager;

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
		ProductItem productItem = new ProductItem(stock.getStockID());
		if (product != null)
			productItem.addProductInfo(productItem.getName(), productItem.getDescription(), productItem.getHeight(),
					productItem.getWidth(), productItem.getDepth(), productItem.getWeight());
		if (stock != null)
			productItem.addStockInfo(stock.getQuantity());
		return productItem;
	}
	
	public List<Product> findAllProducts(){
		List<Product> prod = new ArrayList<>();
		for(Product p: productManager.findAllProducts()){
			prod.add(p);
		}
		return prod;
		
	}
}

