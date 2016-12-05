@Author "Mark Freeman"
package test;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "wishlist", eager = true)
public class WishlistItem {
   public WishlistItem() {
      System.out.println("HelloWorld started!");
   }
	
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