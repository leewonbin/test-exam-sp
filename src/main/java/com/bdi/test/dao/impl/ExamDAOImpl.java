package com.bdi.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.test.dao.ExamDAO;
import com.bdi.test.vo.ExamVo;

@Repository
public class ExamDAOImpl implements ExamDAO {

	@Autowired
	private SqlSession ss;
	@Override
	public List<ExamVo> getExamList() {
		return ss.selectList("com.exam.sp.Exam.selectExamList");
	}

	@Override
	public ExamVo getExam(Integer num) {
		return ss.selectOne("com.exam.sp.Exam.selectExam",num);
	}

}
