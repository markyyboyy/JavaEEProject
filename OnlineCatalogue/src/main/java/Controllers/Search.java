package Controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.helpers.ProductItem;
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

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String mixPrice) {
		this.minPrice = mixPrice;
	}

	private String maxPrice;
	private String minPrice;

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
	public void init() {

		selectFilterRating = new ArrayList<String>();
		selectFilterRating.add("Rating");
		selectFilterRating.add("1");
		selectFilterRating.add("2");
		selectFilterRating.add("3");
		selectFilterRating.add("4");
		selectFilterRating.add("5");

		sRatingFilter = "Rating";

	}

	/*
	 * public void sortBy(ValueChangeEvent e) {
	 * 
	 * String sValue = e.getNewValue().toString(); System.out.println(sValue);
	 * sRatingFilter = sValue;
	 * 
	 * List<ProductItem> temp = searchService.search("",
	 * Integer.valueOf(sValue), -1);
	 * 
	 * searchResults.setResults(temp); try {
	 * FacesContext.getCurrentInstance().getExternalContext().redirect(
	 * "catalogue.xhtml"); } catch (IOException e1) { // TODO Auto-generated
	 * catch block e1.printStackTrace(); }
	 * 
	 * 
	 * System.out.println(temp);
	 * 
	 * }
	 */

	public String submit() {
		return "catalogue";
	}

	public int toInt(String sRating) {

		try {
			
			if (sRating == null) {
				sRatingFilter = "Rating";
				return -1;			
			}
			
			return Integer.parseInt(sRating);

		} catch (NumberFormatException ex) {

			sRatingFilter = "Rating";
			return -1;
		}

	}

	public String search() {
		double dMinPrice = 0, dMaxPrice = 0;

		try {

			if (minPrice != null)
				dMinPrice = Double.parseDouble(minPrice);

			if (maxPrice != null)
				dMaxPrice = Double.parseDouble(maxPrice);

		} catch (NumberFormatException ex) {

		}

		List<ProductItem> results = searchService.search(term, toInt(sRatingFilter), dMinPrice, dMaxPrice);
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
