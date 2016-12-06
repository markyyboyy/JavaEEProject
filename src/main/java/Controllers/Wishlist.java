
package Controllers;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.services.WishlistService;
/**
 * @author Mark Freeman
 */
@ManagedBean(name = "wishlistTest", eager = true)
public class Wishlist {
	@Inject 
	private WishlistService service;
	private List<ProductItemTest> wishlist = new ArrayList<ProductItemTest>();
	{
		wishlist.add(new ProductItemTest("A Gnome"));
		System.out.println("gnome");
	}
//	ArrayList<Product> items = new ArrayList<Product>();
//	private List<Product> products;
   public Wishlist() {
   }
   
   public String getDescription() {		//Returns a wishlist items description.
      return "This gnome is tired. He is sleeping. Not suitable for guarding purposes.";
   }
   public List<ProductItemTest> getWishlist() {		//Returns a wishlist items title.
	  // wishlist2 = service.listProducts();
		return wishlist;
	   }
   public String getImage() {		//Returns a wishlist items image.
	      return "featuregnome2.jpg";
	   }
}