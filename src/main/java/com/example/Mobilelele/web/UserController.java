package com.example.Mobilelele.web;

import com.example.Mobilelele.model.UserRegisterDTO;
import com.example.Mobilelele.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register(){
        return "auth-register";
    }

    @GetMapping("/login")
    public String login(){

        return "auth-login";
    }

    @PostMapping("/register")
    public String register(UserRegisterDTO userRegisterDTO){

        userService.registerUser(userRegisterDTO);
        return "index";
    }


}
