package com.bdi.test.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.test.dao.GmjBDAO;
import com.bdi.test.service.GmjBService;
import com.bdi.test.vo.GmjBVo;

@Service
public class GmjBServiceImpl implements GmjBService {

	@Autowired
	private GmjBDAO gdao;

	@Override
	public GmjBVo getGmj(Integer gmjBBoardNo) {
		// TODO Auto-generated method stub
		return gdao.getGmj(gmjBBoardNo);
	}

	@Override
	public List<GmjBVo> getGmjList() {
		// TODO Auto-generated method stub
		return gdao.getGmjList();
	}

	@Override
	public int insertGmj(GmjBVo g) {
		// TODO Auto-generated method stub
		return gdao.insertGmj(g);
	}

	@Override
	public int updateGmj(GmjBVo g) {
		// TODO Auto-generated method stub
		return gdao.updateGmj(g);
	}

	@Override
	public int deleteGmj(Integer gmjBBoardNO) {
		// TODO Auto-generated method stub
		return gdao.deleteGmj(gmjBBoardNO);
	}
	

}
