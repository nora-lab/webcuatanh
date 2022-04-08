package com.example.demo2.service;

import com.example.demo2.entity.Account;

public interface Service {
    Boolean checklogin(String name, String password);
    Account Login(Account account, Boolean check);
}
