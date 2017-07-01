package com.study.mybatis.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionController {
	private final static Log log = LogFactory.getLog(ExceptionController.class);

	@ExceptionHandler(Throwable.class)
	@ResponseBody
	public Object exception(Exception e, WebRequest request) {
		log.error(e.getMessage());
		return new ResultModel(false, e.getMessage(), null);
	}
}
