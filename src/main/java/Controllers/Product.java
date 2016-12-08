/**
 * @author RyanB
 */
package Controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.ProductItem;
import com.qac.services.ProductService;

@Named("product")
@RequestScoped
public class Product {
	
@Inject
private ProductService productService;


public List<ProductItem> findAll() {
	List<ProductItem> p = productService.findAllProducts();
		if(p != null)
			return p;
		else {
			return null;}
		}
			
			
}