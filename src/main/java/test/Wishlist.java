/**
 * @author Mark Freeman
 */
package test;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "wishlist", eager = true)
public class Wishlist {
	ArrayList<WishlistItem> items = new ArrayList<WishlistItem>();
   public Wishlist() {
      System.out.println("HelloWorld started!");
   }
	public ArrayList<WishlistItem> getList(){	//Returns a users wishlist.
		return items;
		
	}
   public String getDescription() {		//Returns a wishlist items description.
      return "This gnome is tired. He is sleeping. Not suitable for guarding purposes.";
   }
   public String getTitle() {		//Returns a wishlist items title.
	      return "Sleeping Gnome";
	   }
   public String getImage() {		//Returns a wishlist items image.
	      return "img/featuregnome2.jpg";
	   }
}