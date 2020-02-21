package com.accp.t4.pojo;

public class Address {

	private Integer aid;
	private String aname;
	private String atel;

	public Address(String aname, String atel) {
		super();
		this.aname = aname;
		this.atel = atel;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAtel() {
		return atel;
	}

	public void setAtel(String atel) {
		this.atel = atel;
	}

	public Address() {
		super();
	}

}
