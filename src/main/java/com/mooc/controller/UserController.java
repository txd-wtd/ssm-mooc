package com.mooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.PublicKey;

@Controller
public class UserController {
    @RequestMapping("/hello")
        public String hello(){
        return "hello";
        }
        @RequestMapping("/new")
    public ModelAndView method(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("new");
        mav.addObject("num",100);
        return mav;
        }
}
