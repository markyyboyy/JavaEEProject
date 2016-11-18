package com.qac.row5project.managers.offline;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Supplier;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.SupplierManager;


@Stateless
@Default

public class SupplierManagerOffline implements SupplierManager {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	@Override
	public Supplier createSupplier(Supplier supplier) {
		ArrayList<Supplier> s = testData.getSuppliers();
		supplier.setIdSupplier(s.size() +1);
		s.add(supplier);
		testData.setSuppliers(s);
		return supplier;
	}
		
		
	//READ - Inventory Manager Only
	@Override
	public Supplier readByIdSupplier(int idSupplier) {
		for (Supplier supplier : testData.getSuppliers()) {
			if (supplier.getIdSupplier() == idSupplier) {
				return supplier;
			}
			
		}
		return null;
	}
		
	
	
}