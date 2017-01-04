package Controllers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.Category;
import com.qac.row5project.entities.ItemStatus;
import com.qac.row5project.entities.Supplier;
import com.qac.row5project.helpers.ProductItem;
import com.qac.services.ProductService;
import com.qac.services.SupplierService;

@Named("supplier")
@RequestScoped

public class SupplierController {
	@Inject
	private SupplierService supplierService;
	private String error = "";
	private List<Supplier> supplier = new ArrayList<Supplier>();
	public String getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}
	private String supplierID;
	public void searchByID(){
		System.out.println("Search By ID");
		supplier = supplierService.getByID(supplierID);
		setSupplier(supplier);
	}
	public List<Supplier> getSupplier() {
		if (supplier.size() == 0){
			System.out.println("printed 0");
			this.supplier = supplierService.getSuppliers();
		}
		return supplier;
	}
	public void setSupplier(List<Supplier> supplier) {
		if (supplier == null || supplier.size() == 0){
			if (supplier == null){
				setError("ID has not been found");
			}
			this.supplier = supplierService.getSuppliers();
		}
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
