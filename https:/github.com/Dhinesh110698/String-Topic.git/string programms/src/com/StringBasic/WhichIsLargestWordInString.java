package com.StringBasic;

public class WhichIsLargestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="If you think you can do it, you can do it";
		String [] c=s.split(" ");
		int count=0;
		int max=0;
		int index=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i].length()>max)
			{
		max=c[i].length();
		index=i;
				}
				}
		System.out.println(c[index]);
			}


	}

