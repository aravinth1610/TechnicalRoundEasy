package com.zoho.secondround;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnknowName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printNum();
		printIOrder();
		//replace();
	}

	public static void printNum()
	{
		/*
		 * O.p
		 * 
		 * 9 9 9 9 -1
		 * 
		 */
		
		int arr[]={4,5,6,7,9};
		
		
		int a;
		
		for(int i=0;i<arr.length;i++)
		{
				
			if(arr[arr.length-1]==arr[i])
			{
			System.out.println(-1);
			}
			else {
				System.out.println(arr[arr.length-1]);
			}
			
		}
		
	}
	
	public static void printIOrder()
	{
		/*OP:
		 * 0 0 0 0 4 3 8 
		 */
				
		int max=0;
		
		List<Integer> ls=new ArrayList<>();
		
		int[] arr={0,4,3,0,8,0,0,9,0};
		int dd=0;
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]!=0)
				{
					dd=Math.max(arr[i],arr[i]);
					ls.add(arr[i]);
				}
			if(arr[i]==0)
			{
				System.out.print(arr[i]);
			}
		}
	for(Integer v : ls)
	{
	if(v<dd) {
		System.out.print(v);
	}
	}
	}
	
	public static void replace()
	{
		/*
		 * O.P
		 * 
		 * 7121134
		 */
		
		int n=7020134;
		int s = 0,ss=0;
		while(n!=0)
		{
			int l=n%10;
			if(l==0)
			{
				//System.out.print(1);
				l=1;
			}
			s=s*10+l;
			n=n/10;
			
		}
	//	System.out.println(s);
	while(s!=0)
	{
		int l=s%10;
		ss=ss*10+l;
		s=s/10;
	}
	System.out.println(ss);	
	}
	
}
