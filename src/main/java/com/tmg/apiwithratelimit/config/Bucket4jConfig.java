package com.tmg.apiwithratelimit.config;

import io.github.bucket4j.Bucket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class Bucket4jConfig {

    @Bean
    public Bucket bucket() {
        return Bucket.builder()
                .addLimit(
                        limit -> limit.capacity(5)
                                .refillGreedy(10, Duration.ofMinutes(1)))
                .build();
    }
}


