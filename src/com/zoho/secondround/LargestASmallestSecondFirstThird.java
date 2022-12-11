package com.zoho.secondround;

public class LargestASmallestSecondFirstThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secondLargest();
	}
	
	public static void secondLargest()
	{
		int[] num= {60,1,20,65,40,11,4,6,0,50,70,75};
		
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
	 System.out.println(num[num.length-2]);
	}

}
