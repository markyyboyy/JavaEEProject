import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("wishlist")
@SessionScoped
public class Wishlist implements
	Serializable {
		private String description = "This is a gnome";
		public String getDescription() {
			return description;
		}
		public void setCustomer(String description)
		{
			this.description = description;
		}
}
