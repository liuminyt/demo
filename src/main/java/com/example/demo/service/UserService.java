package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liumin5 on 2017/10/16.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean verifyUser(User user){
        if (userRepository.findByNameAndPassword(user.getName(), user.getPassword()).isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    public String registerUser(User user){
        if (userRepository.findByName(user.getName()).isEmpty()){
            userRepository.save(user);
            return "username : " + user.getName() + " register success!!";
        }else {
            return "username : " + user.getName() + " 被占用！";
        }
    }
}
