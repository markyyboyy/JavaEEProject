package com.qac.row5project.managers;

import com.qac.row5project.entities.WishList;

public interface WishlistManager {
	//CREATE - INVENTORY MANAGER
	public WishList createWishlist(WishList w);
	
	//UPDATE - INVENTORY MANAGER
	public void updateWishlist(WishList w);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	public WishList readWishlist();
	
	
}
