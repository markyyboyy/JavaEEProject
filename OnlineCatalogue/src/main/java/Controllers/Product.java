/**
 * PRODUCTCONTROLLER ALLOWS THE INFORMATION TO BE GATHERED REGARDING INDIVIDUAL/GROUPS OF PRODUCTS
 @author RyanB
 */
package Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.helpers.ProductItem;
import com.qac.services.ProductService;

@Named("product")
@RequestScoped
public class Product {
	
@Inject
private ProductService productService;

private DataModel<ProductItem> productItem;

private List<ProductItem> products;

private List<String> categories;



/**
 * FIND ALL PRODUCTS BY INVOKING FINDALLPRODUCTS() FROM THE PRODUCTSERVICE
 * @return DataModel<ProductItem>
 */

public DataModel<ProductItem> getProducts() {
	 	setProducts(productService.findAllProducts());
	 
		if(products != null)
			return new ListDataModel<>(products);
		else {
			return null;}
		}

		public void setCategories(List<String> temp){
			this.categories = temp;
		}

/**
*FIND PRODUCTS BY THEIR NAME 
** @param DataModel<String>
* @return ListDataModel<>
*/
		public DataModel<String> getCategories(){
			
			List<ProductItem> lsTemp = productService.findAllProducts();			
			categories = new ArrayList<>();
			
			for (ProductItem productItem : lsTemp) {
					
				
				if(!lsTemp.contains(productItem.getCategory()))
					
					categories.add(productItem.getCategory());
			}
			
			return new ListDataModel<>(categories) ;
		}



		public void setProducts(List<ProductItem> lsTemp)
		{
			
				this.products =lsTemp;
		}
}
