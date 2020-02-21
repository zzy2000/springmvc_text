package com.accp.t4.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class Chengji {
	private String sno;
	private String kno;
	private String score;
	@JSONField(format = "yyyy-MM-dd")
	private String ktime;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getKno() {
		return kno;
	}
	public void setKno(String kno) {
		this.kno = kno;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getKtime() {
		return ktime;
	}
	public void setKtime(String ktime) {
		this.ktime = ktime;
	}
	public Chengji(String sno, String kno, String score, String ktime) {
		super();
		this.sno = sno;
		this.kno = kno;
		this.score = score;
		this.ktime = ktime;
	}
	public Chengji() {
		super();
	}
	
}
