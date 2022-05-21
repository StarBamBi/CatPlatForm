package com.example.catplatform.controller;

import com.example.catplatform.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/join")
    public void Join() {
    }

    @PostMapping("/join")
    public void joinPost(@RequestBody Map<String, Object> map) {
        userService.join(map);
    }
}
