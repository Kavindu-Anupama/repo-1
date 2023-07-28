package com.rhinopartners.Springproject.service.impl;

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
    private final ModelMapper modelMapper;

    public SampleServiceImpl(SampleRepository sampleRepository, ModelMapper modelMapper){
        this.sampleRepository=sampleRepository;
        this.modelMapper=modelMapper;
        // to initialize sampleRepository constant in the begining
    }

    @Override
    public void saveSample(SampleDTO sample) {
        if (sampleRepository.existsById(sample.getId())) {
            System.out.println("Failed to save. given id already exists.");
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Can not Save. Sample already exists.");
        }
        sampleRepository.save(modelMapper.map(sample, Sample.class));
    }

    @Override
    public void updateSample(SampleDTO sample) {
        if (!sampleRepository.existsById(sample.getId())) {
            System.out.println("Failed to update. given id does not exist.");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sample can not be found.");
        }
        sampleRepository.save(modelMapper.map(sample, Sample.class));
    }

    @Override
    public void deleteSample(int id) {
        if (!sampleRepository.existsById(id)) {
            System.out.println("can not delete. sample id does not exist.");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Can not delete. Sample id does not exist.");
        }
        sampleRepository.deleteById(id);
    }

    @Override
    public SampleDTO getSample(int id) {
        if (!sampleRepository.existsById(id)){
            System.out.println("can not fetch. sample id does not exist.");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Can not find the Sample. Given id does not exist.");
        }
        
        // get by using jpa
        // Optional<Sample> sampleEntity = sampleRepository.findById(id);
        // System.out.println("retrieving some data from database entity object : " + sampleEntity.get().getReference());

        // SampleDTO sampleDTO = modelMapper.map(sampleEntity.get().getClass() , SampleDTO.class);

        return sampleRepository.findById(id)
        .map(sampleEntity -> modelMapper.map(sampleEntity, SampleDTO.class)).orElseThrow(); 
    }
}     