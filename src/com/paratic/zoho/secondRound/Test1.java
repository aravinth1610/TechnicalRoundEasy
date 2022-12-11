package com.paratic.zoho.secondRound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

	
	public static void a1b10()
	{
		/*
		 * op
		 * a1b10
		 */
		
		String sum="a1b10";
		char[] ch=sum.toCharArray();
		char st = 0;
		int s=0;
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]>='a' && ch[i]<='z')
			{
              if(s!=0)
              {
            	  for(int k=0;k<s;k++)
            	  System.out.println(st);
          
              }
          	  s=0;
              st=ch[i];
			}
			
			if(ch[i]>='0' && ch[i]<='9')
			{
				s=s*10+ch[i]-'0';
			}
			
			
		}
		 for(int k=0;k<s;k++)
         	  System.out.println(st);
		
	}
	
	public static void AllpermutationString(String word,String st)
	{
		/*
		 * Output : ABC ACB BCA BAC CAB CBA
		 */
		
		if(word.length()==0)
		{
		System.out.println(st);	
		}
		
		for(int i=0;i<word.length();i++)
		{
			
			
			char ch=word.charAt(i);
			
			String k=word.substring(0,i)+word.substring(i+1);
			
			AllpermutationString(k,st+ch);
			
		}
		}
	
	public static void subAllpermutationStringMain()
	{
		String word="ABC";
		String st="";
		AllpermutationString(word,st);
		
	}
	
	static List<String> l=new ArrayList<String>();
	
	public static void AllsubSequences(String words,String st)
	{
		
		
		if (words.length() == 0) {
			
			
			
		//	System.out.println(st);
			l.add(st);
			
		return;
		}

		char ch=words.charAt(0);
		
		
		AllsubSequences(words.substring(1),ch+st);
		
		AllsubSequences(words.substring(1),st);
		
	}
	
	public static void AllsubSequencesMain()
	{
		/*O.P
		 * a, b, c, ab, bc, ac, abc
		 */
		
		String word="ABC";
		String st="";
		AllsubSequences(word,st);
		
		String allSt[]=new String[l.size()];
		
		int k=0;
		
		for(int i=0;i<l.size();i++)
		{
			
			allSt[k++]=l.get(i);
			
		}
		Arrays.sort(allSt);
		
		System.out.println(Arrays.toString(allSt));
	}
	
	
	public static void duplicateStringArray()
	{
		String[] names= {"ara","ravi","ara","ram","ram","ram","ara"};
		List<String> st=new ArrayList<>();
		int count=0;
		for(int i=0;i<names.length;i++)
		{
			int c=1;
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i]==names[j])
				{
					c+=1;
					System.out.println(names[i]+" "+c);
					count+=c;
					
				}
			}
		}
		System.out.println(count);
		
	}
	
	public static void findDuplicate()
	{
		String n="Maximumi of mimnimum";
		
		char[] ch=n.toCharArray();
		String st="";
		
		Set<Character> word=new LinkedHashSet<>();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					word.add(ch[i]);
					ch[i]='0';
				}
			}
		}
		
		for(Character chs: word)
		{
			System.out.println(chs);
				}
	}
	
	public static void firstMaxSecMi()
	{
		/*OP
		 * {7, 1, 6, 2, 5, 3, 4} 
		 */
		
		int[] num={1, 6, 4, 3, 7,5, 2};
		
		Arrays.sort(num);
		
		int i=0,j=num.length-1;
		
		for(int k=0;k<num.length;k++)
		{
			if(i<j) {
			System.out.print(num[j--]);
			System.out.print(num[i++]);
			}
		}
		
	}
	
	public static void KadanePreInst()
	{
		/*
		 * op
		 * 8
		 */
		
		int[] arr= {-2, -3, 4, -1, -2, 2, 5, -3};
		
		int st=0;
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
		st=st+arr[i];
		
		//System.out.println(st);
		if(st<0)
		{
		
			st=0;
		}
		
		if(ans<st)
		{
			ans=st;
		}
		
		
		}
		System.out.println(ans);
		
	}
	
	public static void smALar()
	{
	 int[] num= {18,12,13,4,20,11,3};
	 int max=num[0],min=num[0];
	 for(int i=0;i<num.length;i++)
	 {
		
			if(max<num[i])
				max=num[i];
			
			if(min>num[i])
				min=num[i];
		
	 }
	 System.out.println(max+" "+min);
	 
	}
	
	public static void LarASmallSecFirThi()
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
		System.out.println(num[num.length-3]);
	}
	
	public static void longestPali()
	{
		String str="bananas";
		int st=0;
		int start=0;
		for(int i=0;i<str.length();i++)
		{
			
			int l=lPal(str, i, i);
		int l2=	lPal(str, i, i+1);
		int longest=	Math.addExact(l, l2);
			if(st<longest)
			{
			    start=i-(longest-1)/2;
				st=longest;
			}
		}
		System.out.println(str.substring(start,st));
	}
	
	public static int lPal(String str,int l, int r)
	{
		while(l>=0 && r<str.length() && str.charAt(r)==str.charAt(l))
		{
			l--;
			r++;
			
		}
		return r-l-1;
	}
	
	public static void fibnone()
	{
		int pal=10;
		int a=1,b=2;
		System.out.print(a+"\n"+b+"\n");
		
		for(int i=2;i<pal;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
	
	public static void fibnoneArray()
	{
		int[] num= {97,98,99};
		System.out.print(num[0]+"\n"+num[1]+"\n"+num[2]+"\n");
		for(int i=3;i<10;i++)
		{
			int c=num[0]+num[1];
			System.out.println(c);
			num[0]=num[1];
			num[1]=c;
		}
	}
	
	public static void palidrome()
	{
		int pal=121;
		int k=pal;
		int s=0;
		while(pal!=0)
		{
			
		int l=pal%10;
		s=s*10+l;
		pal=pal/10;
		
	}
	}
		public static void Amstrong()
		{
			int n=153;
			int s=0;
			while(n!=0)
			{
				int l=n%10;
				s=s+(l*l*l);
				n=n/10;
			}
		System.out.println(s);	
		}
	
		public static void pattern1()
		{
			/*
1    5  
 2  4   
  3    
 2  4   
1    5  

			 */
			String num="12345";
			
			for(int i=0;i<num.length();i++)
			{
				int k=num.length()-i-1;
				for(int j=0;j<num.length();j++)
				{
					if(i==j || j==k)
					{
						System.out.print(num.charAt(j));
					}
					System.out.print(" ");
				}
				System.out.println(" ");
			}
			
		}
		
		public static void pattern2()
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
					if(i==5||j==2*i-1||j==1)
					System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
				
			}
			
			for(int i=5;i>=1;i--)
			{
				for(int k=i;k<=5;k++)
				{
					System.out.print(" ");
				}
				
				for(int j=1;j<=2*i-1;j++)
				{
					if(j==2*i-1||j==1)
					System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
				
			}
		}
	public static void pattern3()
	{
		/*
		 *       1 
		        2 3 
		       4 5 6 
		      7 8 9 10 
		   11 12 13 14 15 
		 */
		
		
		int l=1;
		for(int i=1;i<=5;i++)
		{
		//	int l=1;
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=i;k>=1;k--)
			{
				System.out.print(l +" ");
				l++;
			}
			System.out.println(" ");
			
		}
		
	}
	
	public static void primeNumber()
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
	
	public static void reverse()
	{
		String name="Hi man how are you";
		
		String st="";
		
		String[] sp=name.split(" ");
		
		for(String ss : sp)
		{
			String g=ss+" ";
		char[] ch=g.toCharArray();	
			for(int i=ch.length-1;i>=0;i--)
			{
			st+=ch[i];
			}
		}
		System.out.print(st);
	}
	
	public static void sortASCRDEC()
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
		for(int j=num.length-1;j>num.length/2;j--)
		{
			System.out.println(num[j]);
		}
	}
	
	static List<String> st1=new ArrayList<String>();
	static List<String> st2=new ArrayList<String>();
	public static void subSeq()
	{
		/*
		 * The subsequence of m = A,B,C, AB, BC, AC, ABC  and n=A,B,AB

	       The count of common subsequences is 3 that is (A,B AB)
		 */
		
		String n1="ABC";
		String n2="AB";
		String st="";
	swapsub(n1,st);
	swapsub2(n2,st);
	
	for(String sts:st1)
	{
		for(int i=0;i<st2.size();i++)
		{
			if(sts.equals(st2.get(i)))
			{
				System.out.println(sts);
			}
		}
	}
		
	}
	
	public static void swapsub(String n1,String st)
	{
		if(n1.length()==0)
		{
			st1.add(st);
			return;
		}
		
		char s=n1.charAt(0); 
		
		swapsub(n1.substring(1), st+s);
		
		swapsub(n1.substring(1), st);
		
		
	}
	
	public static void swapsub2(String n1,String st)
	{
		if(n1.length()==0)
		{
			st2.add(st);
			return;
		}
		
		char s=n1.charAt(0); 
		
		swapsub2(n1.substring(1), st+s);
		
		swapsub2(n1.substring(1), st);
		
		
	}
	
	public static void printOrder()
	{
		/*OP:
		 * 0 0 0 0 4 3 8 
		 */
		
		List<Integer> st=new ArrayList<>();
		
		int[] arr={0,4,3,0,8,0,0,9,0};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
	//	System.out.println(max);
		
		for(int i=0;i<arr.length;i++)
		{
			if(max>arr[i])
			{
				if(arr[i]==0)
				{
				System.out.print(arr[i]);
				}
				
			if(arr[i]!=0)
			{
				st.add(arr[i]);
			}
			}
		}
		
		for(Integer p : st)
		{
			System.out.print(p);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllsubSequencesMain();
	}

	
	
	
}
