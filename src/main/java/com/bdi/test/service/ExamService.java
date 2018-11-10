package com.bdi.test.service;

import java.util.List;

import com.bdi.test.vo.ExamVo;

public interface ExamService {
	public List<ExamVo> getExamList();
	public ExamVo getExam(Integer num);


}
