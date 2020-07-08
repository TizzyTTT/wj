package com.evan.wj.new_controller;

import com.evan.wj.new_pojo.Userinfo;
import com.evan.wj.result.Result;
import com.evan.wj.new_service.New_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@Controller
public class New_LoginController {

    @Autowired
    New_UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/new_login")
    @ResponseBody
    public Result login(@RequestBody Userinfo requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        Userinfo user = userService.get(username, requestUser.getPassword());

        if (null == user) {
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
