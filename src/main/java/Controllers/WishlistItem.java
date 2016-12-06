/**
 * @author Mark Freeman
 */
package Controllers;
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@Named ("wishlist")
@RequestScoped
public class WishlistItem implements Serializable{
	private String image = "img/featuregnome2.jpg";
   public WishlistItem() {
      System.out.println("HelloWorld started!");
   }
   private List<ProductItemTest> wishlist;
   public String getDescription() {		//Returns a wishlist items description.
	      return "This gnome is tired. He is sleeping. Not suitable for guarding purposes.";
	   }
	   public String getTitle() {		//Returns a wishlist items title.
		      return "Sleeping Gnome";
		   }
	   public String getImage() {		//Returns a wishlist items image.
		      return image;
		   }
	public List<ProductItemTest> getWishlist() {
		return wishlist;
	}
	public void setWishlist(List<ProductItemTest> wishlist) {
		this.wishlist = wishlist;
	}
}