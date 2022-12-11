package com.zoho.TeligramQ;

public class PatternString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//op -> bbbcccaaa
		
		String p="bxyzca";
		
		String str="abcabcabc";
		
		
		char[] pt=p.toCharArray();
		char[] strch=str.toCharArray();
		
		for(int i=0;i<pt.length;i++)
		{
			for(int j=0;j<strch.length;j++)
			{
				if(pt[i]==strch[j])
				{
					System.out.print(strch[j]);
				}
			}
		}
 		

	}

}
