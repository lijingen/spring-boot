package com.springboot.test;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
@ComponentScan(value = {"com.springboot.test"})
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/test")
    @ResponseBody
    ModelAndView test( long uid) {
        System.out.println("test---"+uid);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","lijingen");
        modelAndView.addObject("age","123");
        modelAndView.setViewName("/test");
        return modelAndView;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
        String a="a";
        String as[]=a.split(",");
        System.out.println("start success"+as.length);
    }
}