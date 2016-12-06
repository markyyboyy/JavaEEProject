/**
 * @author Mark Freeman
 */
package Controllers;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "product", eager = true)
public class Product {
	
	private com.qac.row5project.entities.Product product;

	public com.qac.row5project.entities.Product getProduct() {
		return product;
	}

	public void setProduct(com.qac.row5project.entities.Product product) {
		this.product = product;
	}
	
}