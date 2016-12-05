package com.qac.row5project.managers;

import java.util.ArrayList;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.WishList;

public interface WishlistManager {
	//CREATE - INVENTORY MANAGER
	public WishList createWishlist(WishList w);
	
	//UPDATE - INVENTORY MANAGER
	public WishList updateWishlist(WishList w);
	
	//READ - CUSTOMER/INVENTORY MANAGER
	public WishList readWishlist();
	
	
}
