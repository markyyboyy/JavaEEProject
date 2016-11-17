package com.qac.row5project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "WishList")
class WishList {

	
	
	@Column(name = "customer id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	
	@Column(name = "stock id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long stockId;

	public WishList() {
	}

	public WishList(long customerId, long stockId) {
		this.customerId = customerId;
		this.stockId = stockId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getStockId() {
		return stockId;
	}

	public void setStockId(long stockId) {
		this.stockId = stockId;
	}

	@Override
	public String toString() {
		return "WishList [customerId=" + customerId + ", stockId=" + stockId + "]";
	}

}
