package com.example.booker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/users")
    public String showUserList() {
        return null;
    }

    @GetMapping("/user")
    public String showUserEditForm() {
        return null;
    }

    @GetMapping("/edit-user")
    public String editUser() {
        return "user";
    }
}
