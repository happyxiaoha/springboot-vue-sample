package com.smallcode.springbootvuewsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smallcode.springbootvuewsample.service.UserService;

@Controller
public class HomeController {

  @Autowired
  private UserService userService;
  
  @RequestMapping(value = "/",method = RequestMethod.GET)
  public String index(ModelMap model){
      model.addAttribute("username",userService.getUsername());
      return "index";
  }
  @RequestMapping(value = "/getMsg",method = RequestMethod.GET)
  @ResponseBody
  public String getMsg(){
      return "{'name':'"+ userService.getUsername() +"'+ }";
  }
}
