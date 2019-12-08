package com.capgemini.fmsapp.controlleradmin;

import java.util.*;

import java.util.Map.Entry;

import com.capgemini.fmsapp.admin.ContractorDao;
import com.capgemini.fmsapp.admin.CustomerDao;
import com.capgemini.fmsapp.admin.ProductDao;
import com.capgemini.fmsapp.client.ContractorBean;
import com.capgemini.fmsapp.client.CustomerBean;
import com.capgemini.fmsapp.factory.FmsFactory;
import com.capgemini.fmsapp.scheduler.ProductBean;

public class AdminController {
	static Scanner sca=new Scanner(System.in);
	public static void adminControlCustomer() {
		CustomerBean bean;
		CustomerDao cdao= FmsFactory.instanceOfCustomerDaoImpl();
		List<CustomerBean> l=new ArrayList<CustomerBean>();
		Map<Integer, List<CustomerBean>> m=new HashMap<Integer, List<CustomerBean>>();
		while(true) {
			bean=new CustomerBean();
			System.out.println("Enter 1 to add a customer account");
			System.out.println("Enter 2 to to get customer information");
			System.out.println("Enter 3 to search an customer with custID");
			System.out.println("Enter 4 to delete an account");
			System.out.println("Enter 5 to go to home page");

			int toggle=sca.nextInt();
			switch(toggle) {
			case 1:
				System.out.println("Enter customer name...");
				bean.setCname(sca.next());
				System.out.println("Enter customer Id...");
				bean.setCustid(sca.nextInt());
				System.out.println("Enter customer mobileno....");
				bean.setTelno(sca.next());
				System.out.println("Enter customer town...");
				bean.setTown(sca.next());
				System.out.println("Enter customer postcode...");
				bean.setPostcode(sca.next());
				System.out.println("Enter customer email...");
				bean.setEmail(sca.next());
				System.out.println("----------------------");
				boolean b=cdao.addCustomer(bean);
				l=cdao.getAllCustomer();
				if(b)
				{
					System.out.println("Customer added...");

				}
				else {
					System.err.println("not added");
				}
				m.put(bean.getCustid(),l);
				break;
			case 2:

				Set<Entry<Integer, List<CustomerBean>>> s1= m.entrySet();
				for (Entry<Integer, List<CustomerBean>> e : s1) {
					System.out.print("Customer ID is=====>");
					System.out.println(e.getKey());
					System.out.println(e.getValue());
					System.out.println("-------------------");
				}
				break;
			case 3: 
				System.out.println("Enter the custId to search");
				int c=sca.nextInt();
				if(cdao.searchCustomer(c, m)){
					System.out.println("customer found");
					System.out.println(m.get(c));
				}
				else {
					System.err.println("customer not found");
				}
				break;
			case 4: 
				System.out.println("enter customer id");
				int sa=sca.nextInt();
				if(cdao.deleteCustomer(sa, m)) {
					m.remove(sa);
					System.out.println("customer deleted");
				}
				else
					System.err.println("error.. ID not found int the directory");
				break;
			case 5:
				return;
			default: System.out.println("wrong input");
			}
		}
	}
	public static void adinControlContractor() {
		ContractorBean bean;
		ContractorDao cdao= FmsFactory.instanceOfContractorDaoImpl();
		List<ContractorBean> l=new ArrayList<ContractorBean>();
		Map<Integer, List<ContractorBean>> m=new HashMap<Integer, List<ContractorBean>>();
		while(true) {
			bean=new ContractorBean();
			System.out.println("Enter 1 to add a Contractor account");
			System.out.println("Enter 2 to to get Contract information");
			System.out.println("Enter 3 to search an Contract with Contractno");
			System.out.println("Enter 4 to delete the Contractor");
			System.out.println("Enter 5 to modify the contract");
			System.out.println("Enter 6 to go to home page");

			int toggle=sca.nextInt();
			switch(toggle) {
			case 1:
				System.out.println("Enter Contractno...");
				bean.setContractno(sca.nextInt());
				System.out.println("Enter customer Id...");
				bean.setCustId(sca.nextInt());
				System.out.println("Enter product Id....");
				bean.setProductId(sca.next());
				System.out.println("Enter haulier Id...");
				bean.setHaulierId(sca.next());
				System.out.println("Enter Deliver date...");
				bean.setDeliverdate(sca.next());
				System.out.println("Enter Product quantity...");
				bean.setQuantity(sca.nextDouble());
				System.out.println("----------------------");
				boolean b=cdao.addContractor(bean);
				l=cdao.getAllContractors();
				if(b)
				{
					System.out.println("Contractor added...");

				}
				else {
					System.err.println("not added");
				}
				m.put(bean.getContractno(),l);
				break;
			case 2:

				Set<Entry<Integer, List<ContractorBean>>> s1= m.entrySet();
				for (Entry<Integer, List<ContractorBean>> e : s1) {
					System.out.println("-------------------");
					System.out.print("Contract-No is=====>");
					System.out.println(e.getKey());
					System.out.println(e.getValue());
					System.out.println("-------------------");
				}
				break;
			case 3: 
				System.out.println("Enter the Contract-no to search");
				int c=sca.nextInt();
				if(cdao.searchContracter(c, m)){
					System.out.println(m.get(c));
				}
				else {
					System.err.println("contract not found");
				}
				break;
			case 4: 
				System.out.println("enter contract-no");
				int sa=sca.nextInt();
				if(cdao.deleteContractor(sa, m)) {
					m.remove(sa);
					System.out.println("contractor deleted");
				}
				else
					System.err.println("error");
				break;
			case 5:
				System.out.println("Enter the contract-no to search for modification");
				int s=sca.nextInt();
				if(cdao.searchContracter(s, m)) {
					System.out.println(m.get(s));
					m.remove(s);
					bean.setContractno(s);
					System.out.println("Fill this form for any modificaton-->");
					System.out.println("-------------");
					System.out.println("Enter customer Id...");
					bean.setCustId(sca.nextInt());
					System.out.println("Enter product Id....");
					bean.setProductId(sca.next());
					System.out.println("Enter haulier Id...");
					bean.setHaulierId(sca.next());
					System.out.println("Enter Deliver date...");
					bean.setDeliverdate(sca.next());
					System.out.println("Enter Product quantity...");
					bean.setQuantity(sca.nextDouble());
					System.out.println("----------------------");
					cdao.addContractor(bean);
					l=cdao.getAllContractors();
					m.put(bean.getContractno(),l);
					System.out.println(m.get(s));
				}
				else {
					System.err.println("No contract with this contract number... try again");
				}
				break;
			case 6:
				return;
			default: System.err.println("wrong input");
			}
		}
	}
	public static void adminControlProduct(){
		ProductBean bean;
		ProductDao cdao= FmsFactory.instanceOfProductDaoImpl();
		List<ProductBean> l=new ArrayList<ProductBean>();
		Map<Integer, List<ProductBean>> m=new HashMap<Integer, List<ProductBean>>();
		while(true) {
			bean=new ProductBean();
			System.out.println("Enter 1 to add a product ");
			System.out.println("Enter 2 to to get all product information");
			System.out.println("Enter 3 to delete a Product");
			System.out.println("Enter 4 to modify the Product");
			System.out.println("Enter 5 to go to home page");

			int toggle=sca.nextInt();
			switch(toggle) {
			case 1:
				System.out.println("Enter ProductID...");
				bean.setProdid(sca.nextInt());
				System.out.println("Enter Product Name...");
				bean.setPname(sca.next());
				System.out.println("Enter product description....");
				bean.setPdesc(sca.next());
				System.out.println("----------------------");
				boolean b=cdao.addProduct(bean);
				l=cdao.getAllProduct();
				if(b)
				{
					System.out.println("new Product added...");

				}
				else {
					System.err.println("not added");
				}
				m.put(bean.getProdid(),l);
				break;
			case 2:

				Set<Entry<Integer, List<ProductBean>>> s1= m.entrySet();
				for (Entry<Integer, List<ProductBean>> e : s1) {
					System.out.println("-------------------");
					System.out.print("Product-ID is=====>");
					System.out.println(e.getKey());
					System.out.println(e.getValue());
					System.out.println("-------------------");
				}
				break;
			case 3: 
				System.out.println("enter contract-no");
				int sa=sca.nextInt();
				if(cdao.deleteProduct(sa, m)) {
					m.remove(sa);
					System.out.println("Product deleted");
				}
				else
					System.err.println("error... Please try again");
				break;
			case 4:
				System.out.println("Enter the Product ID to search for modification");
				int s=sca.nextInt();
				if(cdao.searchProduct(s, m)) {
					System.out.println(m.get(s));
					m.remove(s);
					bean.setProdid(s);
					System.out.println("Enter Product Name...");
					bean.setPname(sca.next());
					System.out.println("Enter product description....");
					bean.setPdesc(sca.next());
					System.out.println("----------------------");
					cdao.addProduct(bean);
					l=cdao.getAllProduct();
					m.put(bean.getProdid(),l);
					System.out.println(m.get(s));
				}
				else {
					System.err.println("No contract with this contract number... try again");
				}
				break;
			case 5:
				return;
			default: System.err.println("wrong input");
			}
		}

	}
}