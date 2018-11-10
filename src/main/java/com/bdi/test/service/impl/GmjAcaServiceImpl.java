package com.bdi.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.test.dao.GmjAcaDAO;
import com.bdi.test.service.GmjAcaService;
import com.bdi.test.vo.GmjAcaVo;

@Service
public class GmjAcaServiceImpl implements GmjAcaService {

	@Autowired
	private GmjAcaDAO adao;
	
	@Override
	public List<GmjAcaVo> getGmjAcaList() {
		// TODO Auto-generated method stub
		return adao.getGmjAcaList();
	}

	@Override
	public GmjAcaVo getGmjAca(Integer gmjAcademyNo) {
		// TODO Auto-generated method stub
		return adao.getGmjAca(gmjAcademyNo);
	}

	@Override
	public int insertGmjAca(GmjAcaVo ag) {
		// TODO Auto-generated method stub
		return adao.insertGmjAca(ag);
	}

	@Override
	public int updateGmjAca(GmjAcaVo ag) {
		// TODO Auto-generated method stub
		return adao.updateGmjAca(ag);
	}

	@Override
	public int deleteGmjAca(Integer gmjAcademyNo) {
		// TODO Auto-generated method stub
		return adao.deleteGmjAca(gmjAcademyNo);
	}

}
