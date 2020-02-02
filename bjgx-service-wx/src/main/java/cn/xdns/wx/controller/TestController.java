package cn.xdns.wx.controller;

import cn.xdns.wx.pojo.Test;
import cn.xdns.wx.service.TestServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestServiceI testService;

    @RequestMapping(value = "test")
    public List<Test> findTest(){
        return testService.findTest(null);
    }

}
