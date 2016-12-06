/***
 * 
 * @author Ynyr Williams
 *
 */package com.qac.row5project.managers.offline;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qac.row5project.entities.Stock;
import com.qac.row5project.entities.TestData;
import com.qac.row5project.managers.WishlistManager;

@Stateless
@Default

public class WishlistManagerOffline implements WishlistManager {
	@Inject
	private TestData testData;

	@Override
	public List<Stock> findByCustomerId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stock> readWishlist(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}