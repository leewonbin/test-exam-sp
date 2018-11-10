package com.bdi.test.dao;

import java.util.List;

import com.bdi.test.vo.GmjVVo;

public interface GmjVDAO {
	public GmjVVo getGmjV(Integer gmjVBoardNo);
	public List<GmjVVo> getGmjVList();
	public int insertGmjV(GmjVVo vg);
	public int updateGmjV(GmjVVo vg);
	public int deleteGmjV(Integer gmjVBoardNO);

}
