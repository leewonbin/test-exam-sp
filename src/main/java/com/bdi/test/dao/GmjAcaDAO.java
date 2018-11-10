package com.bdi.test.dao;

import java.util.List;

import com.bdi.test.vo.GmjAcaVo;

public interface GmjAcaDAO {
	public List<GmjAcaVo> getGmjAcaList();
	public GmjAcaVo getGmjAca(Integer gmjAcademyNo);
	public int insertGmjAca(GmjAcaVo ag);
	public int updateGmjAca(GmjAcaVo ag);
	public int deleteGmjAca(Integer gmjAcademyNo);

}
