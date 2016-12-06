/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.row5project.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "WishList")
public class WishList {
	private long customerId;

	private List<ProductItem> products = new ArrayList<>();
	public WishList() {
	}

	public WishList(long customerId) {
		this.customerId = customerId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public List<ProductItem> getProducts() {
		return products;
	}

	public void setProducts(List<ProductItem> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "WishList [customerId=" + customerId  + "]";
	}
}
