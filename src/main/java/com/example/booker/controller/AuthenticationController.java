package com.example.booker.controller;
import com.example.booker.model.entity.UserEntity;
import com.example.booker.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AuthenticationController {

    public final UserRepository userRepository;

    public AuthenticationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
        UserEntity userEntity = new UserEntity();
        model.addAttribute("user", userEntity);
        return "sign-up";
    }

    @PostMapping("/signup")
    public String signupUser(@Valid UserEntity user, BindingResult result) {
        if (result.hasErrors()) {
            return "sign-up";
        }

        userRepository.save(user);
        return "publist";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login.html";
    }


}
