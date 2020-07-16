package com.evan.wj.new_controller;

import com.evan.wj.new_service.New_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    New_UserService userService;

//    @PostMapping("api/")

}
