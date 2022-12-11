package com.zoho.secondround;

public class BracketOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bracketOrder();
		//It is in bending
	}
	
	public static void bracketOrder()
	{
		/*
		 * ((abc)(xde)) 
		 */
		
		String values="((ab))(ab))";
	
		char[] ch=values.toCharArray();
		
		
		int op = 0,c=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{}
			else
			{
			if(ch[i]=='(')
			{
				op++;
				
			}
		  if(ch[i]==')')
			{
			  
				op--;
			}
		  System.out.print(op);
		 if(op==2)
		 {
			 ch[i]=-0;
		 }
			}
			
			if(ch[i]!=-0)
			{
			//	System.out.print(ch[i]);
			}
			}

		
	}

}
