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
import com.qac.row5project.entities.Rating;
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
	
	
	@Inject
	private Search conSearch;
	
	private PaginationHelper pagenationHelper;

	private DataModel<ProductItem> products = null;
	private List<ProductItem> productsResults = null;

	private ArrayList<SelectItem> selectItem = new ArrayList<SelectItem>();

	private String name;
	
	
	private double iAverage;

	public ArrayList<SelectItem> getSelectItem() {
		return selectItem;
	}

	public void setSelectItem(ArrayList<SelectItem> selectItem) {
		this.selectItem = selectItem;
	}

	public Catalogue() {
		selectItem.add(new SelectItem("Price ASC"));
		selectItem.add(new SelectItem("Price DECS"));
		selectItem.add(new SelectItem("Rating ASC"));
		selectItem.add(new SelectItem("Rating DECS"));
	}

	public String getName() {
		return this.name;
	}

	public void setName(String sName) {
		this.name = sName;
	}

	private void recreateModel() {
		products = null;
	}

	@SuppressWarnings("unchecked")
	public DataModel<ProductItem> getProducts() {


		setResults(searchService.searchBy(conSearch.getTerm()));
		
		return (ListDataModel<ProductItem>) getPagination().createPageDataModel();

	}

	public void search() {

		// products = searchService.searchBy(name);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void filter() {

		System.out.println(name);

	}

	public void sort() {

		selectItem = selectItem;

		switch ("") {
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
	private void sortByPrice(boolean asc) {

		if (asc)
			((List) products).sort(Comparator.comparing(ProductItem::getPrice));
		else
			((List) products).sort(Comparator.comparing(ProductItem::getPrice).reversed());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void sortByRating(boolean asc) {

		if (asc)
			((List) products).sort(Comparator.comparing(ProductItem::getAverageRating));
		else
			((List) products).sort(Comparator.comparing(ProductItem::getAverageRating).reversed());
	}

	public String view() {

		// return "catalogue/proudct.xhtml/faces-redirect=true&product=" +
		// product;
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
						return new ListDataModel<ProductItem>(
								productsResults.subList(getPageFirstItem(), getPageFirstItem() + getPageSize()));

					} catch (Exception e) {

						return new ListDataModel<ProductItem>(
								productsResults.subList(getPageFirstItem(), getItemsCount()));
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
	
	
	public void setResults(List<ProductItem> results){
		this.productsResults =  results;
		
		if(productsResults == null)
			productsResults = productService.findAllProducts();
		
	}
	

}