package com.StringBasic;

public class HowManyTimesInLettersGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String name="praveen";
		char ch='e';
		char [] nameArr=name.toCharArray();
		for(int i=0;i<nameArr.length;i++)
		{
			if(ch==nameArr[i])
			{
				count++;
			}
		}
System.out.println(count);
	}

}
