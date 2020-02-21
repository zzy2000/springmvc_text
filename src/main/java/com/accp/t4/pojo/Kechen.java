package com.accp.t4.pojo;

public class Kechen {
	private String kno;
	private String kname;
	private String zbh;
	public Kechen(String kno, String kname, String zbh) {
		super();
		this.kno = kno;
		this.kname = kname;
		this.zbh = zbh;
	}
	public Kechen() {
		super();
	}
	public String getKno() {
		return kno;
	}
	public void setKno(String kno) {
		this.kno = kno;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getZbh() {
		return zbh;
	}
	public void setZbh(String zbh) {
		this.zbh = zbh;
	}
	
}
