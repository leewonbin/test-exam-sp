package com.bdi.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.test.service.GmjAcaService;
import com.bdi.test.vo.GmjAcaVo;

@Controller
public class GmjAcaController {
	
	@Autowired
	private GmjAcaService gas;
	
	@GetMapping(value="/aboards")
	public @ResponseBody List<GmjAcaVo> getGmjAcaList() {
		return gas.getGmjAcaList();
	}
	
	@GetMapping(value="/aboards/{gmjAcademyNo}")
	public @ResponseBody GmjAcaVo selectGmjAca(@PathVariable Integer gmjAcademyNo) {
		return gas.getGmjAca(gmjAcademyNo);
	}
	
	@PostMapping(value="/aboards")
	public @ResponseBody int insertGmjAca(@RequestBody GmjAcaVo ag) {
		return gas.insertGmjAca(ag);
	}
	
	@PutMapping(value="/aboards/{gmjAcademyNo}")
	public @ResponseBody int updateGmjAca(@RequestBody GmjAcaVo ag,@PathVariable Integer gmjAcademyNo) {
		ag.setGmjacademyno(gmjAcademyNo);
		return gas.updateGmjAca(ag);
	}
	
	@DeleteMapping(value="/aboards/{gmjAcademyNo}")
	public @ResponseBody int deleteGmjAca(@PathVariable Integer gmjAcademyNo) {
		return gas.deleteGmjAca(gmjAcademyNo);
	}
	
	

}
