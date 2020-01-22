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

import com.capgemini.forestrymanagementsystemjdbc.dto.ContractBean;
import com.capgemini.forestrymanagementsystemjdbc.dto.CustomerBean;

public class ContractDaoImpl implements ContractDao {
	FileReader reader;
	Properties prop;
	ContractBean bean;
	public ContractDaoImpl() {
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
	public boolean addContract(ContractBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbpassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("contractqueryInsert"));) {
			pstmt.setInt(1, bean.getContractNo());
			pstmt.setInt(2, bean.getCustId());
			pstmt.setInt(3, bean.getHaulId());
			pstmt.setInt(4, bean.getProdId());
			pstmt.setInt(5, bean.getQuantity());
			pstmt.setString(6, bean.getDeliveryDate());

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
	public List<ContractBean> getAllContracts() {
		List<ContractBean> list = new ArrayList<ContractBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbpassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query5"))) {

			while (rs.next()) {
				bean = new ContractBean();
				bean.setContractNo(rs.getInt(1));
				bean.setCustId(rs.getInt(2));
				bean.setHaulId(rs.getInt(3));
				bean.setProdId(rs.getInt(4));
				bean.setQuantity(rs.getInt(5));
				bean.setDeliveryDate(rs.getString(6));
				list.add(bean);
			}
			return list;
		} catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}

}
