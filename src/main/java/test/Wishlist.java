@Author "Mark Freeman"
package test;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "wishlist", eager = true)
public class Wishlist {
	ArrayList<WishlistItem> items = new ArrayList<WishlistItem>();
   public Wishlist() {
      System.out.println("HelloWorld started!");
   }
	public ArrayList<WishlistItem> getList(){
		return items;
		
	}
	public WishlistItem 
   public String getDescription() {
      return "This gnome is tired. He is sleeping. Not suitable for guarding purposes.";
   }
   public String getTitle() {
	      return "Sleeping Gnome";
	   }
   public String getImage() {
	      return "img/featuregnome2.jpg";
	   }
}