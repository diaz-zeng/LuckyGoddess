package edu.diaz.luckygoddess;

import java.util.Scanner;

/**
 * 接受用户选择，并作出跳转的类
 * @author Diaz
 *
 */
public class UserOptional
{
	/**
	 * 处理用户输入的数据
	 * @param ui 要跳转的界面
	 */
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
