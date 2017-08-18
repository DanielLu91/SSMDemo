package com.controlDatabaseDemo.oneToOne.controller;

import com.controlDatabaseDemo.oneToOne.service.MappingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by yilu on 18/8/17.
 */
@Controller
public class MappingControl {
    @Resource
    private MappingService mappingService;
    @RequestMapping("/oneToOne")
    public String oneToOne(int id){
        return "/mapping/oneToOne";
    }
}
