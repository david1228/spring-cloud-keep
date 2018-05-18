package com.dskj.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by David.Liu on 18/5/14.
 */
@FeignClient(value = "service-server") // FeignClient("服务名") 服务名即注册到Eureka上的服务提供者的spring.application.name
public interface ServiceFeignClient {

    @RequestMapping(value="/cloud/add", method = RequestMethod.GET)
    String consumer(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);
}
