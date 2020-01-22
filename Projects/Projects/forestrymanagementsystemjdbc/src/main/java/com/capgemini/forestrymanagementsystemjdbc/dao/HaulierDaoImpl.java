package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.forestrymanagementsystemjdbc.dto.CustomerBean;
import com.capgemini.forestrymanagementsystemjdbc.dto.HaulierBean;

public class HaulierDaoImpl implements HaulierDao {
	
	FileReader reader;
	Properties prop;
	HaulierBean bean;
	
	public HaulierDaoImpl(){
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
	public boolean addHaulier(HaulierBean bean) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("haulqueryInsert"));){
			pstmt.setInt(1, bean.getHaulid());
			pstmt.setInt(2, bean.getHtelno());
			pstmt.setString(3, bean.getHname());
			pstmt.setString(4, bean.getHtown());
			pstmt.setString(5, bean.getHpostcode());
			pstmt.setString(6, bean.getHemail());

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
	public boolean searchHaulier(int haulierid) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("haulquerySearch"));){
			pstmt.setInt(1, haulierid);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				bean=new HaulierBean();
				return true;
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		return false;
	}
	@Override
	public boolean deleteHaulier(int haulierid) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("queryDelete"));){
			
			pstmt.setInt(1, haulierid);

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
	public List<HaulierBean> getAllHauliers() {
		List<HaulierBean> list=new ArrayList<HaulierBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query2"))){

			while(rs.next()) {
				bean=new HaulierBean();
				bean.setHaulid(rs.getInt(1));
				bean.setHtelno(rs.getInt(2));
				bean.setHname(rs.getString(3));
				bean.setHtown(rs.getString(4));
				bean.setHpostcode(rs.getString(5));
				bean.setHemail(rs.getString(6));
				list.add(bean);
			}
			return list;
		}catch(Exception e) {
			e.getStackTrace();
		}
		return null;
	}

}
