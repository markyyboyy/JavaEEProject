package com.qac.services;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.managers.WishlistManager;

@Stateless
public class ProductService {
@Inject
private WishlistManager wishlistManager;
public boolean validLogin(String email, String password) {
	Customer customer = customerManager.findByEmail(email.toLowerCase());
	return (customer.getPassword().equals(password))? true : false;
}

public Customer loginUser(String email) {
	return customerManager.findByEmail(email.toLowerCase());
}
}
