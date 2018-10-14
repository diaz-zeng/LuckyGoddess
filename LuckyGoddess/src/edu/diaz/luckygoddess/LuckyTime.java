package edu.diaz.luckygoddess;

import java.util.Arrays;

/**
 * 用于实现抽奖功能的界面类
 * 
 * @author Diaz
 *
 */
public class LuckyTime implements LuckyGoddessUI
{

//	public static String uiName = "抽奖";
	private boolean isWinning = false;

	@Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.diaz.luckygoddess.LuckyGoddessUI#start()
	 */
	public void start()
	{
		// TODO Auto-generated method stub
		System.out.println("欢迎你：" + LuckyGoddess.user.getUserName());
		System.out.println("您的会员ID是：" + LuckyGoddess.userID);
		String[] result = getLuckyNumber();
		System.out.println("中奖号码为：" + Arrays.toString(result));
		for (String string : result)
		{
			isWinning = string.equals(LuckyGoddess.userID) ? true : false;
		}
		System.out.println(isWinning ? "恭喜您中奖了！" : "很遗憾您未中奖请再接再励！");
		UserOptional.userOptional(LuckyGoddess.welcomeScreen);
	}

	/**
	 * 获取中奖号码
	 * 
	 * @return 中奖号码
	 */
	public String[] getLuckyNumber()
	{
		String[] luckyNumber = new String[5];
		for (int j = 0; j < 5; j++)
		{
			String luckyNumberTemp = "";
			for (int i = 0; i < 4; i++)
			{
				int temp = (int) ((Math.random() * 100) % 10);
				luckyNumberTemp += temp;
			}
			luckyNumber[j] = luckyNumberTemp;
		}
		return luckyNumber;
	}

	@Override
	public String getUIName()
	{
		// TODO Auto-generated method stub
		return "抽奖";
	}

}
