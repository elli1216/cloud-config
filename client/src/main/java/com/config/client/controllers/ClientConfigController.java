package com.config.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RefreshScope
public class ClientConfigController {
    @Value("${sample.message:Default message}")
    private String configMessage;

    @GetMapping("/message")
    public String getMessage() {
        return configMessage;
    }
}
