package com.paratic.zoho.secondRound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.zoho.secondround.Sort;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestPalMain();
	}
	
	public static void a1b10()
	{
		// op-> a3b5
		
		String n="a3b5";
		int chn=0;
		char st=0;
		char[] ch=n.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				if(chn!=0)
				{
					for(int k=0;k<chn;k++)
					{
					    System.out.print(st);
						
					}
					chn=0;                           ///////////////////////
				}
				st=ch[i];
			}
			
			else if(ch[i]>='0' && ch[i]<='9')
			{
				chn=chn*10+ch[i]-'0';       ///////////////
			}
			
		}                                  ///////////////////////
		for(int k=0 ;k<chn;k++)
		{
		 System.out.print(st);
			
		}
	}
	public static void AllPermuationMain()
	{
		//OP: ABC ACB BCA BAC CAB CBA....
		
		String n="ABC";
		String st="";
		AllPermuation(n,st);
		
	}
	public static void AllPermuation(String n,String st)
	{
		if(n.length()==0)
		{
			System.out.print(st+" ");
		}
		
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			
			String dst=n.substring(0,i)+n.substring(i+1);     ////////////
		
			AllPermuation(dst,st+ch);
			
		}
		
	}
	
	public static void AllSubSeqMain()
	{
		//op ->a, b, c, ab, bc, ac, abc...
		
		String n="ZXY";
		String st="";
		AllsubSeq(n,st);
		
	}
	public static void AllsubSeq(String n,String st)
	{
		if(n.length()==0)
		{
			System.out.print(st+" ");
		}
		
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			
			String k=n.substring(0,i)+n.substring(i+1);
			AllsubSeq(k,st+ch);
			AllsubSeq(k, st);
		}
	}
	static List<String> ls=new ArrayList<>();
	public static void subseqMain()
	{
		//op ->a, b, c, ab, bc, ac, abc
	
		String n="ABC";
		String st="";
		subseq(n,st);
		
		for(String sls : ls)
		{

 if(sls.length()==2)
{
	System.out.print(sls);
}
 	
	}
	
	for(String sls : ls)
	{

if(sls.length()==3)
{
System.out.print(sls);
}
	}
	for(String sls : ls)
	{

if(sls.length()==4)
{
System.out.print(sls);
}
	}
}
	
	public static void subseq(String n,String st)
	{
		if(n.length()==0)
		{
			ls.add(st+" ");
			return;                                 //////////
		}
		subseq(n.substring(1),st+n.charAt(0));
		subseq(n.substring(1),st);
			
		
	}
	
	public static void duplicatCount()
	{
		//op -> ara 2  ravi 2 ram 3  7
	
		
		String[] n= {"ara","ravi","ara","ram","ram","ravi","ram"};
	List<String> ls=new ArrayList<>(Arrays.asList(n));	
	
	Set<String> st=new LinkedHashSet<>(ls);
	int c=0;
	for(String dt : st)
	{
		int cd=Collections.frequency(ls, dt);
		System.out.println(dt+" "+cd);
		c+=cd;
	}
	System.out.println(c);
	}
	
	public static void nameString()
	{
		String n="Maximumi of mimnimum";
		List<Character> ls=new ArrayList<>();
		char[] ch=n.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&& ch[i]!=' ')
				{
					ls.add(ch[i]);
					ch[i]='0';
				}
			}
		}
		Set<Character> sch=new LinkedHashSet<>(ls);
		for(Character chd : sch)
		{
			System.out.println(chd);
		}
				}
	
	
	public static void preIncpreDec()
	{
		//op ->{7, 1, 6, 2, 5, 3, 4} 
		
		Integer[] n={1, 6, 4, 3, 7,5, 2};
		 int f=0;
		 int l=n.length-1;
		 Arrays.sort(n);                /////////////
		 
		 for(int i=0;i<n.length;i++)
		 {
			 if(f<l) {
			 System.out.print(n[l--]);
			 System.out.print(n[f++]);
			 }
		 }
	}
	
	public static void smallerstLarg()
	{
		Integer[] n= {18,12,13,4,20,11,3};
		int max=n[0];
		int min=n[0];
		
		for(int i=0;i<n.length;i++)
		{
				if(max<n[i])
				{
					max=n[i];
				}
				
				if(min>n[i])
				{
					min=n[i];
				}
		}
		
		System.out.println(max+" "+min);
		}
	
	public static void SecThiFouLargestNum()
	{
	
		int[] n= {60,1,20,65,40,11,4,6,0,50,70,75};		
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					int t=n[i];
					n[i]=n[j];
					n[j]=t;
				}
			}
		}
		System.out.println(n[n.length-3]);
		
	}
	public static void longestPalMain()
	{
		String p="bananas";
		int l=0;
		int st=0;
		for(int i=0;i<p.length();i++)
		{
			int k=longestPal(p,i,i);
			int k2=longestPal(p,i,i+1);
		int m=Math.max(k, k2);
		
		if(l<m)
		{
			st=i-(m-1)/2;                ///////////
		    l=m;
		}
		
		}
		System.out.println(p.substring(st,st+l));
		
		
	}
	public static int longestPal(String p,int l,int r) {           //////////////
		
		while(l>=0 && r<p.length() && p.charAt(l) == p.charAt(r))     /////////
		{
			l--;
			r++;
		}
		return r-l-1;                                              //////////////
	}
	
	public static void fibnones()
	{
		int[] n= {92,93,94};
		
		for(int i=0;i<n.length;i++)
		{
		System.out.println(n[i]);
		}
		
		for(int j=0;j<10;j++)
		{
		int t=n[0]+n[1];
		System.out.println(t);
		n[0]=n[1];
		n[1]=t;
		}
	}
