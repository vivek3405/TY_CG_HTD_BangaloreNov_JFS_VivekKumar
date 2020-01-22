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

import com.capgemini.forestrymanagementsystemjdbc.dto.HaulierBean;
import com.capgemini.forestrymanagementsystemjdbc.dto.ProductBean;

public class ProductDaoImpl implements ProductDao {
	
	FileReader reader;
	Properties prop;
	ProductBean bean;
	
	public ProductDaoImpl(){
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
	public boolean addProduct(ProductBean bean) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("prodqueryInsert"));){
			pstmt.setInt(1, bean.getProdid());
			pstmt.setString(2, bean.getPname());
			pstmt.setDouble(3, bean.getPcost());

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
	public List<ProductBean> searchProduct(int productid) {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("prodquerySearch"));){
			pstmt.setInt(1, productid);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				bean=new ProductBean();
				bean.setProdid(rs.getInt(1));
				bean.setPname(rs.getString(2));
				bean.setPcost(rs.getDouble(3));
				list.add(bean);
			}
			return list;
		}catch(Exception e) {
			e.getStackTrace();
		}
		return null;
	}
	@Override
	public boolean deleteProduct(int productid) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("prodqueryDelete"));){
			
			pstmt.setInt(1, productid);

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
	public boolean modifyProduct(int productid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ProductBean> getAllProduct() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query3"))){

			while(rs.next()) {
				bean=new ProductBean();
				bean.setProdid(rs.getInt(1));
				bean.setPname(rs.getString(2));
				bean.setPcost(rs.getDouble(3));
				list.add(bean);
			}
			return list;
		}catch(Exception e) {
			e.getStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductBean> searchProduct(String pname) {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("prodquerySearchName"));){
			pstmt.setString(1, pname);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				bean=new ProductBean();
				bean.setProdid(rs.getInt(1));
				bean.setPname(rs.getString(2));
				bean.setPcost(rs.getDouble(3));
				list.add(bean);
			}
			return list;
		}catch(Exception e) {
			e.getStackTrace();
		}
		return null;
	}

}
