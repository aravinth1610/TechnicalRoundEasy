package com.zoho.secondround;

public class PalidromeAFibnoneAmstrong {

	public static void main(String[] args) {
	//	fibnoneSeries();
	//	fibnoneSeriesTotal();
		fibnoneArray();
	//	palindrome();
	//	AmstromgNum();
	}

	public static void fibnoneSeries()
	{
		int num=10;
		int a=0,b=1,c;
		System.out.print(a+"\n"+b+"\n");
		for(int i=2;i<num;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
	
		}
		
		
		}
	public static void fibnoneSeriesTotal()
	{
		int num=10;
		int a=0,b=1,c;
	//	System.out.println(a+" "+b);
		for(int i=2;i<num;i++)
		{
			c=a+b;
			a=b;
			b=c;
	
		}
		System.out.println(b);
	}
	
	public static void palindrome()
	{
		int num=313,sum=0;
		int lastDigit = 0;
		
		int t=num;
		
		for(int i=0;i<=num;i++)
		{
			int last=num%10;	
		    sum=(sum*10)+last;     //formulat 
		num=num/10;
		}
		System.out.println(num+" "+sum);
		if(t==sum)
		{
			System.out.println("palinorme");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	
	public static void AmstromgNum()
	{
		int num=153;
		int n=num;
		int amst = 0;
		while(num>0)
		{
			int last=num%10;
			 amst+=(last*last*last);
			num=num/10;
		}
		System.out.println(amst+" "+n);
		if(amst==n)
		{
			System.out.println("amst");
		}
		else
		{
			System.out.println("not amst");
		}
		
	}
	
	public static void fibnoneArray()
	{
		int[] num= {92,93,94};
		
		System.out.print(num[0]+"\n"+num[1]+"\n");
		
		for(int i=3;i<=10;i++)
		{
			int c=num[0]+num[1];
			System.out.println(c);
			num[0]=num[1];
			num[1]=c;
		}
	}
	
}
