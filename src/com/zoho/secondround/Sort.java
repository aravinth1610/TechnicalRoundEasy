package com.zoho.secondround;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
	//	sortArrayString();
	//	sortArrayInteger();
		//sortString();
		sortFirstASCSecondDES();
	}
public static void sortArrayString()
{
	String[] names={"aravinth","ram","ravi","balu","zebbezer"};
	
	for(int i=0;i<names.length;i++)
	{
		for(int j=i+1;j<names.length;j++)
		{
		//	System.out.println(names[i].compareTo(names[j]));
			if(names[i].compareTo(names[j])>0)
			{
				String temp=names[i];
				names[i]=names[j];
				names[j]=temp;
			}
		}
		System.out.println(names[i]);
	}
	//System.out.println(Arrays.toString(names));
}

public static void sortArrayInteger()
{
	int[] num= {1,5,2,3,6,0};

	for(int i=0;i<num.length;i++)
	{
		for(int j=i+1;j<num.length;j++)
		{
			if(num[i]>num[j])
			{
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
			}
		}
		System.out.println(num[i]);
	}	
}
public static void sortString()
{
	String name="aravinthb";
    char[] split=name.toCharArray();
    for(int i=0;i<split.length;i++)
    {
    for(int j=i+1;j<split.length;j++)
    {
    	if(split[i]>split[j])
    	{
    		char temp=split[i];
    		split[i]=split[j];
    		split[j]=temp;
    	}
    }
    System.out.println(split[i]);	
    }
}

public static void sortFirstASCSecondDES()
{

	int[] num= {1,4,2,5,11,15,12};
	for(int i=0;i<num.length;i++)
	{
		for(int j=i+1;j<num.length;j++)
		{
			if(num[i]>num[j])
			{
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
			}
		}
	}
	
	for(int i=0;i<num.length/2;i++)
	{
		System.out.println(num[i]);
	}
	
	for(int i=num.length-1;i>=num.length/2;i--)
	{
		System.out.println(num[i]);
	}
	
	
}

}
