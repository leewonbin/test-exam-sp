package com.bdi.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.test.dao.GmjVDAO;
import com.bdi.test.vo.GmjVVo;

@Repository
public class GmjVDAOImpl implements GmjVDAO {
	
	@Autowired
	private SqlSession ss;

	@Override
	public List<GmjVVo> getGmjVList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.gmj.sp.GmjV.selectGmjVList");
	}
	@Override
	public GmjVVo getGmjV(Integer gmjVBoardNo) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.gmj.sp.GmjV.selectGmjV",gmjVBoardNo);
	}

	

	@Override
	public int insertGmjV(GmjVVo vg) {
		// TODO Auto-generated method stub
		return ss.insert("com.gmj.sp.GmjV.insertGmjV",vg);
	}

	@Override
	public int updateGmjV(GmjVVo vg) {
		// TODO Auto-generated method stub
		return ss.update("com.gmj.sp.GmjV.updateGmjV",vg);
	}

	@Override
	public int deleteGmjV(Integer gmjVBoardNO) {
		// TODO Auto-generated method stub
		return ss.delete("com.gmj.sp.GmjV.deleteGmjV",gmjVBoardNO);
	}

}
