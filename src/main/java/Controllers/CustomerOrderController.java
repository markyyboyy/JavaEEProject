package Controllers;

import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.services.CustomerOrderImsService;
import java.io.Serializable;

@Named("customerOrderrrr")
@ConversationScoped
public class CustomerOrderController implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 13423423L;

	@Inject
	private CustomerOrderImsService customerOrderService;

	private DataModel<CustomerOrder> customerOrders;
	
	private List<CustomerOrder> lsOrders;
	
	@SuppressWarnings("unchecked")
	public DataModel<CustomerOrder> getCustomerOrders() {
		
		setCustomerOrders(customerOrderService.readCustomerOrders());
		
		return new ListDataModel<>(lsOrders);

	}
	
	
	@SuppressWarnings("unchecked")
	public String dateToString(){

	}
		
		
		
		

	public void setCustomerOrders(List<CustomerOrder> lstTemp ){
		this.lsOrders = lstTemp;
	}
		
		
}