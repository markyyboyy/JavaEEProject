package Controllers;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.managers.CustomerOrderManager;

/**
 * 
 * @author Richard Allen
 *
 */

@Named("customerOrder")
@SessionScoped
public class CustomerOrderController {
	
	@Inject
	private CustomerOrderManager coManager;
	
	

}
