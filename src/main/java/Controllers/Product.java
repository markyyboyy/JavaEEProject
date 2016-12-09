/**
 * @author RyanB
 */
package Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.ProductItem;
import com.qac.services.ProductService;

@Named("product")
@RequestScoped
public class Product {
	
@Inject
private ProductService productService;

private DataModel<ProductItem> productItem;

private List<ProductItem> products;

private List<String> categories;



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
			
			System.out.println("Going in here " + lsTemp.get(0).getCategory());
			this.products =lsTemp;
		}
}
