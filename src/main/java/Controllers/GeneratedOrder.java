package Controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.Stock;
import com.qac.services.Generate;

@Named("generated")
@RequestScoped
public class GeneratedOrder {
	@Inject
	private Generate generateService;
	private String ProductID;
	private List<Stock> stockItems;
	private List<com.qac.row5project.entities.Product> productItems = new ArrayList<com.qac.row5project.entities.Product>();
	private List<String> products = new ArrayList<String>();
	List<Integer> suggestedQuanity = new ArrayList<Integer>();
	
	public List<Stock> getStockItems() {
		return generateService.getStock();
	}

	public List<com.qac.row5project.entities.Product> getProductItems() {
		if (productItems.size() == 0){
				productItems = generateService.getProducts();
		}
		return productItems;
	}
	
	public void setProductItems(List<com.qac.row5project.entities.Product> productItems) {
		this.productItems = productItems;
	}
	public void addProductItem() {
		products.add(ProductID);
	}
	public List<Integer> getSuggestedQuanity(){
		if (suggestedQuanity.size() == 0){
		suggestedQuanity = generateService.getQuantities();
		}
		return suggestedQuanity;
	}
	public List<Integer> getSuggestedQuanitySorted(){
		Collections.sort(suggestedQuanity, (s1, s2) -> s1.intValue() - s2.intValue());
		return suggestedQuanity;
	}
	public List<com.qac.row5project.entities.Product> sortByQuantity(){
		Collections.sort(productItems, (s1, s2) -> s1.getQuantity() - s2.getQuantity());
		getSuggestedQuanitySorted();
		return productItems;
	}

	public String getProductID() {
		return ProductID;
	}

	public void setProductID(String productID) {
		ProductID = productID;
	}
	public void createOrder(){
		
	}
	public List<com.qac.row5project.entities.Product> unsort(){
		getSuggestedQuanity();
		productItems = generateService.getProducts();
		return productItems;
	}
	public void generateOrder(String poID){
		generateService.generateOrder(poID);
	}
}