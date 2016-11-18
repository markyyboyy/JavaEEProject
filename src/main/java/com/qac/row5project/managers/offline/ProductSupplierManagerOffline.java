package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.ProductSupplier;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.SupplierSuppliesProductManager;

import java.util.List;

@Stateless
@Default
public class ProductSupplierManagerOffline implements SupplierSuppliesProductManager{
	
	@Inject
	private TestData testData;
	
	//CREATE - INVENTORY MANAGER ONLY
	@Override
	public void createProductSupplier(ProductSupplier newSSP){
		List<ProductSupplier> SSPOrders = testData.getProductSupplier();
		SSPOrders.add(newSSP);
		testData.setSupplierSuppliesProducts(SSPOrders);
	}
	
	//READ - INVENTORY MANAGER ONLY
	@Override
	public ProductSupplier readSupplierSuppliesProductByProductID(int pID){
		for (ProductSupplier SSP : testData.getSupplierSuppliesProducts()) {
			if (SSP.getProduct().getProductId() == pID) {
				return SSP;
			}
		}
		return null;
		
	}
	
	@Override
	public ProductSupplier readSupplierSuppliesProductBySupplierID(int sID){
		for (ProductSupplier SSP : testData.getSupplierSuppliesProducts()) {
			if (SSP.getSupplier().getIdSupplier() == sID) {
				return SSP;
			}
		}
		return null;
		
	}

}