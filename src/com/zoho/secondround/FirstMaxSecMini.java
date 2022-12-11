package com.zoho.secondround;

import java.util.Arrays;

public class FirstMaxSecMini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fMsMi();
	}

	public static void fMsMi()
	{
		/*OP
		 * {7, 1, 6, 2, 5, 3, 4} 
		 */
		int[] num=  {1, 6, 9, 4, 3, 7, 8, 2};
		
		int max=0;
		
		Arrays.sort(num);
	
		int i = 0, j = num.length-1;
		for(int k=0;k<num.length;k++) {
			if(i<j) {
		   System.out.print(num[i] + " ");
           System.out.print(num[j]+" ");
			i++;
			j--;
				}
      }
	
	
	}
	
	
	
	
}
