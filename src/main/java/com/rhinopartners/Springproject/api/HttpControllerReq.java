package com.rhinopartners.Springproject.api;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rhinopartners.Springproject.dto.SampleDTO;
import com.rhinopartners.Springproject.service.SampleService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/app")
public class HttpControllerReq {

    private final SampleService sampleService;

    public HttpControllerReq(SampleService sampleService) {
        this.sampleService=sampleService;
    }

    @ResponseStatus(HttpStatus.CREATED)  //201
    @PostMapping(consumes = "application/json")
    public void addSample(@RequestBody @Validated SampleDTO sampleDTO) {
        sampleService.saveSample(sampleDTO);
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/{id}")
    public SampleDTO read(@PathVariable int id) {
        return sampleService.getSample(id);
    }

    @PatchMapping
    public String update() {
        return "update working";
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        sampleService.deleteSample(id);
    }
}
