package com.capgemini.fmsapp.scheduler;

public class ProductBean {
	
	private int prodid;
    private String pname;
    private String pdesc;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	@Override
	public String toString() {
		return "ProductBean [prodid=" + prodid + ", pname=" + pname + ", pdesc=" + pdesc + "]";
	}
	
}
