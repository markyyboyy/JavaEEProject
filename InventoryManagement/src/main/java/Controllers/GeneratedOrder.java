package Controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.ProductItem;
import com.qac.row5project.helpers.ProductWrapper;
import com.qac.services.GenerateService;

/**
 * @author Mark Freeman
**/

@Named("generated")
@RequestScoped
public class GeneratedOrder {
	@Inject
	private GenerateService generateService;
	private String ProductID;
	private List<ProductWrapper> productItems = new ArrayList<ProductWrapper>();
	private List<String> productOrders = new ArrayList<String>();
	List<Integer> suggestedQuantity = new ArrayList<Integer>();
	List<Double> price = new ArrayList<Double>();
	/**
	 * This method returns a list of all of the products in the system.
	 * @return All of the products in the system.
	 */
	public List<ProductWrapper> getProductItems() {
		if (productItems.size() == 0){	//If we already have a list then the user called sort, so dont display the unsorted list.
				//productItems = generateService.getProducts();
				List<ProductItem> tmpList = generateService.getProducts();
				List<Integer> tmpSuggestions = generateService.getQuantities();
				for (int i = 0; i<tmpList.size();i++){
					productItems.add(i, new ProductWrapper(tmpList.get(i),tmpSuggestions.get(i)));
				}
		}
		return productItems;
	}
	/**
	 * This method is used to add a product that will be ordered.
	 */
	public void addProductItem() {
		productOrders.add(ProductID);
	}
	/**
	 * This method returns the product the user wanted to order.
	 * @return	The productID of the product the user wanted to order.
	 */
	public String getProductID() {
		return ProductID;
	}
	/**
	 * This method sets the product the user wanted to order.
	 * @param	The productID of the product the user wanted to order.
	 */
	public void setProductID(String productID) {
		ProductID = productID;
	}
	/**
	 * This method generates an order from a productID
	 * @param	The productID of the product the user wanted to order.
	 */
	public void generateOrder(){
		generateService.generateOrder(3,ProductID);
	}
}