package com.bdi.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.test.dao.GmjAcaDAO;
import com.bdi.test.vo.GmjAcaVo;

@Repository
public class GmjAcaDAOImpl implements GmjAcaDAO {

	@Autowired
	private SqlSession ss;
	@Override
	public List<GmjAcaVo> getGmjAcaList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.gmj.sp.GmjAca.selectGmjAcaList");
	}

	@Override
	public GmjAcaVo getGmjAca(Integer gmjAcademyNo) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.gmj.sp.GmjAca.selectGmjAca",gmjAcademyNo);
	}

	@Override
	public int insertGmjAca(GmjAcaVo ag) {
		// TODO Auto-generated method stub
		return ss.insert("com.gmj.sp.GmjAca.insertGmjAca",ag);
	}

	@Override
	public int updateGmjAca(GmjAcaVo ag) {
		// TODO Auto-generated method stub
		return ss.update("com.gmj.sp.GmjAca.updateGmjAca",ag);
	}

	@Override
	public int deleteGmjAca(Integer gmjAcademyNo) {
		// TODO Auto-generated method stub
		return ss.delete("com.gmj.sp.GmjAca.deleteGmjAca",gmjAcademyNo);
	}

}
