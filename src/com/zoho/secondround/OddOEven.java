package com.zoho.secondround;

public class OddOEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddOeven();
	}
	
	public static void oddOeven()
	{
		int[] num= {1,4,2,7,10}; 
	
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println("even"+num[i]);
			}
			else if(num[i]%2!=0)
			{
			System.out.println("odd"+num[i]);	
			}
		}
	
	}

}
