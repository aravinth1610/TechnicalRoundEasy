package com.zoho.secondround;

public class ValidShuffleTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaildShuffle();
	}
	
	public static void vaildShuffle()
	{
		String n="onetwofour",n1="hellofourtwooneworld";
		
		
		
		char[] ch=n.toCharArray();
		char[] ch2=n1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch[i]!=ch2[j])
				{
			//		System.out.print(n.concat(n1));
				}
				
			}
		}
		
		
	}

}
