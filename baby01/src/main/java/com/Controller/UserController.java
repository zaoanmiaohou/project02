package com.Controller;

import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.pojo.User;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("findAll")
    @ResponseBody
    public List<User> findAll(){

        List<User> all = userService.findAll();

        return all;
    }

}
