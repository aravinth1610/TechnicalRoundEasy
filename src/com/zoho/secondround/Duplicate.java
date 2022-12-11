package com.zoho.secondround;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withoutDulpicateArrayString();
	}
	
	public static void withoutDulpicateArrayString()
	{
		String[] names= {"ram","ravi","ram","rara","ram"};
	
	Set<String> w=new LinkedHashSet<String>();
	for(int i=0;i<names.length;i++)
	{
		w.add(names[i]);
	}
	
//	for(String ss : w)
//	{
//		System.out.println(ss);
//	}
	
		 for(int i=0;i<names.length;i++)
		 {
			 int count=1;
			 for(int j=i+1;j<names.length;j++)
			 {
				 if(names[i]==names[j])
				 {
					 count++;
					 System.out.println(count+names[i]);
				 }
				
			 }
			 
		 }
	
	}

public static void findDuplicate()
{
	String n="Maximumi of mimnimum";
	char[] ch=n.toCharArray();
	String s="";
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j] && ch[i]!=' ')
			{
				s+=ch[j];
				ch[j]='0';
			}
		
		}
		
		
	}
	
	char[] chs=s.toCharArray();
	Set<Character> rem=new LinkedHashSet<>();
	for(int i=0;i<chs.length;i++)
	{
		//System.out.println(s.charAt(i));
		if(s.charAt(i)!='0')
		{
		//	System.out.println(s.charAt(i));
		
			rem.add(chs[i]);
		}
		
	}
	
	int count=0;
	for(Character v : rem)
	{
		count++;
		System.out.println(v);
	}
System.out.println(count);
}




}
