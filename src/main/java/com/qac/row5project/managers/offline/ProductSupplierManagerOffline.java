package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.ProductSupplier;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.ProductSupplierManager;

import java.util.ArrayList;
import java.util.List;

/** 
 * 
 * @author Richard Allen & Ynyr Williams 
 *
 */

@Stateless
@Default
public class ProductSupplierManagerOffline implements ProductSupplierManager{
	
	@Inject
	private TestData testData;
	
	//CREATE - INVENTORY MANAGER ONLY
	@Override
	public void createProductSupplier(ProductSupplier newSSP){
		ArrayList<ProductSupplier> SSPOrders = testData.getProductSupplier();
		SSPOrders.add(newSSP);
		testData.setProductSupplier(SSPOrders);
	}
	
	//READ - INVENTORY MANAGER ONLY
	@Override
	public ProductSupplier readProductSupplierByProductID(int pID){
		for (ProductSupplier SSP : testData.getProductSupplier()) {
			if (SSP.getProduct().getProductId() == pID) {
				return SSP;
			}
		}
		return null;
		
	}
	
	@Override
	public ProductSupplier readProductSupplierBySupplierID(int sID){
		for (ProductSupplier SSP : testData.getProductSupplier()) {
			if (SSP.getSupplier().getIdSupplier() == sID) {
				return SSP;
			}
		}
		return null;
		
	}

}