package com.rhinopartners.Springproject.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.rhinopartners.Springproject.dao.SampleDAO;
import com.rhinopartners.Springproject.entity.Sample;

public class SampleDAOImpl {

    @Autowired
    private SampleDAO sampleDAO;

    public void getAllSamples(){

    }

    public void getSampleById(){

    }

    public Sample addSample(Sample newSample){

        if (newSample != null) {
            Sample sampleObject = sampleDAO.save(newSample);
            return sampleObject;
        } else return null;

    }

    public void updateSampleById(){
        
        sampleDAO.findBy
    }

    public void deleteSampleById(){

    }


    // @Override
    // public String create(Sample sample) {
        
    //     try {

    //         Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydatabase", "postgres", "psql");
    //         PreparedStatement stm = 
    //             connection.prepareStatement("INSERT INTO sample_one (id, reference, amount, create_as, feedback) VALUES (?, ?, ?, ?, ?)");
    //         stm.setInt(1, sample.getId());
    //         stm.setString(2, sample.getReference());
    //         stm.setInt(3, sample.getAmount());
    //         stm.setString(4, sample.getCreateAs());
    //         stm.setString(5, sample.getFeedback());
    //         int affectedRows = stm.executeUpdate();

    //         //todo: generate a http response for successful event

    //         return "saved sample" + affectedRows;

    //     } catch (SQLException e) {

    //         System.out.println("Can not connect to the database" + e.toString());

    //         //todo: generate a http response for failed event

    //         return "failed to save sample";
    //     }
        
    // }

    // @Override
    // public List<Sample> read() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'read'");
    // }

    // @Override
    // public String update(Sample sample) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'update'");
    // }

    // @Override
    // public String delete(int id) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'delete'");
    // }
    
}
