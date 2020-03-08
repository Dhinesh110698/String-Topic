package com.StringBasic;

public class ReplaceOneAutoChangeSameWordInGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="If you think you can do it, you can do it";
		String [] c=s.split(" ");
	
		for(int i=0;i<c.length;i++)
		{
			if(c[i].equals("can"))
			{
				c[i]="dsp";
			}
		}
		for(int i=0;i<c.length;i++)
		{
			
			System.out.print(" "+c[i]);
		}
	}

	}


