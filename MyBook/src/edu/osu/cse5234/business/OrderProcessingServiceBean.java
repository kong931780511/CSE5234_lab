package edu.osu.cse5234.business;

import java.util.Random;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.model.Order;
import edu.osu.cse5234.util.ServiceLocator;


/**
 * Session Bean implementation class OrderProcessingServiceBean
 */
@Stateless
@LocalBean
public class OrderProcessingServiceBean {
	@PersistenceContext
	EntityManager entityManager;
	
	public static final String MY_QUERY = "Select i from Item i";
    /**
     * Default constructor. 
     */
    public OrderProcessingServiceBean() {
        // TODO Auto-generated constructor stub
    }
    
    public String processOrder(Order order) {
    	validateItemAvailability
    }
    
    public boolean validateItemAvailability(Order order) {
    	return ServiceLocator.InventoryService().validateQuantity(order.getLineItems());
    }
}
