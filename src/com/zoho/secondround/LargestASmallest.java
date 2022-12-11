package com.zoho.secondround;

public class LargestASmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallALarge();
	}
	
	public static void smallALarge()
	{
		int[] num= {1,20,40,11,4,6,50,70};
	int max=num[0],min=num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(max>num[i])
			{
				max=num[i];
				System.out.println(max);
			}
			
			if(min<num[i])
			{
				min=num[i];
				System.out.println(min);
			}
		}
	System.out.println(max+" "+min);
	}

}
