package com.example.Mobilelele.service.impl;

import com.example.Mobilelele.model.UserRegisterDTO;
import com.example.Mobilelele.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(UserRegisterDTO userRegisterDTO) {
        //TODO
        System.out.println("The user received is: " + userRegisterDTO);
    }
}
