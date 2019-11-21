package com.biquan.helloworld.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
public class PrivateController {

    @PostMapping
    public String getMessage(HttpServletRequest request) {
        return "Hello from private API controller";
    }
}