package com.osa.practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class ListPractice {
	public static void main(String[] args) {
		listDemo();
	}

	public static void listDemo() {
		String[] pp = { "a", "b", "c", "d" };

		ArrayList<String> a = new ArrayList<String>();
		a.add("abrar");
		a.add("ifti");
		a.add("ifti");
		a.add("ahmed");
		a.add(null);
		a.add("habib");
		Collections.addAll(a, pp);
		// System.out.println(a);
		for (int i = 0; i < a.size(); i++) {
			// System.out.print(a.get(i)+" " );

		}

		HashSet hs = new HashSet();// Capacity 16  loadfector 75
		HashSet hs1 = new HashSet(25);
		HashSet hs2 = new HashSet(25,90);//int initialCapacity,float loadfactor
		HashSet hs3 = new HashSet();//Collectiion c
		hs.add("x");
		hs.add("x");
		hs.add("y");
		hs.add("z");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		/*Q6.  How many contractor in Hash Set?
Ans. There are 4 constructor in Hase Set
HaseSet h=new HashSet() ;//creates an empty HashSet object with  initial capacity (16) and Fill ratio or load factor (0.75). 
HashSet h=new HashSet (int initialCapacity); // creates an empty HashSet object with specified  initial capacity and Fill ratio or load factor (0.75).
HashSet h =new HashSet (int initialCapacity, float loadFactor); ;//creates an empty HashSet object with specified initial capacity  and Fill ratio or load factor (0.90)
HashSet h =new HashSet(Collection c); //For inter conversion between Collection object*/

	}

}
