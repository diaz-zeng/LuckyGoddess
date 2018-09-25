package edu.diaz.luckygoddess;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


import com.alibaba.fastjson.JSON;

public class RegistrationProcess
{

	public RegistrationProcess()
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
		
	}
	
	private String getRandomID()
	{
		String id = "";
		for(int i = 0;i<4;i++)
		{
			int temp = (int)Math.random()*10;
			id+=temp;
		}
		return id;
	}
	private void writeToFile(String jsonString,String uID)
	{
		File file;
		FileWriter fwFileWriter;
		try
		{
		    file = new File("./"+uID+".json");
			file.createNewFile();
			fwFileWriter = new FileWriter(file);
			fwFileWriter.write(jsonString);
			fwFileWriter.flush();
			fwFileWriter.close();
		} catch (Exception e)
		{
			// TODO: handle exception
		
		}
	}
}
