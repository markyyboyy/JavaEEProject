package com.qac.row5project.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import test.ProductItemTest;

@Entity
@Table(name = "WishList")
public class WishList {
	@Column(name = "customer id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;

	private List<ProductItemTest> products = new ArrayList<>();
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


	@Override
	public String toString() {
		return "WishList [customerId=" + customerId + ", stockId=" + stockId + "]";
	}

	public List<ProductItemTest> getProducts() {
		return products;
	}

	public void setProducts(List<ProductItemTest> products) {
		this.products = products;
	}

}
