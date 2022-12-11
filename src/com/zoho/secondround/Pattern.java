package com.zoho.secondround;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numberPatttern();
	//	EnterNumberPrintPattern();
		//pattern3();
		//india();
		//traingle();
		pattern4();
	}

	public static void numberPatttern()
	{
		 String num="12345";  //geeksforgeeks
	
		 for(int i=0;i<num.length();i++)
		 {
		//	 System.out.println(ch[i]);
			int k=num.length()-1-i;
			for(int j=0;j<num.length();j++)
			{
				if( i==j || k==j )
				{
					System.out.print(num.charAt(j));
				}
				System.out.print(" ");
			}
			System.out.println(" "); 
		 }
		 
	}
	
public static void EnterNumberPrintPattern()
{
	/*
	 * 3 1
        2 
       1 3
	 */
	
	int num=3;
	
	for(int i=1;i<=num;i++)
	{
		int j=num-i+1;
		System.out.println(j);
		
//		for(int k=0;k<=num;k++)
//		{
//		
//			if(k==j)
//			{
//				System.out.println(i);
//			}
//	
//		}
	}
}

public static void pattern1()
{
	        //a
			//a b
		    //a b c
		    //a b c d
		    //a  b c
			//a b
			//a
	
	String letter="abcd";
	char[] l=letter.toCharArray();
	for(int i=0;i<4;i++ )
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(l[j]+" ");
		}
		System.out.println(" ");
	}
	
	for(int i=3;i>=0;i--)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(l[j]+" ");
		}
		System.out.println(" ");
	}
}

public static void pattern2()
{
	  // a
	   //a b 
      //a b c
      //a b c d
      //a  b c
 	    //a b
	     //a
	
	String w="abcd";
	char[] c=w.toCharArray();
	for(int i=0;i<4;i++)
	{
	for(int k=i;k<4;k++)
	{
		System.out.print(" ");
	}
	
	for(int j=0;j<=i;j++)
	{
		System.out.print(c[j]+" ");
	}
	System.out.println(" ");
	}
	
	for(int i=3;i>0;i--)
	{
		for(int k=5;k>i;k--)
		{
			System.out.print(" ");
		}
		
		for(int j=0;j<i;j++)
		{
			System.out.print(c[j]+" ");
		}
		
		System.out.println(" ");
	}
}

public static void india()
{
	/*
	 * I
       In
       Ind
       Indi
       India
	 */
	
String word="India";

char[] l=word.toCharArray();

for(int i=0;i<l.length;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print(l[j]);
	}
	System.out.println("");
}
	
}

public static void pattern3()
{
              //  *
		    //   * *
		    //  *   *
			// *     *
			//*********
			// *     *
			//  *   *
			//   * *
			//    *
	
	for(int i=1;i<=5;i++)
	{
		for(int k=5;k>i;k--)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=2*i-1;j++)
		{
			if(i==5||j==2*i-1|| j==1)
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
}

public static void traingle()
{
/*
 *       1 
        2 3 
       4 5 6 
      7 8 9 10 
   11 12 13 14 15 
 */
	int k=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)
		{
			System.out.print(" ");
		}
		
		for(int l=1;l<=i;l++)
		{
			System.out.print(k+" ");
			k++;
		}
		System.out.println(" ");
	}
}

public static void pattern4()
{
	
	/*
	 *     e 
	 *   c  c
	   a      a
	 r         r
	  a       a
	    c   c
	 *    e
	 * 
	 * 
	 */
	String name="racecar";
	
	if(name.length()%2==0)
	{
		System.out.println("Not Possible");
	}
	else
	{
for(int i=0;i<5;i++)
{
	for(int j=i;j<4;j++)
	{
		System.out.print(" ");
	}
	
	for(int k=0;k<2*i+1;k++)
	{
		System.out.print(name.charAt(k)+" ");
	}
	System.out.println(" ");
}
	}
	
}

}
