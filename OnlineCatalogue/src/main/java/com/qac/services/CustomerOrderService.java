package com.qac.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.row5project.managers.CustomerOrderManager;
import Controllers.session.CurrentUser;

/**
 * 
 * @author Richard Allen
 *
 */

@Stateless
public class CustomerOrderService {
	@Inject
	private CustomerOrderManager coManager;
	
	@Inject
	private CurrentUser cU;
	
	private List<CustomerOrder> coList;
	
	
	
}
