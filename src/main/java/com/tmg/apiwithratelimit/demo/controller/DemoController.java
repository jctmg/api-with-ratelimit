package com.tmg.apiwithratelimit.demo.controller;

import com.tmg.apiwithratelimit.common.ApiRateLimitException;
import io.github.bucket4j.Bucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/v1")
public class DemoController {

    private final Bucket bucket;

    public DemoController(@Autowired Bucket bucket) {
        this.bucket = bucket;
    }

    @GetMapping
    public String getString() {

        if (!bucket.tryConsume(1)) {
            throw new ApiRateLimitException("Rate limit reached! reset={}");
        }

        return "getString();";
    }

}
