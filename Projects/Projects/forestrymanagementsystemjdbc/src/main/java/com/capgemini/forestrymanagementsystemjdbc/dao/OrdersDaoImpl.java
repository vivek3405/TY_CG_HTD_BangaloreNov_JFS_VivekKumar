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

import com.capgemini.forestrymanagementsystemjdbc.dto.OrdersBean;

public class OrdersDaoImpl implements OrdersDao {
	FileReader reader;
	Properties prop;
	OrdersBean bean;
	
	public OrdersDaoImpl() {
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
	public boolean addOrder(OrdersBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("orderqueryInsert"));) {
			pstmt.setString(1, bean.getPname());
			pstmt.setInt(2, bean.getQuantity());

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
	public List<OrdersBean> getAllOrders() {
		List<OrdersBean> list = new ArrayList<OrdersBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbpassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query4"))) {

			while (rs.next()) {
				bean = new OrdersBean();
				bean.setPname(rs.getString(1));
				bean.setQuantity(rs.getInt(2));
			}
			list.add(bean);
			return list;
		} catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}
	

}
