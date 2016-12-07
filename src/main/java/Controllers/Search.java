package Controllers;

import java.util.List;
import javax.enterprise.context.RequestScoped;
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
	
	
	private String term;

	public String search() {
		List<ProductItem> results = searchService.searchBy(term);

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
