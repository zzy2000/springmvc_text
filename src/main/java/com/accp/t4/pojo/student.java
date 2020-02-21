package com.accp.t4.pojo;

public class student {
	private String sno;
	private String sname;
	private String sclass;
	private String sbh;
	public student() {
		super();
	}
	public student(String sno, String sname, String sclass, String sbh) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sclass = sclass;
		this.sbh = sbh;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getSbh() {
		return sbh;
	}
	public void setSbh(String sbh) {
		this.sbh = sbh;
	}
}
