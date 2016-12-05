package com.qac.services;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.managers.ProductManager;
import com.qac.row5project.managers.StockManager;

@Stateless
public class ProductService {
	
	@Inject
	private ProductManager productManager;
	@Inject
	private StockManager stockManager;
	

	public Product readProductByName(String name) {
	try {
	return readProductById(Long.parseLong(name));
	
	} catch (Exception e) {
	return null;}
	}
		
	public Product readProductById(long id) {
		return productManager.readProductById(id);
		}
	
	public ArrayList<Product> readProductByColour(String colour){
		try {
			return productManager.readProductByColour(colour);
			} catch (Exception e) {
			return null;}
			}
	
	public Product getProduct(long id) {
		return getProductItem(productManager.findById(id), stockManager.findById(id));

	}
		
