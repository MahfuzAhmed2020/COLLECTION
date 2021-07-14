package com.osa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyDatabaseCollection {

	public static void main(String[] args) {

		MyDatabaseCollection myData = new MyDatabaseCollection();

		Map<Integer,String>  getData = myData.getDataFromStudentInfo();

		System.out.println(getData);
		
//		Map<Integer, String> getData = myData.getDataWithMap();
//		
//		for(Map.Entry<Integer,String> entry:getData.entrySet()) {
//			System.out.println(entry.getKey()+"    "+entry.getValue());
//		}

	}

	public  Map<Integer,String>  getDataFromStudentInfo() {

		//ArrayList<String> getList = null;
		Map<Integer,String> stu=null;
		// creating database connection

		String jdbcURL = "jdbc:mysql://localhost:8889/osa_students";
		String userName = "root";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(jdbcURL, userName, password);

			// creating statement

			Statement statement = con.createStatement();

			// Execute Query and save in it ResultSet

			ResultSet resultSet = statement.executeQuery("SELECT * FROM StudentInfo");

			// creating new ArrayList

			//getList = new ArrayList<String>();

			 stu=new HashMap<Integer,String>();
	         
			 

			while (resultSet.next()) {
				
				stu.put(1,resultSet.getString(1));

//				getList.add(resultSet.getString(1));
//				getList.add(resultSet.getString(2).toString());
//				getList.add(resultSet.getString(3).toString());
//				getList.add(resultSet.getString(4).toString());
//				getList.add(resultSet.getString(5).toString());

			}

			// close connection

			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return stu;

	}

	public Map<Integer, String> getDataWithMap() {
		
		Map<Integer, String> getList=null;

		// creating database connection

		String jdbcURL = "jdbc:mysql://localhost:8889/osa_students";
		String userName = "root";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(jdbcURL, userName, password);

			// creating statement

			Statement statement = con.createStatement();

			// Execute Query and save in it ResultSet

			ResultSet resultSet = statement.executeQuery("SELECT * FROM StudentInfo");

			// creating new ArrayList

			getList = new HashMap<Integer, String>();

			//

			while (resultSet.next()) {

//				getList.add(resultSet.getString(1).toString());
//				getList.add(resultSet.getString(2).toString());
//				getList.add(resultSet.getString(3).toString());
//				getList.add(resultSet.getString(4).toString());
//				getList.add(resultSet.getString(5).toString());
				getList.put(resultSet.getInt(0),null);

			}

			// close connection

			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return getList;

	}

}
