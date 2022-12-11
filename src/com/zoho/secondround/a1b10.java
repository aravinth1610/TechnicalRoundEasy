package com.zoho.secondround;

public class a1b10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sums();
	}

	public static void sums()
	{
		String st="a2b3";
		
		char[] ch=st.toCharArray();
		char sts=0;
				int s=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>= 'a' && ch[i]<= 'z' || ch[i]>= 'A' && ch[i]<= 'Z' )
			{
	//			System.out.print(ch[i]);
			if(sts!=0)
			{
				for(int j=0;j<s;j++)
				{
				System.out.print(sts);	
			
				}
				s=0;
			}
			sts=ch[i];
			}
			if(ch[i] >='0' && ch[i] <= '9' )
			{
		 		s=s*10+ch[i]-'0';
			}
	
			
		}
		for(int j=0;j<s;j++)
		{
		System.out.print(sts);	
		}
		
	}
	
	
	
}
