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

import com.bdi.test.service.GmjBookService;
import com.bdi.test.vo.GmjBookVo;

@Controller
public class GmjBookController {
	
	@Autowired
	private GmjBookService gbs;
	
	@GetMapping(value="/bboards")
	public @ResponseBody List<GmjBookVo> getGmjBookList() {
		return gbs.getGmjBookList();
	}
	@GetMapping(value="/bboards/{gmjBookNo}")
	public @ResponseBody GmjBookVo selectGmjBook(@PathVariable Integer gmjBookNo) {
		return gbs.getGmjBook(gmjBookNo);
	}
	
	@PostMapping(value="/bboards")
	public @ResponseBody int insertGmjBook(@RequestBody GmjBookVo bg) {
		return gbs.insertGmjBook(bg);
	}
	
	@PutMapping(value="/bboards/{gmjBookNo}")
	public @ResponseBody int updateGmjBook(@RequestBody GmjBookVo bg,@PathVariable Integer gmjBookNo) {
		bg.setgmjbookno(gmjBookNo);
		return gbs.updateGmjBook(bg);
	}
	@DeleteMapping(value="/bboards/{gmjBookNo}")
	public @ResponseBody int deleteGmjBook(@PathVariable Integer gmjBookNo) {
		return gbs.deleteGmjBook(gmjBookNo);
	}

}
