package com.bdi.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.test.dao.ExamDAO;
import com.bdi.test.service.ExamService;
import com.bdi.test.vo.ExamVo;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamDAO edao;
	@Override
	public List<ExamVo> getExamList() {
		// TODO Auto-generated method stub
		return edao.getExamList();
	}

	@Override
	public ExamVo getExam(Integer num) {
		// TODO Auto-generated method stub
		return edao.getExam(num);
	}

}
