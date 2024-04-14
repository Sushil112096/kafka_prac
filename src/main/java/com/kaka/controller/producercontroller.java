package com.kaka.controller;

import com.kaka.service.producer_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class producercontroller {

    @Autowired
    private producer_service producerService;
    @GetMapping("/get")
    public ResponseEntity<?> eexecutemessages()
    {
        for(int i=0;i<10000;i++)
        {
            producerService.updatelocation("updatelocation"+i);
        }
        return ResponseEntity.ok("updated all locations");
    }
}
