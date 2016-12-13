/**
 * CUSTOMERORDERCONTROLLER CALLS ON THE SERVICE TO PERFORM METHODS
 * @author RyanB
 */

package Controllers;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.CustomerOrder;
import com.qac.services.CustomerOrderImsService;

@Named("customerOrder")
@SessionScoped
public class CustomerOrderController implements Serializable {
	private static final long serialVersionUID = 13423423L;

	@Inject
	private CustomerOrderImsService cImsService;

	private List<CustomerOrder> lsOrders;

	private boolean sortAscending = true;

	// GETTERS AND SETTERS
	/**
	 * GET'S A LIST OF ALL CUSTOMER ORDERS
	 * 
	 * @return DataModel<CustomerOrder>
	 */
	public DataModel<CustomerOrder> getCustomerOrders() {
		setCustomerOrders(cImsService.readCustomerOrders());
		return new ListDataModel<>(lsOrders);
	}
	public void setCustomerOrders(List<CustomerOrder> lstTemp) {
		this.lsOrders = lstTemp;
	}

	public void sortCustomerByID() {
		if (sortAscending){
			Collections.sort(lsOrders, new Comparator<CustomerOrder>() {

				@Override
				public int compare(CustomerOrder o1, CustomerOrder o2) {
					return Long.valueOf(o1.getID()).compareTo(Long.valueOf(o2.getID()));
				}
			});
			sortAscending = false;

		} else {
			Collections.sort(lsOrders, new Comparator<CustomerOrder>() {

				@Override
				public int compare(CustomerOrder o1, CustomerOrder o2) {
					return Long.valueOf(o2.getID()).compareTo(Long.valueOf(o1.getID()));
				}
			});
			sortAscending = true;
		}
	}
	public void sortCustomerByAddress() {
		if (sortAscending){
			Collections.sort(lsOrders, new Comparator<CustomerOrder>() {

				@Override
				public int compare(CustomerOrder o1, CustomerOrder o2) {
					return Long.valueOf(o1.getAddressID()).compareTo(Long.valueOf(o2.getAddressID()));
				}
			});
			sortAscending = false;
		} else {
			Collections.sort(lsOrders, new Comparator<CustomerOrder>() {

				@Override
				public int compare(CustomerOrder o1, CustomerOrder o2) {
					return Long.valueOf(o2.getAddressID()).compareTo(Long.valueOf(o1.getAddressID()));
				}
			});
			sortAscending = true;
		}
	}
}