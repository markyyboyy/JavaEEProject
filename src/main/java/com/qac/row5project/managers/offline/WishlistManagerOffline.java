/***
 * 
 * @author Ynyr Williams
 *
 */package com.qac.row5project.managers.offline;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.entities.WishList;
import com.qac.row5project.managers.WishlistManager;

@Stateless
@Default

public class WishlistManagerOffline implements WishlistManager {
	@Inject
	private TestData testData;
	
	//CREATE - Customer Only
	@Override
	public WishList createWishlist(WishList wishlist) {
		List<WishList> wishL = testData.getWishlists();
		wishL.add(wishlist);
		testData.setWishlists(wishL);
		return wishlist;
	}
		
	//READ - Customer Only
	@Override
	public List<Product> findByCustomerId(long id); {
		List<WishList> wishL = testData.getWishlists();
		for(WishList wish: wishL)
		{
			if(wish.getCustomerId()==cID)
			return wish;
		}
		return null;
	}
	//UODATE - Customer Only
	@Override
	public void updateWishlist(WishList w) {
		List<WishList> wishL = testData.getWishlists();
		for(WishList wish: wishL)
		{
			if(wish.getCustomerId()==w.getCustomerId()){
				wish=w;
				testData.setWishlists(wishL);
				return;
			}
		}
	}	 
}