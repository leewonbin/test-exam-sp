package com.bdi.test.Controller;


import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UriController {
	
	
	
	@GetMapping(value="/uri/**")
	public String goPage(HttpServletRequest request) {
		String uri=request.getRequestURI();
		uri = uri.replace("/uri/", "");
		return uri;
				
	}
	
}
