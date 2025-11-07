package com.manoj.springplayground.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/api/v1/health")
    public ResponseEntity<String> healthV1() {
        return new ResponseEntity<>("I'm Good", HttpStatus.OK);
    }

    @GetMapping("/api/v2/health")
    public ResponseEntity<String> healthV2() {
        return new ResponseEntity<>("I'm Good - v2", HttpStatus.OK);
    }
}