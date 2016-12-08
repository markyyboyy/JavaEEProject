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

	private List<String> selectFilterItem;// = new ArrayList<SelectItem>();

	public List<String> getselectFilterItem() {
		return selectFilterItem;
	}

	public void setselectFilterItem(List<String> selectItem) {
		this.selectFilterItem = selectItem;
	}

	
	private List<String> selectFilterRating;// = new ArrayList<SelectItem>();

	public List<String> getSelectFilterRating() {
		return selectFilterRating;
	}

	public void setSelectFilterItem(List<String> selectFilterRating) {
		this.selectFilterRating = selectFilterRating;
	}

	
	
	
	
	@PostConstruct
	public void init() {

		selectFilterItem = new ArrayList<String>();
		selectFilterItem.add("Price ASC");
		selectFilterItem.add("Price DECS");
		selectFilterItem.add("Rating ASC");
		selectFilterItem.add("Rating DECS");
		
		selectFilterRating = new ArrayList<String>();
		selectFilterRating.add("1");
		selectFilterRating.add("2");
		selectFilterRating.add("3");
		selectFilterRating.add("4");
		selectFilterRating.add("5");

		
		
		
		
		
		
	}

	public void sortBy(ValueChangeEvent e) {

		
		System.out.println("Within the Sort");
		
		
	}

}
