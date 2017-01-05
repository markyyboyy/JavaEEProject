package Controllers;

import java.io.Serializable;

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
public class CustomerOrderController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private CustomerOrderManager coManager;
	
	

}
