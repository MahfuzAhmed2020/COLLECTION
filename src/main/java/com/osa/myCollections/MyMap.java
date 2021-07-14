package com.osa.myCollections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "uddin");
		map.put(2, "Akbar");
		map.put(3, "Mahfuz");
		map.put(null, null);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
	}

}
