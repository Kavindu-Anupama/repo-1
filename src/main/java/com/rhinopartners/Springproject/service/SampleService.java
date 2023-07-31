package com.rhinopartners.Springproject.service;

import com.rhinopartners.Springproject.dto.SampleDTO;

import jakarta.servlet.ServletContext;

public interface SampleService {
    void saveSample(SampleDTO sample);
    void updateSample(SampleDTO sample);
    void deleteSample(int id);
    SampleDTO getSample(int id);  
}

//this interface created to achieve loosely coupelling for the services. 