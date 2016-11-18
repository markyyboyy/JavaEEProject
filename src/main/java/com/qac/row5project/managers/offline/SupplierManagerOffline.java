package com.qac.row5project.managers.offline;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Supplier;
import com.qac.row5project.entities.TestData;

@Stateless
@Default

public class SupplierManagerOffline implements SupplierManger {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	@Override
	public Supplier createSupplier(Supplier supplier) {
		List<Supplier> s = testData.getSuppliers();
		s.setIdSupplier(s.size()+1);
		s.add(supplier);
		testData.setSuppliers(suppliers);
		return s;
		
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