package com.qac.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.managers.GeneratedOrderManager;
import com.qac.row5project.managers.WishlistManager;
import com.qac.row5project.managers.offline.GeneratedOrderManagerOffline;
import com.qac.row5project.managers.offline.WishlistManagerOffline;

//@Stateless

//public class Generate {
	
	/*@Inject
	private GeneratedOrderManager manager = new GeneratedOrderManagerOffline();
	public List<Product> findWishList(long id)
	{
		return manager.findByCustomerId(id);
	}
	public void updateWishlist(long id,List<Product> w)
	{
		manager.updateWishlist(id, w);
	}
}*/