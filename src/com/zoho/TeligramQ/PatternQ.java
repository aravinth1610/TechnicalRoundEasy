package com.zoho.TeligramQ;

public class PatternQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
p1();
	}
	
	
	public static void p1()
	{
		/*
		 * c
		 *co
		 com
		come
	   comew
	  comewe
	 comewel 
		 */
		String n="welcome";
	
		char[] ch=n.toCharArray();
		int l=ch.length/2;
	    		 
		String st="";
	
		for(int i=ch.length/2;i<=ch.length-1;i++)
		{
			st=st+ch[i];
		}
		for(int j=0;j<ch.length/2;j++)
		{
			st=st+ch[j];
		}
	
		char[] std=st.toCharArray();
		
		for(int i=0;i<std.length;i++)
		{
			for(int k=std.length;k>i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(std[j]);
			}
			System.out.println(" ");
		}
	}


	
}
