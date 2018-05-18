package com.dskj.cloud;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by David.Liu on 18/5/14.
 */
@RestController
public class FeignController implements ServiceFeignClient {

    @Override public String consumer(int a, int b) {
        return null;
    }
}
