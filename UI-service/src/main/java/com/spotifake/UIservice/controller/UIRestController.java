package com.spotifake.UIservice.controller;

import com.spotifake.UIservice.config.UIProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UIRestController {
    @Autowired
    private final UIProxy proxy;

    @GetMapping("/get-user-text")
    public @ResponseBody String getUserText() {
        return proxy.retrieveText();
    }
}
