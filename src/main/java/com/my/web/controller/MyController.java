package com.my.web.controller;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.ResponseBody;  
  
/** 
 * TODO ���Ʋ���� 
 * @author 591791 
 * @date 2016��10��11�� 
 */  
@Controller  
public class MyController {  
      
    @RequestMapping("login") //��������ǰ̨��login����  
    private @ResponseBody String hello(  
            @RequestParam(value = "username", required = false)String username,  
            @RequestParam(value = "password", required = false)String password  
            ){  
        return "Hello "+username+",Your password is: "+password;  
          
    }  
  
}  