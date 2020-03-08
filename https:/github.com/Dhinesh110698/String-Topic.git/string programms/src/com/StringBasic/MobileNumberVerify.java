package com.StringBasic;

public class MobileNumberVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "6839554324";
		char[] ch = s.toCharArray();
		boolean flag = true;
		if ((ch.length == 10) && (ch[0] != '0'))
		{
			if ((((int)ch[0]) >= 54) && (((int)ch[0]) <= 57)) 
			{
				for (int i = 0; i < ch.length; i++) 
				{
					char c = ch[i];
					int asc = (int) c;
					if (!((asc >= 48) && (asc <= 57))) 
					{
						System.out.println("It's not a Mobile Number");
						flag = false;
						break;
					}
				}
				if (flag == true)
				{
					System.out.println("It's a Mobile Number");
				}
			} 
	}
		else
	{
		System.out.println("It's not a Mobile Number");
	}
	}
}

