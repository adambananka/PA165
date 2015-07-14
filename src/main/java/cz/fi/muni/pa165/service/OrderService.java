package cz.fi.muni.pa165.service;

import java.util.List;

import cz.fi.muni.pa165.dto.OrderDTO;
import cz.fi.muni.pa165.entity.Order;
import cz.fi.muni.pa165.entity.OrderState;
import cz.fi.muni.pa165.entity.User;

/**
 * An interface that defines a service access to the {@link Order} entity.
 */
public interface OrderService {
	
	/**
	 * Get all saved orders belonging to the given user.
	 */
	List<Order> getOrdersByUser(User user);
	
	/**
	 * Get all orders saved within last week that have the given state.
	 */
	List<Order> getAllOrdersLastWeek(OrderState state);

	
	/**
	 * Get all orders with the given state.
	 */
	List<Order> getAllOrders(OrderState state);


	void shipOrder(Order order);
	void finishOrder(Order order);
	void cancelOrder(Order order);

	Order findOrderById(Long id);
	
}
