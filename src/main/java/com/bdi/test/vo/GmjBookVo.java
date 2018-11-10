package com.bdi.test.vo;

public class GmjBookVo {
	private Integer gmjbookno;
	private String gmjbookname;
	private String gmjbooktitle;
	private String gmjbookdesc;
	public Integer getgmjbookno() {
		return gmjbookno;
	}
	public void setgmjbookno(Integer gmjbookno) {
		this.gmjbookno = gmjbookno;
	}
	public String getGmjbookname() {
		return gmjbookname;
	}
	public void setGmjbookname(String gmjbookname) {
		this.gmjbookname = gmjbookname;
	}
	public String getGmjbooktitle() {
		return gmjbooktitle;
	}
	public void setGmjbooktitle(String gmjbooktitle) {
		this.gmjbooktitle = gmjbooktitle;
	}
	public String getGmjbookdesc() {
		return gmjbookdesc;
	}
	public void setGmjbookdesc(String gmjbookdesc) {
		this.gmjbookdesc = gmjbookdesc;
	}
	@Override
	public String toString() {
		return "GmjBookVo [gmjbookno=" + gmjbookno + ", gmjbookname=" + gmjbookname + ", gmjbooktitle=" + gmjbooktitle
				+ ", gmjbookdesc=" + gmjbookdesc + "]";
	}
	

}
