package dao;

import java.sql.Date;

/**
 * 
 * @author mjy
 *
 */
public interface UserDao  {

	/**
	 * ���
	 * @param user_name
	 * @param password
	 * @return �Ƿ�����˺�
	 */
	boolean login(String user_name,String password);
	
	void register(String user_name,String password,int gender,int age,String tel,String mail);
}
