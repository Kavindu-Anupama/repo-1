package com.rhinopartners.Springproject.dao;

import java.util.List;

import com.rhinopartners.Springproject.entity.Sample;

public interface SampleDAO {
    
    String create(Sample sample);
    List<Sample> read();
    String update(Sample sample);
    String delete(int id);
        

}
