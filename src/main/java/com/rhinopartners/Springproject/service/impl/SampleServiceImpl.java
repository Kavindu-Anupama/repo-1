package com.rhinopartners.Springproject.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rhinopartners.Springproject.dto.SampleDTO;
import com.rhinopartners.Springproject.service.SampleService;

@Service
@Transactional
public class SampleServiceImpl implements SampleService {

    @Override
    public void saveSample(SampleDTO sample) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveSample'");
    }

    @Override
    public void updateSample(SampleDTO sample) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateSample'");
    }

    @Override
    public void deleteSample(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteSample'");
    }

    @Override
    public SampleDTO getSample(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSample'");
    }

    @Override
    public List<SampleDTO> findSample(String query) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findSample'");
    }
    
    
}
