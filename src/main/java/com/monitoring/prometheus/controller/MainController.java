package com.monitoring.prometheus.controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MainController {
    
    @RequestMapping(value="/")
    @ResponseBody
    public String doMain() {
        return "[Monitoring] Hello. This is Prototype Project";
    }
    
    @RequestMapping(value="/endpoint1")
    @ResponseBody
    public String doEndPoint1() {
        return "[Monitoring] EndPoint 1";
    }
    

    @RequestMapping(value="/endpoint2")
    @ResponseBody
    public String doEndPoint2() {
        return "[Monitoring] EndPoint 2";
    }
    
    
}
