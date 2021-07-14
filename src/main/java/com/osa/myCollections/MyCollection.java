package com.osa.myCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class MyCollection {
	
//	public static void main(String[] args) {
//		
//		ArrayList<String> list = new ArrayList<String>();//homogenius
//		//ArrayList list = new ArrayList();//heterogenius
//		
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//		
//		//String s[]= {"A","B","C","D"}
//		for (String s : list) {
//			System.out.println(s);
//		}
//		
//		
//		
//	}
//	
	//public boolean hasMoreElements(); ==> true/false
	
	//public Object nextElement(); ==> value
	
	//elements();
	
	
//public static void main(String[] args) {
//		
//		Vector<String> list = new Vector<String>();//homogenius
//		//ArrayList list = new ArrayList();//heterogenius
//		
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//		
//		Enumeration<String> e = list.elements();
//		
//		while(e.hasMoreElements()) {
//			String value = e.nextElement();
//			System.out.println(value);
//		}
//	}

//public static void main(String[] args) {
//		
//		//Stack<String> list = new Stack<String>();//homogenius
//		//ArrayList list = new ArrayList();//heterogenius
//		Stack list = new Stack();
//		
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//		
//		Enumeration<String> e = list.elements();
//		
//		while(e.hasMoreElements()) {
//			String value = e.nextElement();
//			System.out.println(value);
//		}
//	}
	/*
	 * There are three courser in collection
	 * Iterator ====> it is also called universal coursor
	 */
	
//public static void main(String[] args) {
//		//Iterator cursor
//		/*
//		 * public boolean hasNext();
//		 * public Object next();
//		 * public void remove():
//		 * 
//		 */
//		//we will use iterator();
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//		
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String value = iterator.next();
//			if(value=="B") {
//				iterator.remove();
//			}
//			//System.out.println(value);
//		}
//		Iterator<String> iterator1 = list.iterator();
//		while(iterator1.hasNext()) {
//			String value = iterator1.next();
//		
//			System.out.println(value);
//		}
//	}
	
	
//	public static void main(String[] args) {
//		//ListIterator cursor ===> child of Iterator interface
//		/*
//		 * public boolean hasNext();
//		 * public boolean hasPrevious();
//		 * public Object next();
//		 * public Object previous();
//		 * public void remove():
//		 * public void add(Object new Object());
//		 * public int nextIndex();
//		 * public int previousIndex();
//		 * public void set(Object new Object()); for replace object.
//		 */
//		//we will use listIterator();
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//		
//		ListIterator<String> iterator = list.listIterator();
//		while(iterator.hasNext()) {
//			String value = iterator.next();
//			if(value=="B") {
//				iterator.remove();
//			}
//			//System.out.println(value);
//		}
//		ListIterator<String> iterator1 = list.listIterator();
//		while(iterator1.hasNext()) {
//			String value = iterator1.next();
//		
//			System.out.println(value);
//		}
//	}
	
	
	public static void main(String[] args) {
		
		//Converting to ArrayList from Array
		
		String s[] = {"A","B","C","D"};
		//1st way
		ArrayList<String> list=new ArrayList<String>();
		
		for(int i=0; i<s.length;i++){
			list.add(s[i]);
			
		}
		//2nd way
		ArrayList<String> list1=new ArrayList<String>();
		Collections.addAll(list1, s);
		System.out.println(list1);
		
		
		//3rd way
		List<String> list2= Arrays.asList(s);
		System.out.println(list2);
		
	}
}
