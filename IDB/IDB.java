

/**
 * @author lenovo
 * @version 1.0
 * @created 26-5ÔÂ-2022 20:52:49
 */
public interface IDB<T> {

	public List m_Book;
	public Order m_Order;
	public User m_User;

	/**
	 * 
	 * @param t
	 */
	public int add(T t);

	public int delete();

	/**
	 * 
	 * @param t
	 */
	public List<T> select(T t);

	/**
	 * 
	 * @param t
	 */
	public int update(T t);

}