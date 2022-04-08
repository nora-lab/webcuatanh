package com.example.demo2.respository;
import com.example.demo2.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRespository extends  JpaRepository<Account, Integer>{

}
