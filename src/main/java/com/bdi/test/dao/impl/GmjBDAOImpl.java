package com.bdi.test.dao.impl;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.test.dao.GmjBDAO;
import com.bdi.test.vo.GmjBVo;

@Repository
public class GmjBDAOImpl implements GmjBDAO {

	@Autowired
	private SqlSession ss;

	@Override
	public GmjBVo getGmj(Integer gmjBBoardNo) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.gmj.sp.Gmj.selectGmj",gmjBBoardNo);
	}

	@Override
	public List<GmjBVo> getGmjList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.gmj.sp.Gmj.selectGmjList");
	}

	@Override
	public int insertGmj(GmjBVo g) {
		// TODO Auto-generated method stub
		return ss.insert("com.gmj.sp.Gmj.insertGmj",g);
	}

	@Override
	public int updateGmj(GmjBVo g) {
		// TODO Auto-generated method stub
		return ss.update("com.gmj.sp.Gmj.updateGmj",g);
	}

	@Override
	public int deleteGmj(Integer gmjBBoardNO) {
		// TODO Auto-generated method stub
		return ss.delete("com.gmj.sp.Gmj.deleteGmj",gmjBBoardNO);
	}
	


}
