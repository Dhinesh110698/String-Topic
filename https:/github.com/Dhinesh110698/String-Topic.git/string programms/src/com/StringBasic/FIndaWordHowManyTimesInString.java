package com.StringBasic;

public class FIndaWordHowManyTimesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String s="If you think you can do it, you can do it";
		String [] c=s.split(" ");
		int count=0;
		for(int i=0;i<c.length;i++)
		{
		//	if(c[i].equals("can"))  // how many times "can"word present
			//{
				count++;
			//}
		}
System.out.println(count);
	}
}       */
		
		
		String str="welcome to india";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count+1);
	}
}      
		



