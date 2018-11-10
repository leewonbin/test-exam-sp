package com.bdi.test.vo;

public class GmjAcaVo {
	
	private Integer gmjacademyno;
	private String gmjacademyname;
	private String gmjacademytitle;
	private String gmjacademydesc;
	public Integer getGmjacademyno() {
		return gmjacademyno;
	}
	public void setGmjacademyno(Integer gmjacademyno) {
		this.gmjacademyno = gmjacademyno;
	}
	public String getGmjacademyname() {
		return gmjacademyname;
	}
	public void setGmjacademyname(String gmjacademyname) {
		this.gmjacademyname = gmjacademyname;
	}
	public String getGmjacademytitle() {
		return gmjacademytitle;
	}
	public void setGmjacademytitle(String gmjacademytitle) {
		this.gmjacademytitle = gmjacademytitle;
	}
	public String getGmjacademydesc() {
		return gmjacademydesc;
	}
	public void setGmjacademydesc(String gmjacademydesc) {
		this.gmjacademydesc = gmjacademydesc;
	}
	@Override
	public String toString() {
		return "GmjAcaVo [gmjacademyno=" + gmjacademyno + ", gmjacademyname=" + gmjacademyname + ", gmjacademytitle="
				+ gmjacademytitle + ", gmjacademydesc=" + gmjacademydesc + "]";
	}

}
