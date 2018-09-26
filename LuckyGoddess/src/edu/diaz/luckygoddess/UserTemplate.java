package edu.diaz.luckygoddess;


/**
 * 用户对象模板类
 * @author Diaz
 *
 */
public class UserTemplate
{
	private String userName;
	private String userID;
	private String userPassword;

	/**
	 * 构造函数
	 * @param name 用户名
	 * @param id ID
	 * @param password 密码
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
