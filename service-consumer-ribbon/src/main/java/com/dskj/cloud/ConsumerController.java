package com.dskj.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by David.Liu on 18/5/13.
 */
@RestController
public class ConsumerController {

    private static final String EUREKA_CLIENT = "service-server";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConusmer(int a, int b) {
        return restTemplate.getForEntity("http://"+EUREKA_CLIENT+"/cloud/add?a="+a+"&b="+b+"", String.class).getBody();
    }
}
