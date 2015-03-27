package entities;

import java.io.Serializable;

/**
 * 
 * @author Cristhian Tolosa
 *
 */
public class Payment implements Serializable{

	// ATTRIBUTES
	
	/**
	 * Default serial ID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Payment method
	 */
	private String paymentMethod;
	
	
	// CONSTRUCTORS
	
	/**
	 * Default constructor
	 */
	public Payment() {		
	}
	
	/**
	 * Constructor
	 * @param paymentMethod
	 */
	public Payment(String paymentMethod) {
		this.setPaymentMethod(paymentMethod);
	}

	// GETTERS AND SETTERS
	
	/**
	 * Get the value from paymentMethod
	 * @return the paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * Set value to paymentMethod
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
