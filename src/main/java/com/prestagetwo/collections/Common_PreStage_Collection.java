package com.prestagetwo.collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Common_PreStage_Collection {
	public static void main(String[] args) {
		HashMap<Integer, Address> map = Common_PreStage_Collection.getAddress();
		for (Map.Entry<Integer, Address> entry : map.entrySet()) {
			System.out.println(
					entry.getKey() + " " + entry.getValue().getAddress_id() + " " + entry.getValue().getStreet() + " "
							+ entry.getValue().getCity() + " " + entry.getValue().getZip());
		}
		for (Integer i : map.keySet()) {
			System.out.println("key: " + i + " value: " + map.get(i).getAddress_id() + " " + map.get(i).getStreet()
					+ " " + map.get(i).getCity() + " " + map.get(i).getZip());
		}
	}

	public static HashMap<Integer, Address> getAddress() {
		HashMap<Integer, Address> map = new HashMap<Integer, Address>();
		try {
			int key = 0;
			ResultSet rs = Common_PreStage_Collection.getValueFromSQLTable("select *  from Address;");
			while (rs.next()) {
				map.put(key, new Address(rs.getString("address_id"), rs.getString("street"), rs.getString("city"),
						rs.getString("zip")));
				key++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return map;
	}

	public static HashMap<Integer, Address> getMockdata() {
		HashMap<Integer, Address> hp = new HashMap<Integer, Address>();
		try {
			int key = 0;
			ResultSet rs = Common_PreStage_Collection.getValueFromSQLTable("select *  from Address;");
			while (rs.next()) {
				hp.put(key, new Address(rs.getString("address_id"), rs.getString("street"), rs.getString("city"),
						rs.getString("zip")));
				key++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return hp;
	}

	public static ResultSet getValueFromSQLTable(String query) {
		ResultSet rs = null;
		try {
			// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
			String dbUrl = "jdbc:mysql://localhost:3306/osa";
			// Database Username
			String username = "root";
			// Database Password
			String password = "";

			// Create Connection to DB
			Connection con = DriverManager.getConnection(dbUrl, username, password);

			// Create Statement Object
			Statement stmt = con.createStatement();

			// Execute the SQL Query. Store results in ResultSet
			rs = stmt.executeQuery(query);

		} catch (Exception e) {

		}
		return rs;
	}
}
