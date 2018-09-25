package edu.diaz.luckygoddess;


public class UserTemplate
{
	private String userName;
	private String userID;
	private String userPassword;
	public UserTemplate(String name, String id, String password)
	{
		name = this.userName;
		id = this.userID;
		password = userPassword;
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
