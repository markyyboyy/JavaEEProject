package com.qac.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.managers.WishlistManager;
import com.qac.row5project.managers.offline.WishlistManagerOffline;

import test.ProductItemTest;

@Stateless

public class WishlistService {
	@Inject
	private WishlistManager manager = new WishlistManagerOffline();
	public List<ProductItemTest> listProducts(){
		List<ProductItemTest> products = manager.readWishlist().getProducts();
		return products;
	}
}
