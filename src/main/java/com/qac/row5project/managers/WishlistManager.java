/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.row5project.managers;
import java.util.List;

import com.qac.row5project.entities.Stock;

public interface WishlistManager {
	//UPDATE - INVENTORY MANAGER
	public List<Stock> findByCustomerId(long id);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	public List<Stock> readWishlist(long id);
	
}
