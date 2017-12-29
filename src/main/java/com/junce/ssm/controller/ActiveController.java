package com.junce.ssm.controller;

import com.junce.ssm.constant.CommConstant;
import com.junce.ssm.dto.Result;
import com.junce.ssm.service.ActiveService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
@Controller
@RequestMapping("/active")
public class ActiveController {

    @Resource
    ActiveService activeService;

    @ResponseBody
    @RequestMapping("/getActive")
    public Result<Map<String,Object>> getActive(){
        return new Result(CommConstant.SUCCESS,"获取成功", activeService.getActives());
    }

    @ResponseBody
    @RequestMapping("/getNotice")
    public Result<Map<String,Object>> getNotice(){
        return new Result(CommConstant.SUCCESS,"获取成功",activeService.getNotice());
    }

}
