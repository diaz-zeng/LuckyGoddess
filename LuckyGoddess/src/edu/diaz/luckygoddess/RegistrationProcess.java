package edu.diaz.luckygoddess;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


import com.alibaba.fastjson.JSON;

public class RegistrationProcess implements LuckyGoddessUI
{

	public String uiName = "注册";
	public RegistrationProcess()
	{
		
		
	}
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
}
