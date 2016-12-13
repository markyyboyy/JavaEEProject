package com.qac.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Supplier;
import com.qac.row5project.managers.SupplierManager;
@Stateless
public class SupplierService {
@Inject
SupplierManager supplierManager;
	public List<Supplier> getSuppliers() {
		// TODO Auto-generated method stub
		return supplierManager.getSuppliers();
	}

}
