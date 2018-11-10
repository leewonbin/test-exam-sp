package com.bdi.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.test.dao.GmjVDAO;
import com.bdi.test.service.GmjVService;
import com.bdi.test.vo.GmjVVo;

@Service
public class GmjVServiceImpl implements GmjVService {

	@Autowired
	private GmjVDAO vdao;
	
	@Override
	public GmjVVo getGmjV(Integer gmjVBoardNo) {
		// TODO Auto-generated method stub
		return vdao.getGmjV(gmjVBoardNo);
	}

	@Override
	public List<GmjVVo> getGmjVList() {
		// TODO Auto-generated method stub
		return vdao.getGmjVList();
	}

	@Override
	public int insertGmjV(GmjVVo vg) {
		// TODO Auto-generated method stub
		return vdao.insertGmjV(vg);
	}
	

	@Override
	public int updateGmjV(GmjVVo vg) {
		// TODO Auto-generated method stub
		return vdao.updateGmjV(vg);
	}

	@Override
	public int deleteGmjV(Integer gmjVBoardNO) {
		// TODO Auto-generated method stub
		return vdao.deleteGmjV(gmjVBoardNO);
	}

	

}
