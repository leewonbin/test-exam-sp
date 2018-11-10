package com.bdi.test.service;

import java.util.List;

import com.bdi.test.vo.GmjBookVo;

public interface GmjBookService {
	public List<GmjBookVo> getGmjBookList();
	public GmjBookVo getGmjBook(Integer gmjBookNo);
	public int insertGmjBook(GmjBookVo bg);
	public int updateGmjBook(GmjBookVo bg);
	public int deleteGmjBook(Integer gmjBookNo);
}
