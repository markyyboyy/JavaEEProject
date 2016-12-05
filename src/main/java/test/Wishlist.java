
package test;
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
//	ArrayList<Product> items = new ArrayList<Product>();
//	private List<Product> products;
   public Wishlist() {
      System.out.println("HelloWorld started!");
   }

   public String getDescription() {		//Returns a wishlist items description.
      return "This gnome is tired. He is sleeping. Not suitable for guarding purposes.";
   }
   public String getTitle() {		//Returns a wishlist items title.
	 //     return items.get(0).getTitle();
	   return null;
	   }
   public String getImage() {		//Returns a wishlist items image.
	      return "img/featuregnome2.jpg";
	   }
}