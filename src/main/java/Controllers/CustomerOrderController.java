package Controllers;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.services.CustomerOrderImsService;

@Named("customerOrder")
@RequestScoped
public class CustomerOrderController {
	@Inject
	private CustomerOrderImsService customerOrderService;

	private DataModel<CustomerOrder> customerOrders;

	public DataModel<CustomerOrder> getCustomerOrders() {
		
		
		
		
		return (DataModel<CustomerOrder>) customerOrderService.readCustomerOrders();
	}
}
