package com.test.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.bean.User;
import com.test.dto.AccountBean;

@Controller
public class AccountController {

	@RequestMapping(value = "/account", method = GET)
	public ModelAndView account() {
		
		ModelAndView ret = new ModelAndView();
		ret.setViewName("account");
		
		AccountBean ab = new AccountBean();
		
		List<User> list = ab.getUserList();
		if( list != null ) {
			for (User user : list) {
				System.out.println("loginid:" + user.getLoginid()
				+ " name:"   + user.getName()
				+ " pass:"   + user.getPass()
				+ " roleid:" + user.getRoleid());
			}
		} else {
			System.out.println("getUserList() is null");
		}
		ret.addObject("accounts",list);
		
		return ret;
	}
}
