package com.zoho.secondround;

public class AllSubSequenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*O.P
		 * a, b, c, ab, bc, ac, abc
		 */
		
		String sub="ABC";
		subSequence(sub,"");
	}
	
	public static void subSequence(String name,String l)
	{
	 if(name.length()==0)
	 {
		 System.out.print(l+" ");
	 }
	 
	 for(int i=0;i<name.length();i++)
	 {
		 char ch=name.charAt(i);
		 
		 String k=name.substring(0,i)+name.substring(i+1);
		 
		 subSequence(k, l+ch);
		 
		 subSequence(k, l);
	 }
	 
	}
	

}
