package com.prestagetwo.collections;

import java.util.ArrayList;

public class Collections_PreStageTwo {
	

		public static void main(String[] args) {
		 
		  ArrayList<String> b1=new ArrayList<String>();
		  b1.add("A1");
		  b1.add("A2");
		  b1.add("A3");
		  b1.add("A4");
		  ArrayList<String> b2=new ArrayList<String>();
		  b2.add("B1");
		  b2.add("B2");
		  b2.add("B3");
		  b2.add("B4");
		  ArrayList<String> b3=new ArrayList<String>();
		  b3.add("C1");
		  b3.add("c2");
		  b3.add("C3");
		  b3.add("C4");
		  setAllBatches(b1);
		  setAllBatches(b2);
		  setAllBatches(b3);
		  
		  ArrayList<ArrayList<String>> allBatche = getAllBatches();
		  for (ArrayList<String> batch: allBatche) {
			  for(String student: batch) {
				System.out.println(student);  
			  }
		   }
	    }
		static ArrayList<ArrayList<String>> allBatches=new ArrayList<ArrayList<String>>();
		public static void setAllBatches( ArrayList<String> batch){
			allBatches.add(batch);
		}
		
		public static ArrayList<ArrayList<String>> getAllBatches() {
			return allBatches;
		}
	}


