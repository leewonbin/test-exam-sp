package com.bdi.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.test.dao.GmjBookDAO;
import com.bdi.test.vo.GmjBookVo;

@Repository
public class GmjBookDAOImpl implements GmjBookDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<GmjBookVo> getGmjBookList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.gmj.sp.GmjBook.selectGmjBookList");
	}

	@Override
	public GmjBookVo getGmjBook(Integer gmjBookNo) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.gmj.sp.GmjBook.selectGmjBook",gmjBookNo);
	}

	@Override
	public int insertGmjBook(GmjBookVo bg) {
		// TODO Auto-generated method stub
		return ss.insert("com.gmj.sp.GmjBook.insertGmjBook",bg);
	}

	@Override
	public int updateGmjBook(GmjBookVo bg) {
		// TODO Auto-generated method stub
		return ss.update("com.gmj.sp.GmjBook.updateGmjBook",bg);
	}

	@Override
	public int deleteGmjBook(Integer gmjBookNo) {
		// TODO Auto-generated method stub
		return ss.delete("com.gmj.sp.GmjBook.deleteGmjBook",gmjBookNo);
	}

}
