package com.dskj.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by David.Liu on 18/5/15.
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @Value("${config}")
    private String config;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }

    @GetMapping("/config")
    public String config(){
        return this.config;
    }
}
