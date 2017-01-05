/**
 * PRODUCTCONTROLLER ALLOWS THE INFORMATION TO BE GATHERED REGARDING INDIVIDUAL/GROUPS OF PRODUCTS
 @author RyanB
 */
package Controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.Category;
import com.qac.row5project.entities.ItemStatus;
import com.qac.row5project.helpers.ProductItem;
import com.qac.services.ProductService;

@Named("product")
@SessionScoped
public class Product implements Serializable{
	
@Inject
private ProductService productService;

private ItemStatus selecteditemstatus;

private String itemstatustring = "";

private Category selectedcategory;

private String itemcategorystring = "";

private DataModel<ProductItem> productItem;

private List<ProductItem> products1;

private DataModel<ProductItem> products;

private List<Category> categories;

private List<ItemStatus> status;

private ProductItem productToAdd = new ProductItem();

private String productID;


public void fetchProducts(){
	setProducts(productService.findAllProducts());
}


public ProductItem getProductToAdd() {
	return productToAdd;
}

public void setProductToAdd(ProductItem productToAdd) {
	this.productToAdd = productToAdd;
}

/**
 * FIND ALL PRODUCTS BY INVOKING FINDALLPRODUCTS() FROM THE PRODUCTSERVICE
 * @return DataModel<ProductItem>
 */

public DataModel<ProductItem> getProducts() {
		if(products == null){
		 	setProducts(productService.findAllProducts());
			System.out.println("SET ONCE");
			return products;
		}
		else {
			return products;
		}
}

		public void setCategories(List<Category> temp){
			this.categories = temp;
		}

/**
*FIND PRODUCTS BY THEIR CATEGORY 
** @param DataModel<String>
* @return ListDataModel<>
*/
		public DataModel<Category> getCategories(){

			
			List<ProductItem> lsTemp = productService.findAllProducts();			
			categories = new ArrayList<Category>();
			List<String> names = new ArrayList<String>();
			for (ProductItem productItem : lsTemp) {
				if(!names.contains(productItem.getCategory().toString())){
					categories.add(productItem.getCategory());
					names.add(productItem.getCategory().toString());
				}
			}
			
			return new ListDataModel<Category>(categories);
		}

		public ListDataModel<ItemStatus> getStatuses(){

			
			List<ProductItem> lsTemp = productService.findAllProducts();			
			status = new ArrayList<ItemStatus>();
			
			for (ProductItem productItem : lsTemp) {
					
				
				if(!lsTemp.contains(productItem.getStatus()))
					
					status.add(productItem.getStatus());
			}
			
			return new ListDataModel<ItemStatus>(status) ;
		}


		public void setProducts(List<ProductItem> lsTemp)
		{
				this.products = new ListDataModel<ProductItem>(lsTemp);
		}
		public void addProduct(){
			System.out.println(productToAdd.getName());
		}
		public void availableProducts(){
			getProducts();
			setProducts(productService.findAllProductsByStatus(selecteditemstatus,products));
		}
		public void categorisedProducts(){
			getProducts();
			setProducts(productService.findAllProductsByCategory(selectedcategory,products));
		}
		public String getItemstatustring() {
			if (itemcategorystring.equals("None") | itemcategorystring.equals("")){
				return "";
			}
			else{
			System.out.println("SET ONCE");
			//products = new ListDataModel<ProductItem>(productService.findAllProductsByStatus(selecteditemstatus, products));
			return itemstatustring;
			}
		}

		public void setItemstatustring(String itemstatustring) {
			if (itemstatustring.equals("None") | itemstatustring.equals("")){
			}
			else{
			System.out.println(itemstatustring);
			this.itemstatustring = itemstatustring;
			selecteditemstatus = ItemStatus.valueOf(itemstatustring.replaceAll(" ", "_").toUpperCase());
			System.out.println("SET ONCE");
			//setProducts(productService.findAllProductsByStatus(selecteditemstatus, products));
			}
		}

		public String getItemcategorystring() {
			if (itemcategorystring.equals("None") | itemcategorystring.equals("")){
				return "";
			}
			else{
				System.out.println("SET ONCE");
			//setProducts(productService.findAllProductsByCategory(selectedcategory));
			return itemcategorystring;
			}
		}

		public void setItemcategorystring(String itemcategorystring) {
			if (itemcategorystring.equals("None")){
				this.itemcategorystring = itemcategorystring;
			}
			else{
			this.itemcategorystring = itemcategorystring;
			selectedcategory = Category.valueOf(itemcategorystring.replaceAll(" ", "_").toUpperCase());
			System.out.println("SET ONCE");
			//setProducts(productService.findAllProductsByCategory(selectedcategory));
			}
		}
		
		public void findByID(){
			System.out.println(Long.parseLong(productID));
			List<ProductItem> temp = productService.findAllProducts();
			List<ProductItem> returnable = new ArrayList<ProductItem>();
			Iterator<ProductItem> t = temp.iterator();
			while (t.hasNext()){
				ProductItem item = t.next();
				System.out.println(item.getID());
				if ((int)item.getID() == (int)Long.parseLong(productID)){
					returnable.add(item);
					setProducts(returnable);
					System.out.println("matched");
					return;
				}
			}
			fetchProducts();
		}


		public String getProductID() {
			return productID;
		}

		public void setProductID(String productID) {
			this.productID = productID;
		}
}
