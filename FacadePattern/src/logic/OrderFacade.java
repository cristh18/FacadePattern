package logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import entities.Item;
import entities.Payment;
import entities.Person;

/**
 * 
 * @author Cristhian Tolosa
 *
 */
public class OrderFacade implements Serializable {

	/**
	 * Default serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Person person;

	/**
	 * 
	 */
	private Item item;

	/**
	 * 
	 */
	private Payment payment;

	/**
	 * 
	 */
	private Map<String, String> orderDetails;

	// CONSTRUCTORS

	/**
	 * Default Constructor
	 */
	public OrderFacade(String personName, 
			String personLastName,
			String personAddress, 
			String personPhoneNumber, 
			String itemName,
			String itemPrice, 
			String paymentMehtod) {
		person = new Person(personName, personLastName, personAddress,
				personPhoneNumber);
		item = new Item(itemName, itemPrice);
		payment = new Payment(paymentMehtod);
	}

	/**
	 * Register order
	 */
	public void registerOrder() {
		orderDetails = new HashMap<String, String>();
		if (person != null && item != null && payment != null) {

			orderDetails.put("Person name", person.getName());
			orderDetails.put("Person last name", person.getLastName());
			orderDetails.put("Person address", person.getAddress());
			orderDetails.put("Person Phone number", person.getPhoneNumber());
			orderDetails.put("Item name", item.getItemName());
			orderDetails.put("Item price", item.getItemPrice());
			orderDetails.put("Payment method", payment.getPaymentMethod());
		}

		this.summaryOrder();
	}

	/**
	 * summaryOrder
	 */
	public void summaryOrder() {

		Iterator iterator = orderDetails.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print(mentry.getKey() + ": ");
			System.out.println(mentry.getValue());
		}
		System.out.println("||================================Order Registered=====================================||");
	}

	/**
	 * Get the value from person
	 * 
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * Set value to person
	 * 
	 * @param person
	 *            the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * Get the value from item
	 * 
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * Set value to item
	 * 
	 * @param item
	 *            the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	/**
	 * Get the value from payment
	 * 
	 * @return the payment
	 */
	public Payment getPayment() {
		return payment;
	}

	/**
	 * Set value to payment
	 * 
	 * @param payment
	 *            the payment to set
	 */
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	/**
	 * Get the value from orderDetails
	 * 
	 * @return the orderDetails
	 */
	public Map<String, String> getOrderDetails() {
		return orderDetails;
	}

	/**
	 * Set value to orderDetails
	 * 
	 * @param orderDetails
	 *            the orderDetails to set
	 */
	public void setOrderDetails(Map<String, String> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
