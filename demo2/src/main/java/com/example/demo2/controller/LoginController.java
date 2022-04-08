package com.example.demo2.controller;

import com.example.demo2.entity.Account;
import com.example.demo2.service.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private Service service;

    public LoginController(Service service) {
        super();
        this.service = service;
    }
    @GetMapping("/")
    public String Home(Model model){
        Account account = new Account();
        model.addAttribute("account", account);
        return "Login";
    }
    @PostMapping ("/login")
    public String Login(@ModelAttribute("account") Account account, Model model){
       if(service.checklogin(account.getEmail(), account.getPassword())){
           Account existed_acc = service.Login(account, true);
           model.addAttribute(service.Login(existed_acc, true));
           return "Home";
       }
        return "Login";
    }
    @GetMapping("/logout")
    public String logout(Model model){
        Account account = new Account();
        model.addAttribute(service.Login(account, false));
        model.addAttribute("account", account);
        return "Login";
    }
}
