package com.zoho.TeligramQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovingDupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//op : CsharptZ
		
		String name="CsharpstarZ";
	
	Set<Character> re=new LinkedHashSet<Character>();
	
	char[] ch=name.toCharArray();
	
	for(int i=0;i<ch.length;i++)
	{
		re.add(ch[i]);
	}
	
for(Character st : re)
{
	System.out.print(st);
}
	
	
	
		
	}

}
