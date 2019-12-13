package com.capgemini.phonesimulator.contactdao;

import java.util.List;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.capgemini.phonesimulator.contactdto.Contact;

public class ContactDaoImpl implements ContactDao {
	FileReader reader;
	Properties prop;
	Contact user;
	public ContactDaoImpl(){

		try {
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Contact> showContact() {
		List<Contact> list=new ArrayList<Contact>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){

			while(rs.next()) {
				user=new Contact();
				user.setName(rs.getString(1));
				user.setNumber(rs.getInt(2));
				user.setGroup(rs.getString(3));
				list.add(user);
			}
			return list;
		}catch(Exception e) {
			e.getStackTrace();
		}
		return null;
	}

	@Override
	public boolean searchContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("querySearch"));){
			pstmt.setString(1, name);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				user=new Contact();
				System.out.println(rs.getInt("number"));
				return true;
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		return false;
	}


	@Override
	public boolean deleteContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("queryDelete"));){
			
			pstmt.setString(1, name);

			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}

		}catch(Exception e) {
			e.getStackTrace();
		}
		return false;
	}
	@Override
	public boolean insertContact(Contact user) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("queryInsert"));){
			pstmt.setString(1, user.getName());
			pstmt.setInt(2, user.getNumber());
			pstmt.setString(3, user.getGroup());

			int count=pstmt.executeUpdate();

			if(count > 0) {
				return true;
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateContact(String name, int num) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("queryUpdate"));){
			pstmt.setInt(1, num );
			pstmt.setString(2, name);

			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		return false;
	}
}

