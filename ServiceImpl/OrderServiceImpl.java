

/**
 * @author lenovo
 * @version 1.0
 * @created 26-5ÔÂ-2022 20:52:49
 */
public class OrderServiceImpl implements IOrderService {

	public Order m_Order;

	public OrderServiceImpl(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param order
	 */
	public boolean addOrder(Order order){
		return false;
	}

	/**
	 * 
	 * @param order
	 */
	public boolean cancel(Order order){
		return false;
	}

	/**
	 * 
	 * @param orderId
	 */
	public boolean cancel(int orderId){
		return false;
	}

	/**
	 * 
	 * @param user
	 */
	public List<Order> searchOrder(User user){
		return null;
	}

	/**
	 * 
	 * @param orderId
	 */
	public Order searchOrder(int orderId){
		return null;
	}

	/**
	 * 
	 * @param newStatus
	 */
	public void updateOrderStatus(int newStatus){

	}
}//end OrderServiceImpl