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

    @PostMapping
    public String create() {
        return "create working";
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
