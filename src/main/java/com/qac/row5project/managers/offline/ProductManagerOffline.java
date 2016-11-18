package com.qac.row5project.managers.offline;

import java.util.List;

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
	public void createProduct(Product p) {
		List<Product> pList = testData.getProducts();
		p.setProductId(pList.size() + 1);
		pList.add(p);
		testData.setProducts(pList);
	}

	// UPDATE - INVENTORY MANAGER
	@Override
	public void updateProduct(Product p) {
		List<Product> pList = testData.getProducts();
		for (Product prod : pList)
			if (prod.getProductId() == p.getProductId())
				testData.setProducts(pList);
	}

	// READ - CUSTOMER/INVENTORY MANAGER
	@Override
	public Product readProductById(long id) {
		for (Product prod : testData.getProducts())
			if (prod.getProductId() == id)
				return prod;
		return null;
	}

	@Override
	public Product readProductByName(String name) {
		for (Product prod : testData.getProducts())
			if (prod.getName() == name)
				return prod;
		return null;
	}

	@Override
	public Product readProductByColour(String colour) {
		for (Product prod : testData.getProducts())
			if (prod.getColour() == colour)
				return prod;
		return null;
	}
}
