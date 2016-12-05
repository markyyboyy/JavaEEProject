package com.qac.row5project.managers.offline;


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
	
	//CREATE - Inventory Manager Only
	@Override
	public WishList createWishlist(WishList wishlist) {
<<<<<<< HEAD
		//ArrayList<WishList> s = testData.getWishlists();
		//s.add(wishlist);
		//testData.setWishlists(s);
		//return wishlist;
		return null;
=======
		List<WishList> s = testData.getWishlists();
		s.add(wishlist);
		testData.setWishlists(s);
		return wishlist;
>>>>>>> ab076522435c64e459a1d044d30bf581fe3f5fc0
	}
		
		
	//READ - Inventory Manager Only
	@Override
	public WishList readWishlist() {
		return testData.getWishlists().get(0);
	}

	//UODATE - Inventory Manager Only
	@Override
	public WishList updateWishlist(WishList w) {
		return null;
		
	}
		
	
	
}