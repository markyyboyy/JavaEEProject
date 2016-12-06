package com.qac.row5project.managers.offline;


import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Stock;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.entities.WishList;
import com.qac.row5project.managers.WishlistManager;

@Stateless
@Default

public class WishlistManagerOffline implements WishlistManager {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	@Override
	public WishList createWishlist(WishList wishlist) {
		List<WishList> wishL = testData.getWishlists();
		wishL.add(wishlist);
		testData.setWishlists(s);
		return wishlist;
	}
		
	//READ - Inventory Manager Only
	@Override
	public WishList readWishlist() {
		return testData.getWishlists().get(0);
	}

	//UODATE - Inventory Manager Only
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