package com.bdi.test.service;

import java.util.List;

import com.bdi.test.vo.GmjAcaVo;

public interface GmjAcaService {
	public List<GmjAcaVo> getGmjAcaList();
	public GmjAcaVo getGmjAca(Integer gmjAcademyNo);
	public int insertGmjAca(GmjAcaVo ag);
	public int updateGmjAca(GmjAcaVo ag);
	public int deleteGmjAca(Integer gmjAcademyNo);

}
