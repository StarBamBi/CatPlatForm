package com.example.catplatform.service;

import com.example.catplatform.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int join(Map<String, Object> map) {
        return userMapper.userJoin(map);
    }
}
