import java.util.Calendar;
@Entity
@Table(name = "CustomerOrder")
class CustomerOrder {
	
	@Column(name = "customerOrderId", nullable = false, unique = true)
	private int customerOrderId;
	
	@Column(name = "feedbackId", nullable = true, unique = false)
	private int feedbackId;
	
	@Column(name = "customerId", nullable = false, unique = false)
	private int customerId;

	private enum status {
		PLACED, PICKED, CHECKED, PACKED, DISPATCHED
	};

	private Calendar datePlaced;
	private Calendar dateReceived;
	private int addressId;
	private int paymentId;

	public CustomerOrder() {
	};

	public CustomerOrder(int customerOrderId, int feedbackId, int customerId, Calendar datePlaced,
			Calendar dateReceived, int addressId, int paymentId) {
		super();
		this.customerOrderId = customerOrderId;
		this.feedbackId = feedbackId;
		this.customerId = customerId;
		this.datePlaced = datePlaced;
		this.dateReceived = dateReceived;
		this.addressId = addressId;
		this.paymentId = paymentId;
	}

	public int getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(int customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Calendar getDatePlaced() {
		return datePlaced;
	}

	public void setDatePlaced(Calendar datePlaced) {
		this.datePlaced = datePlaced;
	}

	public Calendar getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(Calendar dateReceived) {
		this.dateReceived = dateReceived;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	@Override
	public String toString() {
		return "CustomerOrder [customerOrderId=" + customerOrderId + ", feedbackId=" + feedbackId + ", customerId="
				+ customerId + ", datePlaced=" + datePlaced + ", dateReceived=" + dateReceived + ", addressId="
				+ addressId + ", paymentId=" + paymentId + "]";
	}

}
