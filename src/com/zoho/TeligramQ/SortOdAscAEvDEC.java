package com.zoho.TeligramQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortOdAscAEvDEC {

	public static void main(String[] args) {
		/*
		 *  O.p -> 9 18 11 8 20 4 100  
		 */
		int[] n=   {9,4,20,18,11,8,100,2,22};
	
		int f=0,l=n.length-1;
		List<Integer> ev=new ArrayList<>();
		List<Integer> od=new ArrayList<>();
		for(int i=0;i<n.length;i++)
		{
			//System.out.println(n[i]);
			if(i%2==0)
			{
				ev.add(n[i]);
			}
			
			if(i%2!=0)
			{
			od.add(n[i]);
			}
			
		}
    Integer[] ll=new Integer[ev.size()];
	int k=0;
		for(Integer e : ev)
		{
			ll[k]=e;
			k++;
		}
		
		Integer[] lll=new Integer[od.size()];
		int kk=0;
			for(Integer e : od)
			{
				lll[kk]=e;
				kk++;
			}
		
		
		Arrays.sort(ll);
		Arrays.sort(lll,Collections.reverseOrder());
		for(int i=0;i<ll.length;i++)
		{
			System.out.println(ll[i]);
			for(int j=0;j<lll.length;j++)
			{
			
				if(i==j)
				System.out.println(lll[j]);
				
			}
		}
		
		

	}

}
