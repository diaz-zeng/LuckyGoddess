package edu.diaz.luckygoddess;

/**
 * ����ʵ�ֳ齱���ܵĽ�����
 * @author Diaz
 *
 */
public class LuckyTime implements LuckyGoddessUI
{

	public String uiName = "�齱";
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see edu.diaz.luckygoddess.LuckyGoddessUI#start()
	 */
	public void start()
	{
		// TODO Auto-generated method stub
		System.out.println("��ӭ�㣺"+LuckyGoddess.user.getUserName());
		System.out.println("���Ļ�ԱID�ǣ�"+LuckyGoddess.userID);
		String result = getLuckyNumber();
		System.out.println("�н�����Ϊ��"+result);
		System.out.println(result.equals(LuckyGoddess.userID)?"��ϲ���н��ˣ�":"���ź���δ�н����ٽ�������");
		UserOptional.userOptional(LuckyGoddess.welcomeScreen);
	}
	
	/**
	 * ��ȡ�н�����
	 * @return �н�����
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
