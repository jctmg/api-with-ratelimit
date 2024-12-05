package com.tmg.apiwithratelimit.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/v1")
public class DemoController {

    @GetMapping
    public String getString() {
        return "getString();";
    }

}
