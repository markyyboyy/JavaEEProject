
package Controllers.session;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.qac.row5project.helpers.ProductItem;

/**
 * hols product user selected
 * 
 * @author Ynyr Williams
 *
 */
@SessionScoped
@Named("selected")
public class SelectedProduct implements Serializable {
	private static final long serialVersionUID = -1891410328473605505L;
	private ProductItem product;

	public ProductItem getProduct() { return product; }
	public void setProduct(ProductItem product) 
	{ 
		this.product = product; 
	}
}