package com.osa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

		//Applications/MAMP/Library/bin/mysql --host=localhost -uroot -proot


/*
 * 1. creating connection with database
 * 2. create statement
 * 3. execute the statement
 * close the connection
 */

public class CreateDatabase {
	
	private static final String CREATE_TABLE = "CREATE TABLE StudentInfo("
			+ "SID INT NOT NULL,"
			+ "First_Name VARCHAR(50) NOT NULL,"
			+ "Last_Name VARCHAR(50) NOT NULL,"
			+ "Email VARCHAR(50),"
			+ "P_Number VARCHAR(50) NOT NULL,"
			+ "Age VARCHAR(10) NOT NULL,"
			+ "PRIMARY KEY (SID))";
	
	public static void main(String[] args) {
		CreateDatabase table = new CreateDatabase();
		//table.createDatabaseTable();
		table.inputStudentInfo("UPDATE StudentInfo SET Email='emamabadhon1990@yahoo.com' WHERE SID=131");
		table.inputStudentInfo("UPDATE StudentInfo SET Email='mdmoniruzzaman@hotmail.com ' WHERE SID=113");
		table.inputStudentInfo("UPDATE StudentInfo SET Email='akterkulsum1995@hotmail.com' WHERE SID=117");
		table.inputStudentInfo("UPDATE StudentInfo SET Email='fatemaddin@muslimcenter.org' WHERE SID=103");
		table.inputStudentInfo("UPDATE StudentInfo SET Email='uddinjashim1965@gmail.com' WHERE SID=107");
		table.inputStudentInfo("UPDATE StudentInfo SET Email='adnannmatin195271@aol.com ' WHERE SID=129");

//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(101,'Mohammad','Uddin','mohammeduddin@hotmail.com','347-977-5833','40')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(102,'Khandokar','Habibullah','shohelhabib1989@gmail.com','646-714-1801','38')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(103,'Fatema','Uddin','F_Uddin@muslimcenterschool.org','347-977-4431','10')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(104,'Ayesha','Uddin','auddin@muslimcenterschool.org','347-779-5833','07')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(105,'Maryam','Uddin','uddinmaryam2016@gmail.com','646-976-4434','04')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(106,'Rahima','Akter','akterrahima85@gmail.com','929-977-1234','35')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(107,'Jashim','Uddin','uddinjashim@gmail.com','718-977-9874','45')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(108,'Kamal','Hossain','hossainkamal@gmail.com','347-977-7754','50')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(109,'Belal','Hossain','hossainbelal2021@gmail.com','212-442-8845','45')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(110,'Shumon','Chowdury','chowduryshomun@hotmail.com','512-677-5812','41')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(111,'Mohammad','Shohidullah','shohidullah1985@aol.com','917-845-6451','38')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(112,'Main','Uddin','mohammeduddin1090@gmail.com','929-444-3333','40')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(113,'Mohammad','Moniruzzaman','mohammedmoniruzzaman@yahoo.com','347-577-1133','40')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(114,'Mohammad','Jafarullah','jafarullah1980@hotmail.com','646-975-5890','40')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(115,'Giash','Uddin','giashuddin1970@gmail.com','518-907-0831','50')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(116,'Khadija','Tahera','khadijatahera1990@hotmail.com','347-873-5342','32')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(117,'Kulsum','Akter','akterkulsum@yahoo.com','212-977-5812','33')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(118,'Mohammad','Shamsuddin','shamsuddinmohammad@gmail.com','347-900-5800','49')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(119,'Mujibul','Haque','mujibulhoque@hotmail.com','347-777-3333','55')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(120,'Nazrul','Islam','nazrulislam2001@yahoo.com','347-077-5123','42')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(121,'Shahadat','Hossain','shahadathossain@gmail.com','917-177-4323','44')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(122,'Mahfuz','Ahmed','ahmedmahfuz1971@aol.com','929-377-1233','35')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(123,'Akbar','Ali','akbarali2000@yahoo.com','347-333-5801','48')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(124,'Mohammad','Ali','alimohammad@1970hotmail.com','646-222-0003','40')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(125,'Mosammat','Akter','aktermosammat1990@gmail.com','929-999-1199','35')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(126,'Md','Masum','mohammedmasum@yahoo.com','347-348-7531','28')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(127,'Mosharraf','Karim','mosharrafkarim20@gmail.com','347-294-9043','40')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(128,'Mohammed','Anis','anismohammed1900@hotmail.com','917-294-6867','39')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(129,'Adnan','Matin','adnanmatin420@aol.com','646-987-0021','50')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(130,'Mokabbel','Hossain','hossainmokabbel19@gmail.com','347-477-9831','38')");
//        table.inputStudentInfo("INSERT INTO StudentInfo VALUES(131,'Emama','Badhon','emamabadhon@yahoo.com','718-433-9839','30')");
//		
		//table.getStudentInfo("SELECT * FROM StudentInfo");
	}
	
	//creating connection with database
	public void createDatabaseTable() {
		
		String jdbcUrl = "jdbc:mysql://localhost:8889/osa_students";
		String userName = "root";
		String password = "root";
		
		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			
			//2. create statement
			Statement statement = con.createStatement();
			
			statement.executeUpdate(CREATE_TABLE);
			System.out.println("StudentInfo table has been created--------");
			
			//close the connection
			con.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	//creating connection with database
		public void inputStudentInfo(String newStudent) {
			
			String jdbcUrl = "jdbc:mysql://localhost:8889/osa_students";
			String userName = "root";
			String password = "root";
			
			try {
				Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
				
				//2. create statement
				Statement statement = con.createStatement();
				
				//3. execute the statement
				statement.execute(newStudent);
				System.out.println("New Student info has been entered -------");
				
				//close the connection
				con.close();
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		
		//creating connection with database
				public void getStudentInfo(String fetchData) {
					
					String jdbcUrl = "jdbc:mysql://localhost:8889/osa_students";
					String userName = "root";
					String password = "root";
					
					try {
						Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
						
						//2. create statement
						Statement statement = con.createStatement();
						
						//3. execute the statement and 
						//store the data into resultSet
						
						ResultSet rs = statement.executeQuery(fetchData);
						
						System.out.println("getting the student info -------");
						
						while(rs.next()) {
							String studentID = rs.getString("SID");
							String studentName = rs.getString("Name");
							String studentEmail = rs.getString("Email");
							String studentP_Number = rs.getString("P_Number");
							
							System.out.println("Student ID: "+studentID+" tStudent Name: "+studentName+" Student Email: "+studentEmail+" Student Phone Number: "+studentP_Number);
							
						}
						
						//close the connection
						con.close();
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					
				}

}
