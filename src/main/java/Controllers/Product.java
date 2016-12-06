/**
 * @author Mark Freeman
 */
package Controllers;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "product", eager = true)
public class Product {
   public Product() {
      System.out.println("Product started!");
   }
	
   public String getDescription() {		//Returns a wishlist items description.
	      return "This gnome is tired. He is sleeping. Not suitable for guarding purposes.";
	   }
	   public String getTitle() {		//Returns a wishlist items title.
		      return "Sleeping Gnome";
		   }
	   /*public String getImage() {		//Returns a wishlist items image.
		      return "img/featuregnome2.jpg";
		   }*/
}