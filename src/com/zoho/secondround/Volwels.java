package com.zoho.secondround;

public class Volwels {

	public static void main(String args[])
	{
		//volwelsIString();
		volwelsIArray();
	}
	
	public static void volwelsIString()
	{
		System.out.println("df");
		String name="ramravigopal";
	    char[] split=name.toCharArray();
		char[] volwels= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<volwels.length;i++)
		{
			
			for(int j=0;j<split.length;j++)
			{
				if(volwels[i]==split[j])
				{
					count+=1;
					System.out.println(split[j]);
				}
				else
				{
				//	System.out.println(split[j]);
				}
				
			}
		}
		System.out.println(count);
	}
	
	public static void volwelsIArray()
	{
		String[] names= {"ravi","ram","ragul","gopal"};
		char[] volwels= {'a','e','i','o','u'};
		int count=0;
		for(String n : names)
		{
			char[] namesChar=n.toCharArray();
			for(int i=0;i<namesChar.length;i++)
			{
				for(int j=0;j<volwels.length;j++)
				{
					if(namesChar[i]==volwels[j])
					{
						System.out.println(namesChar[i]);
						count+=1;
					}
				}
			}
		}
		System.out.println(count);
	}
	
}
