package edu.diaz.luckygoddess;

import java.util.Scanner;

public class UserOptional
{
	public static void userOptional(LuckyGoddessUI ui)
	{
		System.out.println("[���͸���ϵͳ>"+ui.uiName+"]");
        System.out.print("������?(y/n):");
        String chose = new Scanner(System.in).nextLine();
        if("y".equals(chose))
        {
        	ui.start();
        }
        else
        {
        	System.out.println("�����˳�");
        }
	}
}
