package entities;

import java.io.Serializable;

/**
 * Define Person Entity
 * 
 * @author Cristhian Tolosa
 *
 */
public class Person implements Serializable {
	/**
	 * Default serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Person name
	 */
	private String name;

	/**
	 * Person last name
	 */
	private String lastName;

	/**
	 * Person address
	 */
	private String address;

	/**
	 * Person phone Number
	 */
	private String phoneNumber;
	
	/**
	 * Default constructor
	 */
	public Person() {
		
	}

	/**
	 * Constructor
	 * @param name
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 */
	public Person(String name, String lastName, String address,
			String phoneNumber) {
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Get the value from name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set value to name
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the value from lastName
	 * 
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set value to lastName
	 * 
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Get the value from address
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Set value to address
	 * 
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Get the value from phoneNumber
	 * 
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Set value to phoneNumber
	 * 
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
