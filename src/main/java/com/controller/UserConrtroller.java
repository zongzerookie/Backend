package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/user")
public class UserConrtroller {

    @RequestMapping("/index")
    public String index() {
        return "/template/index";
    }

    @PostMapping("/login")
    @ResponseBody
    public User user(User u){
        return u;
    }

}
