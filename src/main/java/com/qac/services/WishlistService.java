package com.qac.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.managers.WishlistManager;
import com.qac.row5project.managers.offline.WishlistManagerOffline;

@Stateless

public class WishlistService {
	@Inject
	private WishlistManager manager = new WishlistManagerOffline();
	private List<Product> listProducts(){
		return manager.readWishlist().getProducts();
	}
}
