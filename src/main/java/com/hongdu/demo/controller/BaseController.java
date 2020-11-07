package com.hongdu.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hongdu.demo.comm.Constants;
import com.hongdu.demo.entity.res.ResResultEntity;

@Controller
public class BaseController {
    protected String TAG = getClass().getName();
    protected Logger logger = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResResultEntity exception(Exception e) {
        logger.error(TAG, e);
        ResResultEntity entity = new ResResultEntity();
        entity.setCode(Constants.ResultCode.EXCEPTION);
        entity.setMessage(e.getMessage());
        return entity;
    }
}