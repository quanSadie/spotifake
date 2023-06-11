package com.spotifake.UIservice.controller;

import com.spotifake.UIservice.config.UIProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class UIController {
    @Autowired
    private final UIProxy proxy;

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }
}
