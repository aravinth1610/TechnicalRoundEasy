package com.zoho.TeligramQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class SortFrequenceOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//op  {3,3,3,3,2,2,2,12,12,4,5}
		
		//int[] n= {2,2,2,3,4,3,3,3,5,12,12};
		// Declare and Initialize an array
        int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5,4};
 
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> outputArray = new ArrayList<>();
 
        // Assign elements and their count in the list and map
        for (int current : array) {
            int count = map.getOrDefault(current, 0);
          //  System.out.println(count+1);
            map.put(current, count+1);
            outputArray.add(current);
        }
 
        for(Entry<Integer, Integer> mp : map.entrySet())
        {
       // System.out.println(mp.getKey()+" "+mp.getValue());	
        }
        for(Integer li : outputArray)
        {
       // 	System.out.println();
        //	System.out.println(li);
        }
        
        // Compare the map by value
        SortComparator comp = new SortComparator(map);
 
        // Sort the map using Collections CLass
        Collections.sort(outputArray, comp);
 
        // Final Output
        for (Integer i : outputArray) {
            System.out.print(i + " ");
        }
    }
}


//Implement Comparator Interface to sort the values
class SortComparator implements Comparator<Integer> {
 private final Map<Integer, Integer> freqMap;

 // Assign the specified map
 SortComparator(Map<Integer, Integer> tFreqMap)
 {
     this.freqMap = tFreqMap;
 }

 // Compare the values
 @Override
 public int compare(Integer k1, Integer k2)
 {

     // Compare value by frequency
     int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));

     // Compare value if frequency is equal
     int valueCompare = k1.compareTo(k2);

     // If frequency is equal, then just compare by value, otherwise -
     // compare by the frequency.
     if (freqCompare == 0)
         return valueCompare;
     else
         return freqCompare;
 }
}
