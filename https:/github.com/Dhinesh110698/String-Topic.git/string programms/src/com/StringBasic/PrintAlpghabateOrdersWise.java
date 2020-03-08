package com.StringBasic;

public class PrintAlpghabateOrdersWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="Dhinesh";
		char []c=n.toCharArray();
		String rev=" ";
		for(int i=0;i<=n.length()-1;i++)
		{
			for(int j=i+1;j<=n.length()-1;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[j];
					c[j]=c[i];
					c[i]=temp;
				}
			}
		}
		for(int i=0;i<=n.length()-1;i++)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
	}

}
