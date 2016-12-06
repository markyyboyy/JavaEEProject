/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.row5project.managers;
import java.util.List;

import com.qac.row5project.entities.Product;

public interface WishlistManager {
	
	//CUSTOMER ONLY
	public List<Product> findByCustomerId(long id);
	
	//CUSTOMER ONLY
	public void updateWishlist(long id, List<Product> wishList);
	
}
