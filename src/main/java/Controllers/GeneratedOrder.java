package Controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.entities.Stock;
import com.qac.services.Generate;

@Named("generated")
@RequestScoped
public class GeneratedOrder {
	@Inject
	private Generate generateService;
	private String ProductID;
	private List<Stock> stockItems;
	private List<ProductItem> productItems = new ArrayList<ProductItem>();
	private List<String> products = new ArrayList<String>();
	List<Integer> suggestedQuanity = new ArrayList<Integer>();
	
	public List<Stock> getStockItems() {
		return generateService.getStock();
	}

	public List<ProductItem> getProductItems() {
		//if (productItems.size() == 0){
				productItems = generateService.getProducts();
		//}
		return productItems;
	}
	
	public void setProductItems(List<ProductItem> productItems) {
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
	public List<ProductItem> sortByQuantity(){
		Collections.sort(productItems, (s1, s2) -> s1.getStockLevel() - s2.getStockLevel());
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
	public List<ProductItem> unsort(){
		getSuggestedQuanity();
		productItems = generateService.getProducts();
		return productItems;
	}
	public void generateOrder(String poID){
		generateService.generateOrder(poID);
	}
}