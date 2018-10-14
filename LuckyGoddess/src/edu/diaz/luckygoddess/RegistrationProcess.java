package edu.diaz.luckygoddess;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


import com.alibaba.fastjson.JSON;

/**
 * 实现用户注册的类
 * @author Diaz
 *
 */
public class RegistrationProcess implements LuckyGoddessUI
{

//	public static String uiName = "注册";
	
	@Override
	public void start()
	{
		String name,password;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请填写个人信息");
		System.out.print("姓名:");
		name= scanner.nextLine();
		System.out.print("密码:");
		password = scanner.nextLine();
		String id =getRandomID();
		UserTemplate userTemplate = new UserTemplate(name, id, password);
		writeToFile(JSON.toJSONString(userTemplate), name,id,password);
	}
	/**
	 * 获取一个随机的用户ID
	 * @return 用户ID
	 */
	private String getRandomID()
	{
		String id = "";
		for(int i = 0;i<4;i++)
		{
			int temp = (int)((Math.random()*100)%10);
			id+=temp;
		}
		return id;
	}
	/*
	 * 
	 * 将对象转换为JSON字符串并写入文件
	 * 
	 */
	private void writeToFile(String jsonString,String uName,String uID,String uPassword)
	{
		File file;
		FileWriter fwFileWriter;
		try
		{
		    file = new File("./UserProfile/"+uName+".json");
			file.createNewFile();
			fwFileWriter = new FileWriter(file);
			fwFileWriter.write(jsonString);
			fwFileWriter.flush();
			fwFileWriter.close();
			System.out.println("注册成功，请记好您的会员卡号和密码");
			System.out.println("用户名\t密码\t会员卡号");
			System.out.println(uName+"\t"+uPassword+"\t"+uID);
			UserOptional.userOptional(LuckyGoddess.welcomeScreen);
			
		} catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Override
	public String getUIName()
	{
		// TODO Auto-generated method stub
		return "注册";
	}
}
