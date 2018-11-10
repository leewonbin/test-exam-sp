package com.bdi.test.dao;

import java.util.List;

import com.bdi.test.vo.GmjBookVo;

public interface GmjBookDAO {
	public List<GmjBookVo> getGmjBookList();
	public GmjBookVo getGmjBook(Integer gmjBookNo);
	public int insertGmjBook(GmjBookVo bg);
	public int updateGmjBook(GmjBookVo bg);
	public int deleteGmjBook(Integer gmjBookNo);

}
