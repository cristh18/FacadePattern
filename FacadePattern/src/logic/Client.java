package logic;

import java.io.Serializable;

/**
 * 
 * @author Cristhian Tolosa
 *
 */
public class Client implements Serializable{

	/**
	 * Default serial ID
	 */
	private static final long serialVersionUID = 1L;
		
	/**
	 * Execute app
	 * @param args
	 */
	public static void main(String[] args) {
		// First client
		OrderFacade client1 = new OrderFacade("Andres", "Rincón", "Avenida Siempre Viva 123", "2111111", "Camera", "500", "Credit Card");		
		client1.registerOrder();
		
		// Second client
		OrderFacade client2 = new OrderFacade("Evelin", "Baron", "Calle falsa 456", "3777777", "Laptop", "1000", "PayPal");		
		client2.registerOrder();
	}

}
