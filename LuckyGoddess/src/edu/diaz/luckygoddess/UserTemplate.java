package edu.diaz.luckygoddess;


/**
 * �û�����ģ����
 * @author Diaz
 *
 */
public class UserTemplate
{
	private String userName;
	private String userID;
	private String userPassword;

	/**
	 * ���캯��
	 * @param name �û���
	 * @param id ID
	 * @param password ����
	 */
	public UserTemplate(String name, String id, String password)
	{
		userName = name;
		userID = id;
		userPassword = password;
	}
	
	public String getUserName()
	{
		return userName;
	}

	public String getUserID()
	{
		return userID;
	}

	public String getUserPassword()
	{
		return userPassword;
	}
}
