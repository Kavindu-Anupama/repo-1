package com.rhinopartners.Springproject.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.PreparedStatement;
import java.util.List;

import com.rhinopartners.Springproject.dao.SampleDAO;
import com.rhinopartners.Springproject.entity.Sample;

public class SampleDAOImpl implements SampleDAO {

    @Override
    public String create(Sample sample) {
        
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydatabase", "postgres", "psql");
            PreparedStatement stm = 
                connection.prepareStatement("INSERT INTO sample_one (id, reference, amount, create_as, feedback) VALUES (?, ?, ?, ?, ?)");
            stm.setInt(1, sample.getId());
            stm.setString(2, sample.getReference());
            stm.setInt(3, sample.getAmount());
            stm.setString(4, sample.getCreateAs());
            stm.setString(5, sample.getFeedback());

        } catch (SQLException e) {
            System.out.println("Can not connect to the database");
            e.printStackTrace();
        }
        
        
        return "saved sample";
    }

    @Override
    public List<Sample> read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public String update(Sample sample) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public String delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
