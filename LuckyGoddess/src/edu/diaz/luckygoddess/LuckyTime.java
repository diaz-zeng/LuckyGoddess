package edu.diaz.luckygoddess;

import java.util.Arrays;

/**
 * ����ʵ�ֳ齱���ܵĽ�����
 * 
 * @author Diaz
 *
 */
public class LuckyTime implements LuckyGoddessUI
{

	public String uiName = "�齱";
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
		System.out.println("��ӭ�㣺" + LuckyGoddess.user.getUserName());
		System.out.println("���Ļ�ԱID�ǣ�" + LuckyGoddess.userID);
		String[] result = getLuckyNumber();
		System.out.println("�н�����Ϊ��" + Arrays.toString(result));
		for (String string : result)
		{
			isWinning = string.equals(LuckyGoddess.userID) ? true : false;
		}
		System.out.println(isWinning ? "��ϲ���н��ˣ�" : "���ź���δ�н����ٽ�������");
		UserOptional.userOptional(LuckyGoddess.welcomeScreen);
	}

	/**
	 * ��ȡ�н�����
	 * 
	 * @return �н�����
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

}
