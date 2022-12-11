package com.zoho.secondround;

import java.util.Arrays;

public class KadanePreInst {

	/*
	 * Output : 7
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumAl();
		
	}

	public static void sumAl()
	{
		
		/*
		 * op
		 * 8
		 */
		
		int[] arr= {-2, -3, 4, -1, -2, 2, 5, -6};
		int data = 0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			data+=arr[i];
		//	System.out.println(data);
				if(data<0)
			{
				data=0;
			}
			
			if(max<data)
			{
				max=data;
			}
			
		}
		System.out.println(max);
	}
}
