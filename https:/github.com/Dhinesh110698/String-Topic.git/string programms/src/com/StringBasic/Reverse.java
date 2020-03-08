package com.StringBasic;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Dhinesh";
		String rev=" ";
			char []n=name.toCharArray();
      for(int i=name.length()-1;i>=0;i--)
      {
    	   rev=rev+n[i];
      }
      System.out.println(rev);
	}

}
