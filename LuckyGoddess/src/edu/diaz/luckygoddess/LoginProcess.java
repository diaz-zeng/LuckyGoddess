package edu.diaz.luckygoddess;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class LoginProcess implements LuckyGoddessUI
{

	
	public UserTemplate userTemplate ;
	public String uiName = "��½";
	
	@Override
	public void start()
	{
		// TODO Auto-generated method stub
		System.out.println("�������û�����");
		String name = new Scanner(System.in).nextLine();
		loadUserProfile(name);
		System.out.println("���������룺");
		String password = new Scanner(System.in).nextLine();
		if(password.equals(userTemplate.getUserPassword()))
		{
			
			LuckyGoddess.isLogin =true;
			System.out.println("��ӭ����"+name);
			UserOptional.userOptional(LuckyGoddess.welcomeScreen);
		}
		else 
		{
			System.out.println("�������");
			this.start();
		}
	}
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
			System.out.println("�û�������");
			start();
		}
	}
	
}
