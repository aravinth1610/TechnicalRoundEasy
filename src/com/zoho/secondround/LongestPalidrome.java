package com.zoho.secondround;

public class LongestPalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestsubStringPalidrome();
	}
	
	public static void longestsubStringPalidrome()
	{
		String str="bananas";
		int subs=0;
		int start=0;
		for(int i=0;i<str.length();i++)
		{
		int l =	sub(str,i,i);
		int l2=	sub(str,i,i+1);
			int l3=Math.max(l, l2);
			if(l3 > subs)
			{
				start=i - (l3 - 1 )/2;
				subs=l3;
			}
		}
		System.out.println(str.substring(start,start+subs));
		
	   }

	public static int sub(String in,int l,int r)
	{
		
		while(l>=0 && r<in.length() && in.charAt(r) == in.charAt(l))
		{
			l--;
			r++;
		} 
	//	System.out.println(l-r-1);
		return r-l-1;
	}

}
