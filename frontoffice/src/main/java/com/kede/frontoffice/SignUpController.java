package com.kede.frontoffice;

import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Controller
@CrossOrigin
public class SignUpController {

    @GetMapping("/signup")
    public String showSignup(Model model) {
        return "signup";
    }

    @PostMapping("/signUp")
    public String createAccount(@RequestBody String payload) {
        String uri = "http://localhost:9191/users";
        RestTemplate rest = new RestTemplate();
        ResponseEntity<String> response = rest.exchange(uri, HttpMethod.GET, null, String.class);
        System.out.println("rsponse" + response);

        return "home";

    }
}
