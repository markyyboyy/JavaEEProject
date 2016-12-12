/**
 * PRODUCTSERVICE DETERMINES VALIDATES THE REQUESTED METHODS FROM THE FRONT END AND INSTRUCTS THE PRODUCTMANAGER TO CARRY OUT ITS METHODS
 * @Author RyanB
 *
 */
package com.qac.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.ProductItem;
import com.qac.row5project.managers.ProductManager;
import com.qac.row5project.managers.StockManager;

@Stateless
public class ProductService {

	@Inject
	private ProductManager productManager;
	@Inject
	private StockManager stockManager;

	ProductItem productItem;


/**
 * CUSTOMER/INV MANAGER
 * CONVERTS A STRING PRODUCT ID TO A LONG ID
 * @param name
 * @return PRODUCT
 */
	public Product readProductByName(String name) {
		try {
			return readProductById(Long.parseLong(name));

		} catch (Exception e) {
			return null;
		}
	}
	//SEARCH BY THE PRODUCT ID TO RETURN AN ITEM

	/**
	 * CUSTOMER/INV MANAGER
	 * SEARCH BY THE PRODUCT ID 
	 * @param id
	 * @return PRODUCT/S
	 */
	public Product readProductById(long id) {
		//CALL METHOD IN PRODUCTMANAGER BY PASSING THE ID
		return productManager.readProductById(id);
	}

/**
 * SEARCH PRODUCTS BY COLOUR
 * @param colour
 * @return PRODUCT/S
 */
	
	public List<Product> readProductByColour(String colour) {
		try {
			return productManager.readProductByColour(colour);
		} catch (Exception e) {
			return null;
		}
	}

/**
 * V1
 * SEARCH FOR A PRODUCT ITEM BY USING THE PRODUCT AND STOCK MANAGERS
 * @param id
 * @return PRODUCTITEM
 */
	
	public ProductItem getProductItem(long id) {
		return getProductItem(productManager.readProductById(id), stockManager.findStocksbyID(id));
	}

	/**
	 * V2
	 * SEARCH FOR A PRODUCT ITEM BY USING THE PRODUCT AND STOCK MANAGERS
	 * @param id
	 * @param Stock
	 * @return PRODUCT ITEM
	 */
	
	public ProductItem getProductItem(long id, Stock stock) {
		return getProductItem(productManager.readProductById(id), stock);

	}

	/**
	 * V3
	 * SEARCH FOR A PRODUCT'S INFORMATION
	 * @param Product
	 * @return PRODUCT ITEM
	 */
	
	public ProductItem getProductItem(Product product) {
		return getProductItem(product, stockManager.findStocksbyID(product.getProductID()));
	}

	/**
	 * V4
	 * SEARCH FOR A PRODUCT ITEM BY USING THE PRODUCT AND STOCK MANAGERS
	 * @param Product
	 * @param Stock
	 * @return PRODUCT ITEM
	 */
	
	public ProductItem getProductItem(Product product, Stock stock) {
		ProductItem productItem = new ProductItem();
		List<Stock> stock2 = stockManager.getStockByProductID(product.getProductID());
		System.out.println(stock2.size());
		
		productItem.addStockInfo(stock2.size(), (float) stock2.get(0).getPrice());
		//CHECK TO SEE IF THE PRODUCT IS NULL AND ADDS ALL ITEMS TO THE PRODUCTITEM ARRAYLIST
		if (product != null)
			productItem.addProductInfo(product.getProductID(), product.getName(), product.getDesc(), product.getSize(),
					product.getWeight(), product.getItemStatus(), product.getSupplier(), product.getCategory());
		//CHECK TO SEE IF THE STOCK IS NULL AND ADDS ALL ITEMS TO THE PRODUCTITEM ARRAYLIST
		if (stock != null){
			productItem.addStockInfo(productManager.findsTotalStockLevel(stockManager.getStockByProductID(product.getProductID())), (float) stock.getPrice());
		}
		

		return productItem;

	}

	
/**
 * 	LIST ALL PRODUCTS
 * @return List<ProductItem>
 * 
 */
	
	public List<ProductItem> findAllProducts() {

		List<ProductItem> temp = new ArrayList<>();
		productManager.findAllProducts().forEach(pro -> {
			temp.add(getProductItem(pro));

		});
		
		return temp;

	}
}

