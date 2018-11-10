package com.bdi.test.service;


import java.util.List;

import com.bdi.test.vo.GmjBVo;

public interface GmjBService {
	public GmjBVo getGmj(Integer gmjBBoardNo);
	public List<GmjBVo> getGmjList();
	public int insertGmj(GmjBVo g);
	public int updateGmj(GmjBVo g);
	public int deleteGmj(Integer gmjBBoardNO);
}
