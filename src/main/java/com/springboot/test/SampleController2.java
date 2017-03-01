package com.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController2 {

    @RequestMapping("/test2")
    @ResponseBody
    ModelAndView test2( long uid) {
        System.out.println("test2---"+uid);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","lijingen");
        modelAndView.addObject("age","123");
        modelAndView.setViewName("/test");
        return modelAndView;
    }

}