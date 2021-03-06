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
	public List<Product> findWishList(long id)
	{
		return manager.findByCustomerId(id);
	}
	public void updateWishlist(long id,List<Product> w)
	{
		manager.updateWishlist(id, w);
	}
}