public static void pal()
{
	int n=626;
	int st=n;
	int ln=0;
	while(n!=0)
	{
		int l=n%10;
		ln=ln*10+l;
		n=n/10;
	}
	
	if(st==ln)
	{
		System.out.println("pal");
	}
	else
	{
		System.out.println("no");
	}
}

public static void amst()
{
	int n=153;
	int ln=0;
	while(n!=0)
	{
		int l=n%10;
		ln=ln+(l*l*l);
		n=n/10;
		
	}
	
	System.out.println(ln);
	
}
public static void p1()
{
//	1    5  
//	 2  4   
//	  3    
//	 2  4   
//	1    5 
	
	String n="12345";
	
	for(int i=0;i<n.length();i++)
	{
		int l=n.length()-1-i;
		
		for(int j=0;j<n.length();j++)
		{
			if(i==j || j==l)                              //////////
			{
				System.out.print(n.charAt(j));         ///////////
			}
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}

public static void p2()
{
     //   *
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
		for(int k=i;k<=5;k++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=2*i-1;j++)
		{
			
			if(i==5 || j==1 || j==2*i-1)
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
	for(int i=4;i>=1;i--)
	{
		for(int k=i;k<=5;k++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=2*i-1;j++)
		{
			
			if(j==1|| j==2*i-1)
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
public static void p3()
{
	/*
	 *       1 
	        2 3 
	       4 5 6 
	      7 8 9 10 
	   11 12 13 14 15 
	 */
	int s=1;
	
	for(int i=1;i<=5;i++)
	{
	
		for(int k=5;k>=i;k--)
		{
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--)
		{
			System.out.print(s+" ");
			s++;
		}
		System.out.println(" ");
	}
}
public static void primeNum()
{
	int n=10;

	for(int i=2;i<=n;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
		
}

public static void reverseString()
{
	//iH nam woh era uoy
	
	String n="Hi man how are you";
	
	String[] st=n.split(" ");
			String rest="";
	for(String s : st)
	{
		String sp=s+" ";
		char[] ch=sp.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
		rest+=ch[i];	
		}
	}
	System.out.println(rest);
}
public static void numser()
{
	//1 2 4 5 6 15 14 12 11
	
	int[] n= {1,4,2,5,11,15,12,6,14};
	Arrays.sort(n);
	
for(int i=0;i<=n.length/2;i++)
{
  System.out.println(n[i]);
}

for(int k=n.length-1;k>n.length/2;k--)
{
  System.out.println(n[k]);
}
}

public static void p4()
{
   /*
	 * c
	 *co
	 com
	come
   comew
  comewe
 comewel 
	 */	
	
	String n="welcome";
	String nr="";
	char[] ch=n.toCharArray();
	
	
	
	for(int i=ch.length/2;i<=ch.length-1;i++)
	{
	nr+=ch[i];
	}
	
	for(int i=0;i<ch.length/2;i++)
	{
	nr+=ch[i];
	}
	
	for(int i=0;i<nr.length();i++)
	{
		for(int k=i;k<nr.length();k++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print(nr.charAt(j));
		}
		System.out.println(" ");
	}
}
 public static void removingDupl()
 {
	 //Op->  CsharptZ
	 
	 String n="CsharpstarZ";
	 
	 char[] ch=n.toCharArray();
	 
	 Set<Character> s=new LinkedHashSet<>();
	 
	 for(int i=0;i<ch.length;i++)
	 {
		 s.add(ch[i]);
	 }
	 for(Character chs : s)
	 {
		 System.out.print(chs+" ");
	 }
	 
 }
public static void FLSS()
{
	// Op-> 9 18 11 8 20 4 100
	
	Integer[] n= {9,4,20,18,11,8,100};
	
	List<Integer> ev=new  ArrayList<>();
	List<Integer> od=new  ArrayList<>();
	for(int i=0;i<n.length;i++)
	{
		if(i%2==0)
		{
			ev.add(n[i]);
		}
		if(i%2!=0)
		{
		od.add(n[i]);
		}
	}
	
	Collections.sort(ev);
	Collections.sort(od,Collections.reverseOrder());
	
	for(int i=0;i<ev.size();i++)
	{ 
		System.out.print(ev.get(i)+" ");
		for(int j=0;j<od.size();j++)
		{
			if(i==j)
			{
				System.out.print(od.get(j)+" ");
			}
		}
	}
	}

public static void CapToSmall()
{
	//op->  #b#c#B
	
	String n="aBAcAba";
	char[] ch=n.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='A' || ch[i]=='a')
		{
			ch[i]='#';
		}
		
	}
	for(int i=0;i<ch.length;i++)
	{
		if(Character.isLowerCase(ch[i]))
		{
			System.out.print(Character.toUpperCase(ch[i]));
		}
		else if(Character.isUpperCase(ch[i]))
		{
			System.out.print(Character.toLowerCase(ch[i]));
		}
		else
		{
			System.out.print(ch[i]);
		}
	}
}

public static void geeks()
{
	/*
	 * op->     geeks
                eeksg
                eksge
                ksgee
                sgeek
	 */
	
	String n="geeks";
	
	for(int i=0;i<n.length();i++)
	{
		for(int j=i;j<n.length();j++)
		{
			System.out.print(n.charAt(j));
		}
		for(int j=0;j<i;j++)
		{
			System.out.print(n.charAt(j));
		}
		System.out.println(" ");
	}
	
}
public static void swap1()             //////////////////**
{
	//op-> 21435
	
	int[] n= {4,2,1,5,3};
	
	for(int i=0;i<n.length-1;i++)
	{
		if(n[i]>n[i+1]) 
		{
			int t=n[i];
			n[i]=n[i+1];
			n[i+1]=t;
		}
		
	}
	
	for(int i=0;i<n.length;i++)
	{
		System.out.print(n[i]);
	}
	}
public static void swap2()             /////////////**
{
	//op-> 345782196
	
int[] n= {3,5,7,8,4,2,1,9,6};

for(int i=0;i<=n.length/2;i++)
{
	for(int j=i+1;j<=n.length/2;j++)         //////////////
	{
		if(n[i]>n[j])
		{
			int t=n[i];
			n[i]=n[j];
			n[j]=t;
		}
	}
}

for(int i=0;i<n.length;i++)
{
	System.out.print(n[i]);
}}

}
