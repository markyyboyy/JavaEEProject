package com.qac.row5project.managers.offline;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.Product;
import com.qac.row5project.helpers.*;
import com.qac.row5project.managers.WishlistManager;
/***
 * 
 * @author Ynyr Williams
 *
 */

@Stateless
@Default

public class WishlistManagerOffline implements WishlistManager {
	@Inject
	private TestData testData;

	//READ - Customer Only
	@Override
	public List<Product> findByCustomerId(long id) {
		List<Customer> custL = testData.getCustomers();
		for(Customer c: custL)
		{
			if(c.getID()==id)
			return c.getWishList();
		}
		return null;
	}
	//UODATE - Customer Only
	@Override
	public void updateWishlist(long id,List<Product> w) {
		List<Customer> custL = testData.getCustomers();
		for(Customer c: custL)
		{
			if(c.getID()==id){
				c.setWishList(w);
				return;
			}
		}
	}
}