package edu.diaz.luckygoddess;

import java.util.Scanner;

public class WelcomeScreen implements LuckyGoddessUI
{
	
	public String uiName = "��ӭ";
	

	public WelcomeScreen()
	{
		
	}
	
	@Override
	public void start()
	{
		// TODO Auto-generated constructor stub
				System.out.println("****��ӭ���뽱�͸���ϵͳ****");
				System.out.println("        1.ע��                           ");
				System.out.println("        2.��½                           ");
				System.out.println("        3.�齱                           ");
				System.out.println("****************************");
				System.out.print("��ѡ��");
				int userOption= new Scanner(System.in).nextInt();
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
					if(LuckyGoddess.isLogin)
					{
						UserOptional.userOptional(new LuckyTime());
					}
					else
					{
						UserOptional.userOptional(new LoginProcess());
						System.out.println("����δ�ĵ�½�����¼");
					}
					break;
				}
				default:
					break;
				}
	}
}
