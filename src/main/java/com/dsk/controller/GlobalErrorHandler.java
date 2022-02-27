package com.dsk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalErrorHandler {

    private final static Logger logger = LoggerFactory.getLogger(GlobalErrorHandler.class);
    // 根据业务规则,统一处理异常
    //@ExceptionHandler(Exception.class)
    @ResponseBody
    public Object exceptionHandler(HttpServletRequest request, Throwable error) {
        System.out.println("1111");
        return null;
    }
}
