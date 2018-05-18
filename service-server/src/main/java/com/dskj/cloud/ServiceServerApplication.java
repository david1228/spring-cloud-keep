package com.dskj.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by David.Liu on 18/5/9.
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceServerApplication.class).run(args);
    }
}
