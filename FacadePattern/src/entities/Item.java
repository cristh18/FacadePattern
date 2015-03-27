package entities;

import java.io.Serializable;

/**
 * Define Item entity
 * 
 * @author Cristhian Tolosa
 *
 */
public class Item implements Serializable {

	/**
	 * Default serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Item name
	 */
	private String itemName;

	/**
	 * Item price
	 */
	private String itemPrice;
	
	/**
	 * Default constructor
	 */
	public Item() {
		
	}

	/**
	 * Constructor
	 * @param itemName
	 * @param itemPrice
	 */
	public Item(String itemName, String itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	/**
	 * Get the value from itemName
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * Set value to itemName
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * Get the value from itemPrice
	 * @return the itemPrice
	 */
	public String getItemPrice() {
		return itemPrice;
	}

	/**
	 * Set value to itemPrice
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

}
