package Controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.Product;
import com.qac.row5project.helpers.*;
import com.qac.row5project.helpers.PaginationHelper;
import com.qac.services.ProductService;

@Named("Catalogue")
@ConversationScoped
public class Catalogue implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ProductService productService;

	private PaginationHelper pagenationHelper;

	private DataModel<Product> products = null;
	
	private String sortBy;
	
	private String name;
	

	public String getName(){
		return this.name;
	}
	
	
	public void setName(String sName){
		this.name = sName;
	}
	
	
	private void recreateModel() {
		products = null;
	}

	public DataModel<Product> getProducts() {

		System.out.println("djgkdfh");
		return (DataModel<Product>) getPagination().createPageDataModel();

	}
	
	public void search(){
		
	}
	
	public void filer(){
		
		productService.readProductByName(name);
		
	}
	
	
	public String view(){
		
		//return "catalogue/proudct.xhtml/faces-redirect=true&product=" + product;
		return "";
		
	}
	
	

	public PaginationHelper getPagination() {
		if (pagenationHelper == null) {

			pagenationHelper = new PaginationHelper(4) {

				@Override
				public int getItemsCount() {
					return productService.findAllProducts().size();
				}

				@Override
				public DataModel<Product> createPageDataModel() {

					try {

						List<Product> lstAll = productService.findAllProducts();

						return new ListDataModel<Product>(
								lstAll.subList(getPageFirstItem(), getPageFirstItem() + getPageSize()));

					} catch (Exception e) {

						return new ListDataModel<Product>(
								productService.findAllProducts().subList(getPageFirstItem(), getItemsCount()));
					}

				}

			};

		}

		return pagenationHelper;
	}

	public String next() {

		getPagination().nextPage();
		recreateModel();

		return "catalogue";
	}

	public String previous() {

		getPagination().previousPage();
		recreateModel();

		return "catalogue";
	}

}