package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogViewController {
    @RequestMapping("/index")
    public String index () {
        return "index";
    }
}
