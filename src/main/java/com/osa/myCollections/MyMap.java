package com.osa.myCollections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(0, "Iftikhar");
		map.put(1, "uddin");
		map.put(2, "Akbar");
		map.put(3, "Mahfuz");
		map.put(null, null);
		System.out.println("map = "+map);
		System.out.println("map.entrySet() = "+map.entrySet());
		System.out.println("map.keySet() = "+map.keySet());
		System.out.println("map.values() = "+map.values());
		System.out.println("map.get(1) = "+map.get(1));
		System.out.println("map.replace(2, \"Akbar\", \"Ahmed\") "+map.replace(2, "Akbar", "Ahmed"));
		System.out.println("************************************************");
		//retrieve the value using Map.Entry<Integer,String> entry : map.entrySet()   
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//retrieve the value using map.keySet() 
		for (Integer i : map.keySet()) {
		      System.out.println("key: " + i + " value: " + map.get(i));
		    }
		System.out.println("###################################################");
		
//		for (String i : k.keySet()) {
//		      System.out.println("key: " + i + " value: " + k.get(i));
//		    }
	}

}
