package com.kede.frontoffice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class SignUpController {

    @GetMapping("/signup")
    public String showSurvey(Model model) {
        return "signup";
    }
}
