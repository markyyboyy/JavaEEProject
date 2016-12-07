package com.qac.row5project.managers;

	import java.util.List;
	import com.qac.row5project.entities.Product;
	import com.qac.row5project.entities.PurchaseOrder;
import com.qac.row5project.entities.Stock;

	public interface  GeneratedOrderManager {
		//CREATE
		public PurchaseOrder createOrder();
		
		//UPDATE
		public void updateProduct(PurchaseOrder p);
		
		//READ
		public List<Stock> readOrderByQuantity();

		public List<Integer> getQuantities();
	}
