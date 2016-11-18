package com.qac.row5project.managers.offline;
<<<<<<< HEAD
import java.util.List;
=======
import java.util.ArrayList;
import java.util.function.Supplier;
>>>>>>> 32fa9c675485d8d4859e125e690365570e290378

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

<<<<<<< HEAD
import com.qac.row5project.entities.Supplier;
import com.qac.row5project.entities.TestData;
=======
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.SupplierManager;
>>>>>>> 32fa9c675485d8d4859e125e690365570e290378

@Stateless
@Default

public class SupplierManagerOffline implements SupplierManager {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	@Override
<<<<<<< HEAD
	public Supplier createSupplier(Supplier supplier) {
		List<Supplier> s = testData.getSuppliers();
		s.setIdSupplier(s.size()+1);
		s.add(supplier);
		testData.setSuppliers(suppliers);
		return s;
=======
	public void createSupplier(Supplier supplier){
		ArrayList<Supplier> list = testData.getSuppliers();
>>>>>>> 32fa9c675485d8d4859e125e690365570e290378
		
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