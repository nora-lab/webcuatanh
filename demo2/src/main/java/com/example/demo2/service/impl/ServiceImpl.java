package com.example.demo2.service.impl;
import com.example.demo2.entity.Account;
import com.example.demo2.respository.UserRespository;
import com.example.demo2.service.Service;
import java.util.List;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    private UserRespository userRespository;

    public ServiceImpl(UserRespository userRespository) {
        super();
        this.userRespository = userRespository;
    }

    @Override
    public Boolean checklogin(String name, String password) {
        List<Account> Accounts = userRespository.findAll();
        for (Account i : Accounts) {
            if (name.equals(i.getEmail()) && password.equals(i.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Account Login(Account account, Boolean check) {
        if (check == true) {
            List<Account> Accounts = userRespository.findAll();
            for (Account i : Accounts) {
                if (account.getEmail().equals(i.getEmail()) && account.getPassword().equals(i.getPassword())) {
                    return i;
                }
            }
        }
        return new Account();
    }
}
