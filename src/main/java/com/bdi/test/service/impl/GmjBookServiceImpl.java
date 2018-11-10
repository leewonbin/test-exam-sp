package com.bdi.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.test.dao.GmjBookDAO;
import com.bdi.test.service.GmjBookService;
import com.bdi.test.vo.GmjBookVo;

@Service
public class GmjBookServiceImpl implements GmjBookService {

	@Autowired
	private GmjBookDAO bodao;
	
	@Override
	public List<GmjBookVo> getGmjBookList() {
		// TODO Auto-generated method stub
		return bodao.getGmjBookList();
	}

	@Override
	public GmjBookVo getGmjBook(Integer gmjBookNo) {
		// TODO Auto-generated method stub
		return bodao.getGmjBook(gmjBookNo);
	}

	@Override
	public int insertGmjBook(GmjBookVo bg) {
		// TODO Auto-generated method stub
		return bodao.insertGmjBook(bg);
	}

	@Override
	public int updateGmjBook(GmjBookVo bg) {
		// TODO Auto-generated method stub
		return bodao.updateGmjBook(bg);
	}

	@Override
	public int deleteGmjBook(Integer gmjBookNo) {
		// TODO Auto-generated method stub
		return bodao.deleteGmjBook(gmjBookNo);
	}

}
