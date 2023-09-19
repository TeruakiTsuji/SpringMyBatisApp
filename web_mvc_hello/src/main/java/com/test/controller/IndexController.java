package com.test.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = GET)
    public String index(Model model) {
    	
        // jsp のファイル名
    	String ret = "index";

    	String appId = "web_mvc_hello";
    	String Title = "Welcome SpringFramework";
    	model.addAttribute("appId", appId);
    	model.addAttribute("welcomeTitle", Title);
    	
    	System.out.println("welcomeTitle:" + Title);
    	
        return ret;
    }
}
