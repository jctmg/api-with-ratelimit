package com.tmg.apiwithratelimit.demo.controller;

import com.giffing.bucket4j.spring.boot.starter.context.RateLimiting;
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
