package com.rhinopartners.Springproject.service;

import java.util.List;

import com.rhinopartners.Springproject.dto.SampleDTO;

public interface SampleService {
    void saveSample(SampleDTO sample);
    void updateSample(SampleDTO sample);
    void deleteSample(int id);
    SampleDTO getSample(int id);
    List<SampleDTO> findSample(String query);    
}

//this interface created to achieve loosely coupelling for the services. 