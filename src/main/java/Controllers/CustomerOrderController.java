/**
 * CUSTOMERORDERCONTROLLER CALLS ON THE SERVICE TO PERFORM METHODS
 * @author RyanB
 */

package Controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.services.CustomerOrderImsService;

@Named("customerOrder")
@RequestScoped
public class CustomerOrderController implements Serializable {
	
	private static final long serialVersionUID = 13423423L;

	@Inject
	private CustomerOrderImsService customerOrderService;
	
	private List<CustomerOrder> lsOrders;

	
//GETTERS AND SETTERS
/**
 * GET'S A LIST OF ALL CUSTOMER ORDERS
 * @return DataModel<CustomerOrder>
 */
	public DataModel<CustomerOrder> getCustomerOrders() {
		setCustomerOrders(customerOrderService.readCustomerOrders());
		return new ListDataModel<>(lsOrders);
	}


	public void setCustomerOrders(List<CustomerOrder> lstTemp ){
		this.lsOrders = lstTemp;
	}
}