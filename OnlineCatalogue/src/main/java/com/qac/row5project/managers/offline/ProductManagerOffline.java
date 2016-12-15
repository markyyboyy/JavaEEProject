/**
 * @Author RyanB & Ynyr
 */
package com.qac.row5project.managers.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.TestDataCatalogue;
import com.qac.row5project.managers.ProductManager;

@Stateless
@Default

public class ProductManagerOffline implements ProductManager {
	@Inject
	private TestDataCatalogue testData;

	// CREATE - INVENTORY MANAGER
	@Override
	//METHOD TO CREATE A NEW PRODUCT AND ADD IT TO A NEW PRODUCT LIST
	public void createProduct(Product p) {
		List<Product> pList = (ArrayList<Product>) testData.getProducts();
		p.setProductID(pList.size() + 1);
		pList.add(p);
		testData.setProducts(pList);
	}

	// UPDATE - INVENTORY MANAGER
	@Override
	//UPDATE A PRODUCT'S DETAILS BASED ON THE PRODUCT ITEM PASSED IN THE METHOD
	public void updateProduct(Product p) {
		List<Product> pList = (List<Product>) testData.getProducts();
		for (Product prod : pList)
			if (prod.getProductID() == p.getProductID())
				testData.setProducts(pList);
	}

	// READ - CUSTOMER/INVENTORY MANAGER
	@Override
	//RETURN PRODUCT BASED ON A SEARCH OF ID
	public Product readProductById(long id) {
		for (Product prod : testData.getProducts()){
			if (prod.getProductID() == id){
				System.out.println("not Print null");
				return prod;
			}
		System.out.println(prod.getProductID());
		}
		System.out.println("id=" + id);
		System.out.println("Print null");
		return null;
	}

	@Override
	//RETURN PRODUCT BASED ON A SEARCH OF NAME
	public List<Product> readProductByName(String name) {
		List<Product> pList = new ArrayList<Product>();
		for (Product prod : testData.getProducts()){
			if (prod.getName().toLowerCase().contains(name.toLowerCase()))
				pList.add(prod);
		}
		return pList;
	}

	@Override
	//RETURN PRODUCT LIST BASED ON COLOUR MATCH
	public List<Product> readProductByColour(String colour) {
		List<Product> pList = new ArrayList<Product>();
		for (Product prod : testData.getProducts()){
			if (prod.getColour().contains(colour))
				pList.add(prod);
		}
		return pList;
	}

	@Override
	public List<Product> readProductByDescription(String desc) {
		List<Product> pList = new ArrayList<Product>();
		for (Product prod : testData.getProducts()){
			if (prod.getDesc().contains(desc))
				pList.add(prod);
		}
		return pList;
	}
	@Override
	public List<Product> findAllProducts() {
			return testData.getProducts();
	}
	@Override
	public int findsTotalStockLevel(List<Stock> stocks){
		int  tQuantity=0;
		for(Stock s:stocks)
		{
			tQuantity+=s.getQuantity();
		}
		return tQuantity;
	}
}
