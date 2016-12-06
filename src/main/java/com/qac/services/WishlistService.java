package com.qac.services;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.qac.row5project.managers.WishlistManager;
import com.qac.row5project.managers.offline.WishlistManagerOffline;

@Stateless

public class WishlistService {
	@Inject
	private WishlistManager manager = new WishlistManagerOffline();
	/*public List<ProductItem> listProducts(){
		List<ProductItem> products = manager.
		return products;
	}*/
}
