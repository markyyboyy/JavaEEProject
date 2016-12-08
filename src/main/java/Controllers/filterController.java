package Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.services.SearchService;

import Controllers.session.SelectedProduct;

@Named("filter")
@RequestScoped
public class filterController {

	@Inject
	private SearchService searchService;
	@Inject
	private SelectedProduct selectedProduct;
	@Inject
	private Catalogue searchResults;
	
	
	private String sRatingFilter;
	
	
	
	
	

	public String getsRatingFilter() {
		return sRatingFilter;
	}

	public void setsRatingFilter(String sRatingFilter) {
		this.sRatingFilter = sRatingFilter;
	}


	private List<String> selectFilterItem;// = new ArrayList<SelectItem>();

	public List<String> getselectFilterItem() {
		return selectFilterItem;
	}

	public void setselectFilterItem(List<String> selectItem) {
		this.selectFilterItem = selectItem;
	}

	

	
	
	
	
	@PostConstruct
	public void init() {

		selectFilterItem = new ArrayList<String>();
		selectFilterItem.add("Price ASC");
		selectFilterItem.add("Price DECS");
		selectFilterItem.add("Rating ASC");
		selectFilterItem.add("Rating DECS");

		
		sRatingFilter = "4";
		
		
		
		
	}


}
