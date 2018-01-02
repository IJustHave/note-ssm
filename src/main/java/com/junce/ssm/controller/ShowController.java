package com.junce.ssm.controller;

import com.junce.ssm.constant.CommConstant;
import com.junce.ssm.dto.Result;
import com.junce.ssm.model.ShowListBean;
import com.junce.ssm.service.ShowService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/2 0002.
 */
@Controller
@RequestMapping("/show")
public class ShowController {

    @Resource
    ShowService showService;

    @ResponseBody
    @RequestMapping("/showList")
    public Result<Map<String,Object>> getShowList(){
        return new Result(CommConstant.SUCCESS,"处理成功",showService.getShowList());
    }
}
