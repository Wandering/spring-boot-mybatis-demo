package cn.bwl.controller;

import cn.bwl.domain.TestBean;
import cn.bwl.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangyongping on 16/9/22.
 */
@RestController
public class TestController {
    @Autowired
    private ITestService testService;
    @RequestMapping("/")
    public String test(){
        return "hello,word!"+"32"+testService.test();
    }
}
