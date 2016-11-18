package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.function.Supplier;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.SupplierManager;

@Stateless
@Default

public class SupplierManagerOffline implements SupplierManager {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	@Override
	public void createSupplier(Supplier supplier){
		ArrayList<Supplier> list = testData.getSuppliers();
		
	}
		
		
	//READ - Inventory Manager Only
	@Override
	public Supplier readByIdSupplier(int idSupplier) {
		for (Supplier supplier : testData.getIdSupplier()) {
			if (supplier.getIdSupplier() == idSupplier) {
				return supplier;
			}
			return null;
		}
	}
		
	}
	
}