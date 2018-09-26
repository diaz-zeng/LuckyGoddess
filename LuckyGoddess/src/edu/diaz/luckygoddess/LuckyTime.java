package edu.diaz.luckygoddess;

/**
 * 用于实现抽奖功能的界面类
 * @author Diaz
 *
 */
public class LuckyTime implements LuckyGoddessUI
{

	public String uiName = "抽奖";
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see edu.diaz.luckygoddess.LuckyGoddessUI#start()
	 */
	public void start()
	{
		// TODO Auto-generated method stub
		System.out.println("欢迎你："+LuckyGoddess.user.getUserName());
		System.out.println("您的会员ID是："+LuckyGoddess.userID);
		String result = getLuckyNumber();
		System.out.println("中奖号码为："+result);
		System.out.println(result.equals(LuckyGoddess.userID)?"恭喜您中奖了！":"很遗憾您未中奖请再接再励！");
		UserOptional.userOptional(LuckyGoddess.welcomeScreen);
	}
	
	/**
	 * 获取中奖号码
	 * @return 中奖号码
	 */
	public String getLuckyNumber()
	{
		String luckyNumber="";
		for(int i = 0;i<4;i++)
		{
			int temp = (int)((Math.random()*100)%10);
			luckyNumber+=temp;
		}
		return luckyNumber;
	}

}
