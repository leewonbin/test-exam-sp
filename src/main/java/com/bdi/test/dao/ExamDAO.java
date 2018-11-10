package com.bdi.test.dao;

import java.util.List;

import com.bdi.test.vo.ExamVo;

public interface ExamDAO {
	
	public List<ExamVo> getExamList();
	public ExamVo getExam(Integer num);

}
