package com.zoho.TeligramQ;

import java.util.Arrays;

public class PalidromeIsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//op --> is my mother tongue
		
String n= "Malayalam is my mother tongue"; //"He did a good deed";  

String st="";

	String[] sp=n.toLowerCase().split(" ");
	String dataSt="";
	for(String ss:sp)
	{
		String spl=ss+" ";
		char[]  ch=spl.toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
		st+=ch[j];
	
		}
	}
	String[] sps=st.split(" ");
	
	for(int i=0;i<sps.length;i++)
	{
	
		for(int j=0;j<sp.length;j++)
		{
			if(sps[i].equals(sp[j]))
			{
				sps[i]="0";
			}
		
					}
			
		}
	
	for(int i=0;i<sps.length;i++)
	{
		
		if(!sps[i].equals("0"))
		{
			dataSt+=sps[i]+" ";
		}
	}
	
	
	//System.out.println(dataSt);
	
	char[] dch=dataSt.toCharArray();
	String stad="";
	for(int i=0;i<dch.length;i++)
	{
		if(dch[i]!='0')
		{
		stad+=dch[i];
		}
	}
	String[] spd=stad.split(" ");
	String res="";
	for(String rd : spd)
	{
		String spa=rd+" ";
		char[]  ch=spa.toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
		res+=ch[j];
	
		}
	}
	System.out.print(res);
	}
}
