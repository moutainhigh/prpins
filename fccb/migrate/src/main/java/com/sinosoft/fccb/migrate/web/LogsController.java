package com.sinosoft.fccb.migrate.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogsController {
	
	private final static Logger logger = LoggerFactory.getLogger(LogsController.class);
	
	@RequestMapping(value = { "/", "/" }, method = RequestMethod.GET)
	public Long createLogs() {
		logger.info("----------------------------------INFO");
		logger.debug("----------------------------------DEBUG");
		logger.error("----------------------------------ERROR");
		return System.currentTimeMillis();
	}
}
