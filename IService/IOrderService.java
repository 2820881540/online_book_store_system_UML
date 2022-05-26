

/**
 * @author lenovo
 * @version 1.0
 * @created 26-5ÔÂ-2022 20:52:49
 */
public interface IOrderService {

	/**
	 * 
	 * @param order
	 */
	public boolean addOrder(Order order);

	/**
	 * 
	 * @param orderId
	 */
	public boolean cancel(int orderId);

	/**
	 * 
	 * @param order
	 */
	public boolean cancel(Order order);

	/**
	 * 
	 * @param orderId
	 */
	public Order searchOrder(int orderId);

	/**
	 * 
	 * @param user
	 */
	public List<Order> searchOrder(User user);

	/**
	 * 
	 * @param newStatus
	 */
	public void updateOrderStatus(int newStatus);

}