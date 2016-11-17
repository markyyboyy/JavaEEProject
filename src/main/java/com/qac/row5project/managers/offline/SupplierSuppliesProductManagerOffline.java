package com.qac.row5project.managers.offline;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.managers.SupplierSuppliesProductManager;

import java.util.List;

@Stateless
@Default
public class SupplierSuppliesProductManagerOffline implements SupplierSuppliesProductManager{
	
	@Inject
	private TestData testData;
	
	//CREATE - INVENTORY MANAGER ONLY
	@Override
	public void createSupplierSuppliesProduct(Supplier_Supplies_Product newSSP){
		List<Supplier_Supplies_Product> SSPOrders = testData.getSupplierSuppliesProducts();
		SSPOrders.add(newSSP);
		testData.setSupplierSuppliesProducts(SSPOrders);
	}
	
	//READ - INVENTORY MANAGER ONLY
	@Override
	public Supplier_Supplies_Product readSupplierSuppliesProductByProductID(int pID){
		for (Supplier_Supplies_Product SSP : testData.getSupplierSuppliesProducts()) {
			if (SSP.getProduct().getProductId() == pID) {
				return SSP;
			}
			return null;
		}
	}
	
	@Override
	public Supplier_Supplies_Product readSupplierSuppliesProductBySupplierID(int sID){
		for (Supplier_Supplies_Product SSP : testData.getSupplierSuppliesProducts()) {
			if (SSP.getSupplier().getIdSupplier() == sID) {
				return SSP;
			}
			return null;
		}
	}

}