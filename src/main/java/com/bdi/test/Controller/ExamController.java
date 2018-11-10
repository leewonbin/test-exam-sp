package com.bdi.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.test.service.ExamService;
import com.bdi.test.vo.ExamVo;

@Controller
public class ExamController {
	
	@Autowired
	private ExamService es;
	
	@GetMapping(value="/exams")
	public @ResponseBody List<ExamVo> getExamList() {
		return es.getExamList();
	}
	
	@GetMapping(value="/exams/{num}")
	public @ResponseBody ExamVo selectExam(@PathVariable Integer num) {
		return es.getExam(num);
	}
}
