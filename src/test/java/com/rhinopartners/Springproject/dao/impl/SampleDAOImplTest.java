package com.rhinopartners.Springproject.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import jakarta.activation.DataSource;

@RunWith(MockitoJUnitRunner.class)
public class SampleDAOImplTest {

    @Mock
    private DataSource dataSource;
    @Mock
    private Connection con;
    @Mock
    private PreparedStatement stm;
    @Mock
    private int affectedRows;

    private TestObject TestObject;



    @Test
    void testCreate() {
        
    }
}
