package com.rhinopartners.Springproject.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/app")
public class HttpControllerReq {

    @GetMapping("/getAllSamples")
    public String getAllSamples(){
        return "get all sample working";
    }

    @PostMapping
    public String addSample() {
        return "save working";
        
    }

    @GetMapping
    public String read() {
        return "read working";
    }

    @PatchMapping
    public String update() {
        return "update working";
    }

    @DeleteMapping
    public String delete() {
        return "delete working";
    }
}
