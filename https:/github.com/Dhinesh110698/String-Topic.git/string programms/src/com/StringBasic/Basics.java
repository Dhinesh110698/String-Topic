package com.StringBasic;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String name="Dhinesh";
		int l=name.length();
		System.out.println(l);   */
		
	/*	String name="Dhinesh";
		char []n=name.toCharArray();
		System.out.println(n[2]);   */
		
	/*	String name="Dhinesh";
		int index=name.indexOf('e');
		System.out.println(index);   */
		
		
	/*	String name="Dhinesh";
		char c=name.charAt(6);
		System.out.println(c);   */
		
		
	/*	String name="Dhinesh";
		String sub=name.subString(1);
		System.out.println(sub);   */
		
		
		String s1=new String("java");
		String s2=new String("java");
	//	boolean b=s1.equals(s2);
		System.out.println(s1.equals(s2));
        System.out.println(s1==s2);	
        
        String s3="python";
        String s4="python";
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        System.out.println(s3.equalsIgnoreCase(s4));
	}

}
