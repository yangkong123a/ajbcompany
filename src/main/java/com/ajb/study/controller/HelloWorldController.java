package com.ajb.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author HeYi
 * @version V2.0
 * @Description: 测试页面
 * @date 2019/5/17 10:36
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/test")
    private String test(){

        return "helloWorld";
    }

    @RequestMapping("/testJson")
    @ResponseBody
    private String testJson(){

        return "{json: this is json data}";
    }

    @RequestMapping("/getIPAddr")
    @ResponseBody
    public String getIpAddress(HttpServletRequest request) {
        String remoteAddr = request.getRemoteAddr();
        String forwarded = request.getHeader("X-Forwarded-For");
        String realIp = request.getHeader("X-Real-IP");

        String ip = null;
        if (realIp == null) {
            if (forwarded == null) {
                ip = remoteAddr;
            } else {
                ip = remoteAddr + "/" + forwarded.split(",")[0];
            }
        } else {
            if (realIp.equals(forwarded)) {
                ip = realIp;
            } else {
                if (forwarded != null) {
                    forwarded = forwarded.split(",")[0];
                }
                ip = realIp + "/" + forwarded;
            }
        }
        return ip;
    }
}
