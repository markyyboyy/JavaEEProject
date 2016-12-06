/***
 * 
 * @author Ynyr Williams
 *
 */package com.qac.row5project.managers.offline;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

<<<<<<< HEAD
import com.qac.row5project.entities.Customer;
import com.qac.row5project.entities.Product;
=======
import com.qac.row5project.entities.Stock;
>>>>>>> f9d42f309a0b57702bb318e883d7088812bb4444
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.WishlistManager;

@Stateless
@Default

public class WishlistManagerOffline implements WishlistManager {
	@Inject
	private TestData testData;
<<<<<<< HEAD
	

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
=======

	@Override
	public List<Stock> findByCustomerId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stock> readWishlist(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
>>>>>>> f9d42f309a0b57702bb318e883d7088812bb4444
}