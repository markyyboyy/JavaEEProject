package com.qac.row5project.managers;

	import java.util.List;
	import com.qac.row5project.entities.Product;
	import com.qac.row5project.entities.PurchaseOrder;
import com.qac.row5project.entities.Stock;

	public interface  GeneratedOrderManager {
		//CREATE
		public void createOrder(PurchaseOrder p);
		
		//UPDATE - INVENTORY MANAGER
		public void updateProduct(PurchaseOrder p);
		
		//READ - CUSTOMER/INVENTORY MANAGER
		public List<Stock> readOrderByQuantity();
	}