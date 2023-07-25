package com.rhinopartners.Springproject.dao;

import java.util.List;

import com.rhinopartners.Springproject.dto.SampleDTO;

public interface SampleDAO {
    void saveSample(SampleDTO sample);
    void updateSample(SampleDTO sample);
    void deleteSample(int id);
    SampleDTO getSample(int id);
    List<SampleDTO> findSample(String query);    
}
