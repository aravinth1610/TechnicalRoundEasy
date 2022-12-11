package com.zoho.secondround;

public class AllPermutationsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapAllPermutation();
	}

	public static void swapAllPermutation()
	{
		/*
		 * Output : ABC ACB BCA BAC CAB CBA
		 */
		
		String name="ABC";
		
		
		swap(name,"");
		
		
	}	
	
	public static void swap(String name,String l)
	{
		
		if(name.length()==0)
		{
			System.out.print(l+" ");
		}
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			String k=name.subSequence(0, i)+name.substring(i+1);
			
			swap(k,l+ch);
	
		}
		
	}
	
}
