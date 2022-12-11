package com.zoho.secondround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequenceTwoString {

	/*
	 * The subsequence of m = A,B,C, AB, BC, AC, ABC  and n=A,B,AB

       The count of common subsequences is 3 that is (A,B AB)
	 */
	
	static List<String> ls=new ArrayList<String>();
	static List<String> lss=new ArrayList<String>();

	public static void main(String[] args) {
		

		String n1="ABC";
		String n2="AB";
		int count=0;
		
    swap1(n1,"");
    swap2(n2,"");
	//System.out.println(Arrays.asList(ls.toString()));
	//System.out.println(Arrays.asList(lss.toString()));

	for(String ss : ls)
	{
		for(int i=0;i<lss.size();i++)
		{
			if(ss.equals(lss.get(i)) && !ss.isEmpty() && !lss.isEmpty() )
			{
				count=count+1;
				System.out.println(lss.get(i));
			}
		}
	}
	System.out.println(count);
	
	}
public static void swap1(String n1,String e)
{
	if (n1.length() == 0) {
	
		//System.out.println(e);
		ls.add(e);
	//	lss.add(e);
		return;
	}

	char ch=n1.charAt(0);
	
	
	swap1(n1.substring(1),ch+e);
	
	swap1(n1.substring(1),e);

}
public static void swap2(String n2,String ee)
{
	if (n2.length() == 0) {
	
		lss.add(ee);
	//	lss.add(e);
		return;
	}

	char ch=n2.charAt(0);
	
	
	swap2(n2.substring(1),ch+ee);
	
	swap2(n2.substring(1),ee);

}
}
