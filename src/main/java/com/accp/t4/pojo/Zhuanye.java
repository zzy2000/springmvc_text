package com.accp.t4.pojo;

public class Zhuanye {
	private String zno;
	private String zname;
	public String getZno() {
		return zno;
	}
	public void setZno(String zno) {
		this.zno = zno;
	}
	public String getZname() {
		return zname;
	}
	public void setZname(String zname) {
		this.zname = zname;
	}
	public Zhuanye(String zno, String zname) {
		super();
		this.zno = zno;
		this.zname = zname;
	}
	public Zhuanye() {
		super();
	}
	
}
