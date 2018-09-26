package edu.diaz.luckygoddess;


import java.util.Scanner;
/**
 * 程序主类
 * @author Diaz
 *
 */
public class LuckyGoddess
{
	public static WelcomeScreen welcomeScreen;//欢迎界面，整个程序的生命周期中只有一个欢迎界面
	public static boolean isLogin = false;//标识当前用户是否登陆
	public static String userID = "";//当前用户的ID
	public static UserTemplate user;//当前用户的对象
	/**
	 * 程序的主入口
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		welcomeScreen = new WelcomeScreen();
		welcomeScreen.start();
	}
	
}
