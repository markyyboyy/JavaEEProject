package Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
import javax.inject.Named;
import com.qac.row5project.entities.ProductItem;
import com.qac.services.SearchService;
import Controllers.session.SelectedProduct;

/**
 * This controller operates similarly to the browse controller but for the
 * search results as opposed to the full catalogue
 * 
 * @author Ynyr Williams
 *
 */

@Named("search")
@RequestScoped
public class Search {
	@Inject
	private SearchService searchService;
	@Inject
	private SelectedProduct selectedProduct;
	@Inject
	private Catalogue searchResults;
	
	private String term = "";
	private String sRatingFilter;	
	private List<String> selectFilterRating;// = new ArrayList<SelectItem>();

	public List<String> getSelectFilterRating() {
		return selectFilterRating;
	}

	public void setSelectFilterItem(List<String> selectFilterRating) {
		this.selectFilterRating = selectFilterRating;
	}
	public String getsRatingFilter() {
		return sRatingFilter;
	}

	public void setsRatingFilter(String sRatingFilter) {
		this.sRatingFilter = sRatingFilter;
	}
	
	@PostConstruct
	public void init(){	
		
		selectFilterRating = new ArrayList<String>();
		selectFilterRating.add("1");
		selectFilterRating.add("2");
		selectFilterRating.add("3");
		selectFilterRating.add("4");
		selectFilterRating.add("5");
		
		sRatingFilter = "4";

	}
	
	public void sortBy(ValueChangeEvent e) {		
		
		String sValue = e.getNewValue().toString();
		System.out.println(sValue);
		sRatingFilter = sValue;
		
		List<ProductItem> temp = searchService.search("", Integer.valueOf(sValue), -1);
		
		searchResults.setResults(temp);
		
		System.out.println(temp);
		
	}

	
	

	
	
	public String search() {
		List<ProductItem> results = searchService.searchBy(term);
		System.out.println("Searched for term " + term);
		if (results != null)
			if (results.size() == 1) {
				selectedProduct.setProduct(results.get(0));
				return "product";
			} else {
				searchResults.setResults(results);
				return "catalogue";
			}
		
		
		return "catalogue";
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}
}
