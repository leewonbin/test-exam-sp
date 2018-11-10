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

import com.bdi.test.service.GmjBService;
import com.bdi.test.vo.GmjBVo;

@Controller
public class GmjBController {
	
	@Autowired
	private GmjBService gs;
	
	@GetMapping(value="/boards/{gmjBBoardNo}")
	public @ResponseBody GmjBVo selectGmj(@PathVariable Integer gmjBBoardNo) {
		return gs.getGmj(gmjBBoardNo);
	}
	@GetMapping(value="/boards")
	public @ResponseBody List<GmjBVo> getGmjList() {
		return gs.getGmjList();
	}
	@PostMapping(value="/boards")
	public @ResponseBody int insertGmj(@RequestBody GmjBVo g) {
		return gs.insertGmj(g);
	}
	@PutMapping(value="/boards/{gmjBBoardNo}")
	public @ResponseBody int updateGmj(@RequestBody GmjBVo g,@PathVariable Integer gmjBBoardNo) {
		return gs.updateGmj(g);
	}
	@DeleteMapping(value="/boards/{gmjBBoardNo}")
	public @ResponseBody int deleteGmj(@PathVariable Integer gmjBBoardNo) {
		return gs.deleteGmj(gmjBBoardNo);
	}

}
