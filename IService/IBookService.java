

/**
 * @author lenovo
 * @version 1.0
 * @created 26-5ÔÂ-2022 20:52:49
 */
public interface IBookService {

	/**
	 * 
	 * @param Book
	 */
	public boolean addBook(Book Book);

	/**
	 * 
	 * @param book
	 */
	public boolean deleteBook(Book book);

	/**
	 * 
	 * @param isbnNo
	 */
	public Book searchBook(String isbnNo);

	/**
	 * 
	 * @param book
	 */
	public void updateBookStatus(Book book);

}