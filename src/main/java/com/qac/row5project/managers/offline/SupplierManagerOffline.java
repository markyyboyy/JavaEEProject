package com.qac.row5project.managers.offline;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Supplier;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.SupplierManager;

/**
 * 
 * @author Iman Hassan
 *
 */
@Stateless
@Default

public class SupplierManagerOffline implements SupplierManager {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	/**
	 * creating a new supplier id
	 */
	@Override
	public Supplier createSupplier(Supplier supplier) {
		List<Supplier> s = testData.getSuppliers();
		supplier.setIdSupplier(s.size() +1);
		s.add(supplier);
		testData.setSuppliers(s);
		return supplier;
	}
		
		
	//READ - Inventory Manager Only
	/**
	 * reading a supplier by id
	 */
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