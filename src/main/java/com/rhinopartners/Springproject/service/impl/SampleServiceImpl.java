package com.rhinopartners.Springproject.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.rhinopartners.Springproject.dto.SampleDTO;
import com.rhinopartners.Springproject.entity.Sample;
import com.rhinopartners.Springproject.repository.SampleRepository;
import com.rhinopartners.Springproject.service.SampleService;

@Service
@Transactional
public class SampleServiceImpl implements SampleService {

    private final SampleRepository sampleRepository;
    private final ModelMapper mapper;

    public SampleServiceImpl(SampleRepository sampleRepository, ModelMapper mapper){
        this.sampleRepository=sampleRepository;
        this.mapper=mapper;
        // to initialize sampleRepository constant in the begining
    }

    @Override
    public void saveSample(SampleDTO sample) {
        if (sampleRepository.existsById(sample.getId())) {
            System.out.println("Failed to save. giver id already exists.");
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Sample already exists.");
        }
        sampleRepository.save(mapper.map(sample, Sample.class));
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
