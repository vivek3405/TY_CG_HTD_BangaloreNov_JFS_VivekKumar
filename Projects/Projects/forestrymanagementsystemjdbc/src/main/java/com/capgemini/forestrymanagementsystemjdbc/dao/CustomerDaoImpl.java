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

public class CustomerDaoImpl implements CustomerDao {
	FileReader reader;
	Properties prop;
	CustomerBean bean;

	public CustomerDaoImpl() {
		try {
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addCustomer(CustomerBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("queryInsert"));) {
			pstmt.setInt(1, bean.getCustid());
			pstmt.setString(2, bean.getTelno());
			pstmt.setString(3, bean.getCname());
			pstmt.setString(4, bean.getTown());
			pstmt.setString(5, bean.getPostcode());
			pstmt.setString(6, bean.getEmail());
			pstmt.setString(7, bean.getPassword());

			int count = pstmt.executeUpdate();

			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return false;
	}

	@Override
	public boolean searchCustomer(int custid) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("querySearch"));) {
			pstmt.setInt(1, custid);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(int custid) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("queryDelete"));) {

			pstmt.setInt(1, custid);

			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}

		} catch (Exception e) {
			e.getStackTrace();
		}
		return false;
	}

	@Override
	public boolean modifyMobile(int custid, String number) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("queryUpdate"));) {
			pstmt.setString(1, number);
			pstmt.setInt(2, custid);

			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return false;
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		List<CustomerBean> list = new ArrayList<CustomerBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbpassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))) {

			while (rs.next()) {
				bean = new CustomerBean();
				bean.setCustid(rs.getInt("custid"));
				bean.setTelno(rs.getString("telno"));
				bean.setCname(rs.getString("cname"));
				bean.setTown(rs.getString("town"));
				bean.setPostcode(rs.getString("postcode"));
				bean.setEmail(rs.getString("email"));
				list.add(bean);
			}
			return list;
		} catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}

	@Override
	public String login(String email, String password) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("login"))){
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
			String name=rs.getString("cname");
			return name;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
}

}
