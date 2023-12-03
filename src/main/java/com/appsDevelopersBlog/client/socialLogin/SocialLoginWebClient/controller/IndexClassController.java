package com.appsDevelopersBlog.client.socialLogin.SocialLoginWebClient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexClassController {
    @GetMapping("/")
    public String displayIndexPage(Model model){
        return "index";
    }
}
