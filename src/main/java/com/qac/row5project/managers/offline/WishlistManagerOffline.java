package com.qac.row5project.managers.offline;

import java.util.ArrayList;

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
		ArrayList<WishList> s = testData.getWishlists();
		s.add(wishlist);
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
	public WishList updateWishlist(WishList w) {
		return null;
		
	}
		
	
	
}