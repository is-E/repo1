package com.hxs1.controller;

import com.hxs1.bean.User;
import com.hxs1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(String username, String password, Model model) {
        User user = userService.login(username, password);
//        System.out.println(user);
        model.addAttribute("user", user);
        return "list";
    }
}
