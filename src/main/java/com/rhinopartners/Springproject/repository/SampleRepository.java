package com.rhinopartners.Springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhinopartners.Springproject.entity.Sample;

public interface SampleRepository extends JpaRepository<Sample, Integer> {
    
}
