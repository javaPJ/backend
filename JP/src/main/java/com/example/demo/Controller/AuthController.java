package com.example.demo.Controller;

import com.example.demo.Entity.UserDB;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String login(UserDB userDB){
        userDB.setRegDate(new Date());
        return "redirect:/auth/signup" + accountRepository.save(userDB).getClass();
    }
}