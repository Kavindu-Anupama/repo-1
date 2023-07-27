package com.rhinopartners.Springproject.api;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhinopartners.Springproject.entity.Sample;

@RestController
@CrossOrigin
@RequestMapping("api/v1/app")
public class HttpControllerReq {

    @GetMapping("/getAllSamples")
    public ResponseEntity<List<Sample>> getAllSamples(){
        try {
            List<Sample> sampleList = new ArrayList<>();
            
        }
    }

    @PostMapping
    public ResponseEntity<<Sample>> addSample() {
        
        
    }

    @GetMapping
    public String read() {
        return "read working";
    }

<<<<<<< Updated upstream
    @PatchMapping
    public String update() {
        return "update working";
=======
    @ResponseStatus(HttpStatus.CREATED)
    @PatchMapping(value = "/{id}", consumes = "application/json")
    public void update(@PathVariable int id, @RequestBody @Validated SampleDTO sampleDTO) {
        sampleDTO.setId(id);
        sampleService.updateSample(sampleDTO);
>>>>>>> Stashed changes
    }

    @DeleteMapping
    public String delete() {
        return "delete working";
    }
}
