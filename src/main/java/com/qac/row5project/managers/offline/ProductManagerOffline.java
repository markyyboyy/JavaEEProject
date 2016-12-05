/**
 * @Author RyanB (helper Ynyr)
 */
package com.qac.row5project.managers.offline;

import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.ProductManager;

@Stateless
@Default

public class ProductManagerOffline implements ProductManager {
	@Inject
	private TestData testData;

	// CREATE - INVENTORY MANAGER
	@Override
	//METHOD TO CREATE A NEW PRODUCT AND ADD IT TO A NEW PRODUCT LIST
	public void createProduct(Product p) {
		ArrayList<Product> pList = (ArrayList<Product>) testData.getProducts();
		p.setProductId(pList.size() + 1);
		pList.add(p);
		testData.setProducts(pList);
	}

	// UPDATE - INVENTORY MANAGER
	@Override
	//UPDATE A PRODUCT'S DETAILS BASED ON THE PRODUCT ITEM PASSED IN THE METHOD
	public void updateProduct(Product p) {
		ArrayList<Product> pList = (ArrayList<Product>) testData.getProducts();
		for (Product prod : pList)
			if (prod.getProductId() == p.getProductId())
				testData.setProducts(pList);
	}

	// READ - CUSTOMER/INVENTORY MANAGER
	@Override
	//RETURN PRODUCT BASED ON A SEARCH OF ID
	public Product readProductById(long id) {
		for (Product prod : testData.getProducts())
			if (prod.getProductId() == id)
				return prod;
		return null;
	}

	@Override
	//RETURN PRODUCT BASED ON A SEARCH OF NAME
	public Product readProductByName(String name) {
		for (Product prod : testData.getProducts())
			if (prod.getName() == name)
				return prod;
		return null;
	}

	@Override
	//RETURN PRODUCT LIST BASED ON COLOUR MATCH
	public ArrayList<Product> readProductByColour(String colour) {
		ArrayList<Product> pList = new ArrayList<Product>();
		for (Product prod : testData.getProducts()){
			if (prod.getColour() == colour)
				pList.add(prod);
		}
		return pList;
	}
}
