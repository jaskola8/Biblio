package pl.booker.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.booker.model.entity.UserEntity;
import pl.booker.repository.UserRepository;

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
        return "signup";
    }

    @PostMapping("/signup")
    public String signupUser(@Valid UserEntity user, BindingResult result) {
        if (result.hasErrors()) {
            return "signup";
        }

        userRepository.save(user);
        return "home";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login.html";
    }


}
