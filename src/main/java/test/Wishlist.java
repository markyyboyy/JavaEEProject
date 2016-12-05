
package test;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import com.qac.services.WishlistService;
/**
 * @author Mark Freeman
 */
@ManagedBean(name = "wishlist", eager = true)
public class Wishlist {
	@Inject 
	private WishlistService service;
	private List<ProductItemTest> wishlist;
//	ArrayList<Product> items = new ArrayList<Product>();
//	private List<Product> products;
   public Wishlist() {
      System.out.println("HelloWorld started!");
   }

   public String getDescription() {		//Returns a wishlist items description.
      return "This gnome is tired. He is sleeping. Not suitable for guarding purposes.";
   }
   public List<ProductItemTest> getTitle() {		//Returns a wishlist items title.
	 //     return items.get(0).getTitle();
	   wishlist = service.listProducts();
		return wishlist;
	   }
   public String getImage() {		//Returns a wishlist items image.
	      return "img/featuregnome2.jpg";
	   }
}