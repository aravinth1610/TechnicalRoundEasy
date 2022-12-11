package com.zoho.TeligramQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class sortFre {

	public static void main(String[] args) {
		int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5,4};
		
		List<Integer> l=new ArrayList<>(Arrays.asList(4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5,4)) ;
		
		
		Set<Integer> s=new LinkedHashSet<Integer>(l);
		
		Map<Integer, Integer> m=new LinkedHashMap<>();
		int ss=0;
		for(Integer c : s )
		{
		int fr=  Collections.frequency(l, c);
			m.put(c, fr);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(m.entrySet());
		list.sort(Entry.<Integer, Integer>comparingByValue().reversed());		
		
		String k="";
		String v="";
		//list.sort(Map.Entry.comparingByValue().reversed());
		for(Entry<Integer, Integer> lis : list)
		{
			k+=lis.getKey();
			k+=lis.getValue();
		
		}
		
		//Integer vali=Integer.parseInt(k);
		//Integer keyi=Integer.parseInt(v);
		
		for(int i=0;i<k.length();i++)
		{
		
			
		System.out.println(k.charAt(i));	
			
		}
	}

}
