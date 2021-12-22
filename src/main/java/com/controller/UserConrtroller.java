package com.controller;

import com.pojo.User;
import com.service.UserService;
import com.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/user")
public class UserConrtroller {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "template/index";
    }

    @PostMapping("/login")
    @ResponseBody
    public JsonResult login(@RequestBody User u){
        return JsonResult.get(200, "success",userService.login(u));
    }

}
