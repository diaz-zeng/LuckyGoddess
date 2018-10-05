package edu.diaz.luckygoddess;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


/**
 * 实现登陆过程的界面
 * @author Diaz
 *
 */
public class LoginProcess implements LuckyGoddessUI
{

	
	public UserTemplate userTemplate;
	
//	public static String uiName = "登陆";
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see edu.diaz.luckygoddess.LuckyGoddessUI#start()
	 */
	public void start()
	{
		// TODO Auto-generated method stub
		System.out.println("请输如用户名：");
		String name = new Scanner(System.in).nextLine();
		loadUserProfile(name);
		System.out.println("请输入密码：");
		String password = new Scanner(System.in).nextLine();
		if(password.equals(userTemplate.getUserPassword()))
		{
			
			LuckyGoddess.isLogin =true;
			LuckyGoddess.userID = userTemplate.getUserID();
			System.out.println("欢迎您："+name);
			LuckyGoddess.user =userTemplate;
			UserOptional.userOptional(LuckyGoddess.welcomeScreen);
		}
		else 
		{
			System.out.println("密码错误");
			this.start();
		}
	}
	/**
	 * 从json文件中加载用户对象
	 * @param name 要加载的用户名
	 */
	private void loadUserProfile(String name)
	{
		
		File file  = new File("./UserProfile/"+name+".json");
		if(file.exists())
		{
			byte[] buffer = new byte[(int)file.length()];
			try
			{
				FileInputStream inputStream = new FileInputStream(file);
				inputStream.read(buffer);
				inputStream.close();
				String stringBuffer = new String(buffer,"UTF-8");
//				userTemplate = (UserTemplate)JSON.parse(stringBuffer);
				JSONObject temp = JSON.parseObject(stringBuffer);
				userTemplate = new UserTemplate(temp.getString("userName"), temp.getString("userID"), temp.getString("userPassword"));
//				System.out.println();
			} 
			catch (Exception e)
			{
				// TODO: handle exception
				e.printStackTrace();
				return;
			}
		}
		else
		{
			System.out.println("用户不存在");
			start();
		}
	}
	@Override
	public String getUIName()
	{
		// TODO Auto-generated method stub
		return "登陆";
	}
	
}
