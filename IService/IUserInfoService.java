

/**
 * @author lenovo
 * @version 1.0
 * @created 26-5ÔÂ-2022 20:52:49
 */
public interface IUserInfoService {

	/**
	 * 
	 * @param userId
	 */
	public boolean banUser(String userId);

	/**
	 * 
	 * @param userId
	 * @param userPwd
	 * @param introduce
	 * @param common_address
	 * @param phoneNo
	 * @param accountStatus
	 */
	public boolean register(String userId, String userPwd, String introduce, String common_address, String phoneNo, int accountStatus);

	/**
	 * 
	 * @param user
	 */
	public boolean updateUserInfo(User user);

}