package com.qac.services;

import java.util.List;

import com.qac.row5project.entities.Product;
import com.qac.row5project.managers.WishlistManager;
import com.qac.row5project.managers.offline.WishlistManagerOffline;

public class WishlistService {
	private WishlistManager manager = new WishlistManagerOffline();
	private List<Product> listProducts(){
		return manager.readWishlist().getProducts();
	}
}
