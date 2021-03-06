/**
 * PRODUCTSERVICE DETERMINES VALIDATES THE REQUESTED METHODS FROM THE FRONT END AND INSTRUCTS THE PRODUCTMANAGER TO CARRY OUT ITS METHODS
 * @Author RyanB
 *
 */
package com.qac.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.faces.model.DataModel;
import javax.inject.Inject;

import com.qac.row5project.entities.Category;
import com.qac.row5project.entities.ItemStatus;
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
	 * V2
	 * SEARCH FOR A PRODUCT ITEM BY USING THE PRODUCT AND STOCK MANAGERS
	 * @param id
	 * @param Stock
	 * @return PRODUCT ITEM
	 */
	
	public ProductItem getProductItem(long id) {
		return getProductItem(productManager.readProductById(id));

	}


	/**
	 * V4
	 * SEARCH FOR A PRODUCT ITEM BY USING THE PRODUCT AND STOCK MANAGERS
	 * @param Product
	 * @param Stock
	 * @return PRODUCT ITEM
	 */
	

	public ProductItem getProductItem(Product product) {
		ProductItem productItem = new ProductItem();
		List<Stock> stock2 = stockManager.getStockByProductID(product.getProductID());

		//CHECK TO SEE IF THE PRODUCT IS NULL AND ADDS ALL ITEMS TO THE PRODUCTITEM ARRAYLIST
		if (product != null)
			productItem.addProductInfo(product.getProductID(), product.getName(), product.getDesc(), product.getSize(),
					product.getWeight(), product.getItemStatus(), product.getSupplierID(), product.getCategory(),product.getPrice());
		//CHECK TO SEE IF THE STOCK IS NULL AND ADDS ALL ITEMS TO THE PRODUCTITEM ARRAYLIST
		if (!stock2.isEmpty()){
			productItem.addStockInfo(productManager.findsTotalStockLevel(stock2));
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
		List<Product> lsProduct = productManager.findAllProducts();
				
		for(int i = 0; i <lsProduct.size() -1; i++){
			temp.add(getProductItem(lsProduct.get(i)));
		}

		return temp;
	}
	
	public void addProduct(ProductItem p){
		Product product = new Product(p.getName(), p.getDescription(), p.getPrice(), p.getWeight(), "blue", p.getSize(), 0, p.getCategory(), ItemStatus.AVAILABLE);
		productManager.createProduct(product);
	}

	public List<ProductItem> findAllAvailableProducts() {
		List<ProductItem> temp = new ArrayList<>();
		List<Product> lsProduct = productManager.findAllProducts();
				
		for(int i = 0; i <lsProduct.size() -1; i++){
			if (getProductItem(lsProduct.get(i)).getStatus() == ItemStatus.AVAILABLE){
			temp.add(getProductItem(lsProduct.get(i)));
			}
		}

		return temp;
	}

	public List<ProductItem> findAllProductsByStatus(ItemStatus selecteditemstatus, DataModel<ProductItem> products) {
		// TODO Auto-generated method stub
		List<ProductItem> temp = new ArrayList<>();
		Iterator<ProductItem> i = products.iterator();
		while (i.hasNext()){
			ProductItem p = i.next();
			if (p.getStatus() == selecteditemstatus){
			temp.add(p);
			}
		}
			//System.out.println(selecteditemstatus.name());
		return temp;
	}

	public List<ProductItem> findAllProductsByCategory(Category selecteditemcategory, DataModel<ProductItem> products) {
		// TODO Auto-generated method stub
		List<ProductItem> temp = new ArrayList<>();
		Iterator<ProductItem> i = products.iterator();
		while (i.hasNext()){
			ProductItem p = i.next();
			if (p.getCategory() == selecteditemcategory){
			temp.add(p);
			}
		}
			//System.out.println(selecteditemstatus.name());
		return temp;
	}
}


