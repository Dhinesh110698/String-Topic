package com.StringBasic;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []n= {"abacus","bird","apple","cat","tiger","top","aeroplane","fish","python","php","pal"};
		int len=n.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(n[i].compareTo(n[j])>0)
						{
							String temp=n[i];
							n[i]=n[j];
							n[j]=temp;
							
						}
					}
				}
		
		for(int i=0;i<len;i++)
		{
			System.out.println(n[i]);
		}
		

	}
}


