package edu.diaz.luckygoddess;

import java.util.Scanner;

public class WelcomeScreen
{
	public WelcomeScreen()
	{
		
	}
	public void start()
	{
		// TODO Auto-generated constructor stub
				System.out.println("****��ӭ���뽱�͸���ϵͳ****");
				System.out.println("        1.ע��                           ");
				System.out.println("        2.��½                           ");
				System.out.println("        1.�齱                           ");
				System.out.println("****************************");
				System.out.print("��ѡ��");
				int userOption= new Scanner(System.in).nextInt();
				switch (userOption)
				{
				case 1:
				{
			        System.out.println("[���͸���ϵͳ>ע��]");
			        System.out.print("������?(y/n):");
			        String chose = new Scanner(System.in).nextLine();
			        if("y".equals(chose))
			        {
			        	RegistrationProcess registrationProcess = new RegistrationProcess();
			        	registrationProcess.start();
			        	break;
			        }
			        else
			        {
			        	System.out.println("�����˳�");
			        	break;
			        }
					
				}
				case 2:
				{
					break;
				}
				case 3:
				{
					break;
				}
				default:
					break;
				}
	}
}
