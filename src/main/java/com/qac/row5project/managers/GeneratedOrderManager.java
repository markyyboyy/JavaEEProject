package com.qac.row5project.managers;

	import java.util.List;
	import com.qac.row5project.entities.Product;
	import com.qac.row5project.entities.PurchaseOrder;

	public interface  GeneratedOrderManager {
		//CREATE
		public void createOrder(PurchaseOrder p);
		
		//UPDATE - INVENTORY MANAGER
		public void updateProduct(PurchaseOrder p);
		
		//READ - CUSTOMER/INVENTORY MANAGER
		public List<Product> readOrderByQuantity(String name);
		public List<Product> readOrderByPrice(String name);
	}
