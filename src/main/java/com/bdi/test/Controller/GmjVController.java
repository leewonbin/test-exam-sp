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

import com.bdi.test.service.GmjVService;
import com.bdi.test.vo.GmjVVo;

@Controller
public class GmjVController {
	
	@Autowired
	private GmjVService gvs;
	
	@GetMapping(value="/vboards")
	public @ResponseBody List<GmjVVo> getGmjVList() {
	return gvs.getGmjVList();
}
	@GetMapping(value="/vboards/{gmjVBoardNo}")
	public @ResponseBody GmjVVo selectGmjV(@PathVariable Integer gmjVBoardNo) {
		return gvs.getGmjV(gmjVBoardNo);
	}
	
	@PostMapping(value="/vboards")
	public @ResponseBody int insertGmjV(@RequestBody GmjVVo vg) {
		return gvs.insertGmjV(vg);
	}
	@PutMapping(value="/vboards/{gmjVBoardNo}")
	public @ResponseBody int updateGmjV(@RequestBody GmjVVo vg,@PathVariable Integer gmjVBoardNo) {
		vg.setGmjvboardno(gmjVBoardNo);
		return gvs.updateGmjV(vg);
	}
	@DeleteMapping(value="/vboards/{gmjVBoardNo}")
	public @ResponseBody int deleteGmjV(@PathVariable Integer gmjVBoardNo) {
		return gvs.deleteGmjV(gmjVBoardNo);
	}

	

}
