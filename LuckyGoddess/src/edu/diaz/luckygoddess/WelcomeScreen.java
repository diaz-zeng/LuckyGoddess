package edu.diaz.luckygoddess;

import java.util.Scanner;

public class WelcomeScreen
{
	public WelcomeScreen()
	{
		// TODO Auto-generated constructor stub
		System.out.println("****欢迎进入奖客富翁系统****");
		System.out.println("        1.注册                           ");
		System.out.println("        2.登陆                           ");
		System.out.println("        1.抽奖                           ");
		System.out.println("****************************");
		System.out.print("请选则：");
		int userOption= new Scanner(System.in).nextInt();
		switch (userOption)
		{
		case 1:
		{
	        System.out.println("[奖客富翁系统>注册]");
	        System.out.print("继续吗?(y/n):");
	        if(new Scanner(System.in).nextLine()=="y")
	        {
	        	RegistrationProcess registrationProcess = new RegistrationProcess();
	        }
	        else
	        {
	        	System.out.println("程序退出");
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
