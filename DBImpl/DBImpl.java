

/**
 * @author lenovo
 * @version 1.0
 * @created 26-5ÔÂ-2022 20:52:49
 */
public class DBImpl implements IDB {

	public DBImpl(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param t
	 */
	public int add(T t){
		return 0;
	}

	public int delete(){
		return 0;
	}

	/**
	 * 
	 * @param t
	 */
	public List<T> select(T t){
		return null;
	}

	/**
	 * 
	 * @param t
	 */
	public int update(T t){
		return 0;
	}
}//end DBImpl