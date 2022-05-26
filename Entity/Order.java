

/**
 * @author lenovo
 * @version 1.0
 * @created 26-5ÔÂ-2022 20:52:49
 */
public class Order {

	private String address;
	private String createTime;
	private List<OrderItem> orderItems;
	private int status;
	private User user;
	public IDB m_IDB;
	public User m_User;

	public Order(){

	}

	public void finalize() throws Throwable {

	}
}//end Order