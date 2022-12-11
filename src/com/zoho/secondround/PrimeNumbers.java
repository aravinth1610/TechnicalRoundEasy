package com.zoho.secondround;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		//singlePrime();
		//multiplePrime();
		primeNumberINumber();
	}

	public static void singlePrime()
	{
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int prime=sc.nextInt();
		
		if(prime%2==0)
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("not prime");
		}
	sc.close();	
	}
	
	public static void multiplePrime()
	{
	int[] num= {11,5,4,7,6,12,15};
	for(int i=0;i<num.length;i++)
	{
			if(num[i]%2==0)
			{
				System.out.println("prime"+num[i]);
			}
			
		
	}
	}
	
	public static void primeNumberINumber()
	{
		int num=10;
		
		for(int i=2;i<num;i++)
		{
			if(i%2==0)
			{
				System.out.print("prime");
				System.out.println(i);
			}
		}
		
	}
}
