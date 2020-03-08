package com.StringBasic;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="DsP DhInEsH";
				char []c=name.toCharArray();
				String str=" ";
				for (int i=0;i<name.length();i++)
				{
					for(int j=i+1;j<name.length();j++)
					{
						if(c[i]>c[j])
						{
							char temp=c[j];
							c[j]=c[i];
							c[i]=temp;
						}
					}
				}
				for(int i=0;i<name.length();i++)
				{
					str=str+c[i];
				}
				System.out.println(str);
	
			}
	}


