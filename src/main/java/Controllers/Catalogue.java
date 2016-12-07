package Controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.helpers.*;
import com.qac.row5project.helpers.PaginationHelper;
import com.qac.services.ProductService;
import com.qac.services.SearchService;

@Named("Catalogue")
@ConversationScoped
public class Catalogue implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ProductService productService;

	
	@Inject
	private SearchService searchService;
	
	private PaginationHelper pagenationHelper;

	private DataModel<ProductItem> products = null;
	
	private ArrayList<SelectItem> selectıtem = new ArrayList<SelectItem>();
	
	private String name;
	
	public ArrayList<SelectItem> getSelectıtem() {
	    return selectıtem;
	}

	public void setSelectıtem(ArrayList<SelectItem> selectıtem) {
	    this.selectıtem = selectıtem;
	}

	
	public Catalogue(){
		   selectıtem.add(new SelectItem("Price ASC"));
		    selectıtem.add(new SelectItem("Price DECS"));
		   selectıtem.add(new SelectItem("Rating ASC"));
		    selectıtem.add(new SelectItem("Rating DECS"));
	}
	
	
	public String getName(){
		return this.name;
	}
	
	
	public void setName(String sName){
		this.name = sName;
	}
	
	
	private void recreateModel() {
		products = null;
	}

	public DataModel<ProductItem> getProducts() {

		System.out.println("djgkdfh");
		return (DataModel<ProductItem>) getPagination().createPageDataModel();

	}
	
	public void search(){
		
		//products = searchService.searchBy(name);
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void filter(){
		
		List list = new ArrayList<>();
		list.add(productService.readProductByName(name));		
		products = (DataModel<ProductItem>) list; 
		
	}
	
	
	public void sort(){		
		
		selectıtem = selectıtem;
				
		switch(""){		
			case "sortByPriceA":
				sortByPrice(false);
				break;
		
			case "sortByPriceD":
				sortByPrice(true);
				break;			
			case "sortByRatingA":
				sortByRating(false);
				break;			
			case "sortByRatingD":
				sortByRating(true);
				break;		
		}
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void sortByPrice(boolean asc){
	
		if(asc)
			((List) products).sort(Comparator.comparing(Product::getPrice));
		else
			((List) products).sort(Comparator.comparing(Product::getPrice).reversed());	
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void sortByRating(boolean asc){
		
		if(asc)
			((List) products).sort(Comparator.comparing(Product::getName));
		else
			((List) products).sort(Comparator.comparing(Product::getName).reversed());	
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
				public DataModel<ProductItem> createPageDataModel() {

					try {

						List<ProductItem> lstAll = productService.findAllProducts();

						return new ListDataModel<ProductItem>(
								lstAll.subList(getPageFirstItem(), getPageFirstItem() + getPageSize()));

					} catch (Exception e) {

						return new ListDataModel<ProductItem>(
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