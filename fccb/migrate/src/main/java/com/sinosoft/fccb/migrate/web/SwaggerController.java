package com.sinosoft.fccb.migrate.web;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api("SwaggerController接口测试")
@Controller
@RequestMapping("/api")
public class SwaggerController {

	@RequestMapping(value="",method = RequestMethod.GET)
	public String swagger() {
		return "index";
	}
	
}
