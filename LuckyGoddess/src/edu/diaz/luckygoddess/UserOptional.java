package edu.diaz.luckygoddess;

import java.util.Scanner;

public class UserOptional
{
	public static void userOptional(LuckyGoddessUI ui)
	{
		System.out.println("[奖客富翁系统>"+ui.uiName+"]");
        System.out.print("继续吗?(y/n):");
        String chose = new Scanner(System.in).nextLine();
        if("y".equals(chose))
        {
        	ui.start();
        }
        else
        {
        	System.out.println("程序退出");
        }
	}
}
