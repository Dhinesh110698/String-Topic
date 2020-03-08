package com.StringBasic;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"dhinesh","praveen","india"};
		int count=0;
		for(int i=0;i<name.length;i++)
		{
		char[] na=name[i].toCharArray();
			char f=na[0];
			switch (f)
			{
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					count++;
			}
		}
		System.out.println(count);

	}

}
