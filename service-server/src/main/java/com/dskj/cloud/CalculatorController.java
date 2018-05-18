package com.dskj.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by David.Liu on 18/5/9.
 */
@RestController()
@RequestMapping("/cloud")
public class CalculatorController {

    private Logger logger = LoggerFactory.getLogger(CalculatorController.class);
    @Resource
    private DiscoveryClient client;

    @RequestMapping("/add")
    public int add (int a, int b) {
        int result = a + b;

//        ServiceInstance serviceInstance = client.getLocalServiceInstance();
//        logger.info("uri:{}, serviceId:{}, result:{}", serviceInstance.getUri(), serviceInstance.getServiceId(), result);
        List<String> services = client.getServices();
        logger.info("services:{}", services);
        return result;
    }

}
