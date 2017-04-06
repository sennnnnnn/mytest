package com.hs.dubbo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class BaseController {
	
	@RequestMapping(value="/**")
	public String toLogin(HttpServletRequest request){
//		<%=request.getContextPath()%>/jsp/manager_view/wrsxfx_echart.action
		System.out.println("进来没?");
		String url = request.getServletPath();
		System.out.println(url+"======1");
		url = url.replaceAll("/jsp/", "").replaceAll(".action", "");
		System.out.println(url+"======2");
		return url;
	}
	
	@RequestMapping(value="/Page/{file}/{jsp}")
	public String toPage( @PathVariable String  file,@PathVariable String jsp){
		return file+"/"+jsp;
		
	}
}
