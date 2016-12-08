/**
 * @author RyanB
 */
package Controllers;

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

private List<ProductItem> lsProducts;
public DataModel<ProductItem> getProducts() {
	 	setProducts(productService.findAllProducts());
		if(lsProducts != null)
			return new ListDataModel<>(lsProducts);
		else {
			return null;}
		}
		public void setProducts(List<ProductItem> lsTemp)
		{
			this.lsProducts =lsTemp;
		}
}
