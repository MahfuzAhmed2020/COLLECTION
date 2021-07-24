package com.prestagetwo.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections_PreStageTwoHashMap {

	public static void main(String[] args) {

		ArrayList<String> b1 = new ArrayList<String>();
		b1.add("A1");
		b1.add("A2");
		b1.add("A3");
		b1.add("A4");
		ArrayList<String> b2 = new ArrayList<String>();
		b2.add("B1");
		b2.add("B2");
		b2.add("B3");
		b2.add("B4");
		ArrayList<String> b3 = new ArrayList<String>();
		b3.add("C1");
		b3.add("c2");
		b3.add("C3");
		b3.add("C4");

//			HashMap<Integer,String> map=new HashMap<Integer,String>();
//							map.put(1, "Some value");
//							map.put(2, "Some1 value");
//							System.out.println(map.get(2));
		HashMap<String, ArrayList<String>> allBatches = new HashMap<String, ArrayList<String>>();
		allBatches.put("batch1", b1);
		allBatches.put("batch2", b2);
		allBatches.put("batch3", b3);
		ArrayList<String> batch1 = allBatches.get("batch3");
		System.out.println(batch1);
		for (String student : batch1) {
			System.out.println(student);
		}

	}

}
