

/**
 * @author lenovo
 * @version 1.0
 * @created 26-5ÔÂ-2022 20:52:50
 */
public class UserInfoServiceImpl implements IUserInfoService {

	public User m_User;

	public UserInfoServiceImpl(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param userId
	 */
	public boolean banUser(String userId){
		return false;
	}

	/**
	 * 
	 * @param userId
	 * @param userPwd
	 * @param introduce
	 * @param common_address
	 * @param phoneNo
	 * @param accountStatus
	 */
	public boolean register(String userId, String userPwd, String introduce, String common_address, String phoneNo, int accountStatus){
		return false;
	}

	/**
	 * 
	 * @param user
	 */
	public boolean updateUserInfo(User user){
		return false;
	}
}//end UserInfoServiceImpl