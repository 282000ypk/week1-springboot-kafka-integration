package com.assignment.kafkaassignment.controller;

import com.assignment.kafkaassignment.Producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/kafka")
public class Controller {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/message")
    public String publishMessage(@RequestParam("msg") String msg){
        return kafkaProducer.sendMessage(msg);
    }

}
