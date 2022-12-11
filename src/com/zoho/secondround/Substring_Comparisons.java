package com.zoho.secondround;

public class Substring_Comparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subStringIOrder();
	}
	
	public static void subStringIOrder()
	{
		/*
		 * wel ava
		 */
	
	String st="welcometojava";
	int n=3;
	
	String subCurr =st.substring(0,3);
	int s = 0;
	String maxsub=st.substring(0,3);
	String minsub=st.substring(0,3);
	
	for(int i=3;i<st.length();i++)
	{
		subCurr= subCurr.substring(1,3)+st.charAt(i);
		System.out.print(subCurr+" ");
		if (maxsub.compareTo(subCurr) < 0)    
			maxsub = subCurr;
	   if (minsub.compareTo(subCurr) > 0)
    	   minsub = subCurr;   
	}
	System.out.println("\n"+maxsub);
	System.out.println(minsub);
	}

}
