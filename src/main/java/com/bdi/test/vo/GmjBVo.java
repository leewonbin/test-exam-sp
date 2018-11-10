package com.bdi.test.vo;

public class GmjBVo {
	
	private Integer gmjbboardno;
	private String gmjbboardtitle;
	private String gmjbboarddesc;
	private String gmjbboardcredat;
	private String gmjbboardmoddat;
	private String gmjbboardcnt;
	@Override
	public String toString() {
		return "GmjVo [gmjbboardno=" + gmjbboardno + ", gmjbboardtitle=" + gmjbboardtitle + ", gmjbboarddesc="
				+ gmjbboarddesc + ", gmjbboardcredat=" + gmjbboardcredat + ", gmjbboardmoddat=" + gmjbboardmoddat
				+ ", gmjbboardcnt=" + gmjbboardcnt + "]";
	}
	public Integer getGmjbboardno() {
		return gmjbboardno;
	}
	public void setGmjbboardno(Integer gmjbboardno) {
		this.gmjbboardno = gmjbboardno;
	}
	public String getGmjbboardtitle() {
		return gmjbboardtitle;
	}
	public void setGmjbboardtitle(String gmjbboardtitle) {
		this.gmjbboardtitle = gmjbboardtitle;
	}
	public String getGmjbboarddesc() {
		return gmjbboarddesc;
	}
	public void setGmjbboarddesc(String gmjbboarddesc) {
		this.gmjbboarddesc = gmjbboarddesc;
	}
	public String getGmjbboardcredat() {
		return gmjbboardcredat;
	}
	public void setGmjbboardcredat(String gmjbboardcredat) {
		this.gmjbboardcredat = gmjbboardcredat;
	}
	public String getGmjbboardmoddat() {
		return gmjbboardmoddat;
	}
	public void setGmjbboardmoddat(String gmjbboardmoddat) {
		this.gmjbboardmoddat = gmjbboardmoddat;
	}
	public String getGmjbboardcnt() {
		return gmjbboardcnt;
	}
	public void setGmjbboardcnt(String gmjbboardcnt) {
		this.gmjbboardcnt = gmjbboardcnt;
	}

}
