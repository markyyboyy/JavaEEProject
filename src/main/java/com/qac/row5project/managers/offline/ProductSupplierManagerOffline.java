package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.ProductSupplier;
import com.qac.row5project.helpers.*;
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
	/** 
	 * 
	 * @author Richard Allen
	 * Create new supplier with an ID 
	 * 
	 */
	@Override
	public void createProductSupplier(ProductSupplier newSSP){
		List<ProductSupplier> SSPOrders = testData.getProductSupplier();
		SSPOrders.add(newSSP);
		testData.setProductSupplier(SSPOrders);
	}
	
	//READ - INVENTORY MANAGER ONLY
	/** 
	 * 
	 * @author Richard Allen
	 * @return supplier by product ID
	 */
	@Override
	public ProductSupplier readProductSupplierByProductID(int pID){
		for (ProductSupplier SSP : testData.getProductSupplier()) {
			if (SSP.getProduct().getProductID() == pID) {
				return SSP;
			}
		}
		return null;
		
	}
	
	/** 
	 * 
	 * @author Richard Allen
	 * @return Supplier by supplier ID
	 */
	@Override
	public ProductSupplier readProductSupplierBySupplierID(int sID){
		for (ProductSupplier SSP : testData.getProductSupplier()) {
			if (SSP.getSupplier().getID() == sID) {
				return SSP;
			}
		}
		return null;
		
	}

}