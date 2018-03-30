package com.springms.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置客户端Controller。
 *
 * @author hmilyylimh
 *
 * @version 0.0.1
 *
 * @date 2017/10/15
 *
 */
@RestController
public class ConfigClientController {

    @Value("${profile1}")
    private String profile1;

    @Value("${profile2}")
    private String profile2;

    @GetMapping("/profile1")
    public String getProfile1(){
        return this.profile1;
    }

    @GetMapping("/profile2")
    public String getProfile2() {
        return profile2;
    }

}
