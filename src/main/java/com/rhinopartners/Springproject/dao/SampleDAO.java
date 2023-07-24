package com.rhinopartners.Springproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhinopartners.Springproject.entity.Sample;

@Repository
public interface SampleDAO extends JpaRepository<Sample, Integer> {
    
}
