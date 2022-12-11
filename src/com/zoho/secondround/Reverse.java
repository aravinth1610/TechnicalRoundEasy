package com.zoho.secondround;

public class Reverse {

	public static void main(String args[])
	{
		reverseEachWord();
		//reverseString();
		//reverseNumber();
	}
	
	public static void reverseString()
	{
		String name="ramragul jgjh";
		
		char[] charName=name.toCharArray();
		
		for(int i=charName.length-1;i>0;i--)
		{
			System.out.print(charName[i]);
		}
	}
	
	public static void reverseEachWord()
	{
		String name="ramragul gopal";
		String[] sp=name.split(" ");
		String data="";
		for(String split : sp)
		{
			String dds=split+" ";
			char[] charName=dds.toCharArray();
			for(int i=charName.length-1;i>=0;i--)
			{
				data+=charName[i];
			}
		}
		System.out.println(data);
	}
public static void reverseNumber()
{
	int num=1123;
	int n = 0;
	while(num>0)
	{
		int last=num%10;
        n=n*10+last;
		num=num/10;
	}
System.out.println(n);
}
}
