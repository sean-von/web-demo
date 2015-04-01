package com.smikevon.controller;

import com.smikevon.entity.User;
import com.smikevon.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by fengxiao on 15-3-31.
 */
@Controller
@RequestMapping("demo")
public class DemoController {
    
    @Autowired
    private DemoService demoService;
    
    @RequestMapping(value="getUser",method = RequestMethod.GET)
    public String getUser(@ModelAttribute("model")ModelMap model){
        List<User> users = demoService.getUsers();
        model.addAttribute("users", users);
        model.addAttribute("test","测试");

        System.out.println("得到的用户大小:"+users.size());
        if(users.size() > 0){
            System.out.println(users.get(0).toString());
        }
        
        return "demo";
    }
}
