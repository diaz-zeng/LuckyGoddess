package edu.diaz.luckygoddess;

import java.util.Scanner;

/**
 * 欢迎界面
 * 
 * @author Diaz
 *
 */
public class WelcomeScreen implements LuckyGoddessUI
{

//	public static String uiName = "欢迎";

	@Override
	public void start()
	{
		// TODO Auto-generated constructor stub
		System.out.println("****欢迎进入奖客富翁系统****");
		System.out.println("        1.注册                           ");
		System.out.println("        2.登陆                           ");
		System.out.println("        3.抽奖                           ");
		System.out.println("****************************");
		System.out.print("请选则：");
		int userOption = new Scanner(System.in).nextInt();
		switch (userOption)
		{
		case 1:
		{

			UserOptional.userOptional(new RegistrationProcess());
			break;

		}
		case 2:
		{

			UserOptional.userOptional(new LoginProcess());
			break;
		}
		case 3:
		{
			if (LuckyGoddess.isLogin)
			{
				UserOptional.userOptional(new LuckyTime());
			} else
			{
				UserOptional.userOptional(new LoginProcess());
				System.out.println("您尚未的登陆，请登录");
			}
			break;
		}
		default:
			break;
		}
	}

@Override
public String getUIName()
{
	// TODO Auto-generated method stub
	return "欢迎";
}
}
