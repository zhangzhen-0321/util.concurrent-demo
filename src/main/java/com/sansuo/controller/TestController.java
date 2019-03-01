package com.sansuo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zz on 2019/1/17.
 */
@RequestMapping("/")
@RestController
public class TestController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/demo")
    public String demo(){
        for(int i=6;i<10;i++){
            kafkaTemplate.send("test","hello","hello kafka ----"+i);
        }
        return "------------";
    }
}
