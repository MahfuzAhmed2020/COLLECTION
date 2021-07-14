package com.osa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.TreeMap;

public class GetStudentInfo {
	
	
	public static void main(String[] args) {
		GetStudentInfo info = new GetStudentInfo();
		
		TreeMap<String, StudentInfo> map = info.getStudentInfo();
		
		//map.get(101).setLastName("khan");
		
		for(String s : map.keySet()){
			StudentInfo student = map.get(s);
            System.out.println("Student Id: "+student.getId()+" \tStudent First Name: "+student.getFirstName()+"  \t\tStudent Last Name: "+student.getLastName()+" \t\tStudent Email: "+student.getEmail()+"   \t\tStudent Phone Number: "+student.getPhone()+"\tStudent Age: "+student.getAge());
        }
	}
	
	
	public TreeMap<String, StudentInfo> getStudentInfo() {
		
		TreeMap<String, StudentInfo> map = new TreeMap<String, StudentInfo>();
		
		StudentInfo student;
		
		String jdbcURL = "jdbc:mysql://localhost:8889/osa_students";
		String username= "root";
		String password= "root";
		
		try {
			//creating connection with JDBC
			Connection con = DriverManager.getConnection(jdbcURL, username, password);
			//creating statement by Connection interface
			Statement statement = con.createStatement();
			
			//execute quary and stored in ResultSet
			ResultSet result = statement.executeQuery("SELECT * FROM StudentInfo");
			
			while (result.next()) {
				
				String id = result.getString("SID");
				String firstName = result.getString("First_Name");
				String lastName = result.getString("Last_Name");
				String email = result.getString("Email");
				String phoneNumber = result.getString("P_Number");
				String age = result.getString("Age");
				
				student = new StudentInfo(id, firstName, lastName, email, phoneNumber, age);
				
				map.put(id, student);
				
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return map;
	}

}
