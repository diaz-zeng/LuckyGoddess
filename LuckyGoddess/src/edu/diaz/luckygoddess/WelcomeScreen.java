package edu.diaz.luckygoddess;

import java.util.Scanner;

public class WelcomeScreen implements LuckyGoddessUI
{
	
	public String uiName = "»¶Ó­";
	

	public WelcomeScreen()
	{
		
	}
	
	@Override
	public void start()
	{
		// TODO Auto-generated constructor stub
				System.out.println("****»¶Ó­½øÈë½±¿Í¸»ÎÌÏµÍ³****");
				System.out.println("        1.×¢²á                           ");
				System.out.println("        2.µÇÂ½                           ");
				System.out.println("        3.³é½±                           ");
				System.out.println("****************************");
				System.out.print("ÇëÑ¡Ôò£º");
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
						System.out.println("ÄúÉÐÎ´µÄµÇÂ½£¬ÇëµÇÂ¼");
					}
					break;
				}
				default:
					break;
				}
	}
}
