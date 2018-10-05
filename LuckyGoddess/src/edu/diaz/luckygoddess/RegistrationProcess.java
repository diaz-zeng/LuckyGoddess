package edu.diaz.luckygoddess;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


import com.alibaba.fastjson.JSON;

/**
 * ʵ���û�ע�����
 * @author Diaz
 *
 */
public class RegistrationProcess implements LuckyGoddessUI
{

//	public static String uiName = "ע��";
	
	@Override
	public void start()
	{
		String name,password;
		Scanner scanner = new Scanner(System.in);
		System.out.println("����д������Ϣ");
		System.out.print("����:");
		name= scanner.nextLine();
		System.out.print("����:");
		password = scanner.nextLine();
		String id =getRandomID();
		UserTemplate userTemplate = new UserTemplate(name, id, password);
		writeToFile(JSON.toJSONString(userTemplate), name,id,password);
	}
	/**
	 * ��ȡһ��������û�ID
	 * @return �û�ID
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
	 * ������ת��ΪJSON�ַ�����д���ļ�
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
			System.out.println("ע��ɹ�����Ǻ����Ļ�Ա���ź�����");
			System.out.println("�û���\t����\t��Ա����");
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
		return "ע��";
	}
}
