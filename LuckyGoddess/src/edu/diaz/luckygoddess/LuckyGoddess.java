package edu.diaz.luckygoddess;


import java.util.Scanner;
/**
 * ��������
 * @author Diaz
 *
 */
public class LuckyGoddess
{
	public static WelcomeScreen welcomeScreen;//��ӭ���棬�������������������ֻ��һ����ӭ����
	public static boolean isLogin = false;//��ʶ��ǰ�û��Ƿ��½
	public static String userID = "";//��ǰ�û���ID
	public static UserTemplate user;//��ǰ�û��Ķ���
	/**
	 * ����������
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		welcomeScreen = new WelcomeScreen();
		welcomeScreen.start();
	}
	
}
