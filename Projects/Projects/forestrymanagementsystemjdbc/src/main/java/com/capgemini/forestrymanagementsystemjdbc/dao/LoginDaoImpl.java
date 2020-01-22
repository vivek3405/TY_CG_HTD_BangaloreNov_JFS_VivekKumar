package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class LoginDaoImpl implements LoginDao {
	FileReader reader;
	Properties prop;
	public LoginDaoImpl() {

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
	public String loginAdmin(String user, String password) {
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), 
					prop.getProperty("dbUser"), prop.getProperty("dbpassword"));
					PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("queryLogin"))){
				pstmt.setString(1, user);
				pstmt.setString(2, password);
				ResultSet rs=pstmt.executeQuery();
				String name=null;
				if(rs.next()) {
				name=rs.getString("name");
				}
				return name;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
	}

}
