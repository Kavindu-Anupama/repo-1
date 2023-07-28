package com.rhinopartners.Springproject.api;

import static org.mockito.ArgumentMatchers.any;

import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rhinopartners.Springproject.dto.SampleDTO;
import com.rhinopartners.Springproject.entity.Sample;
import com.rhinopartners.Springproject.service.SampleService;


@WebMvcTest(HttpControllerReq.class)
public class HttpControllerReqTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SampleService sampleService;

    @MockBean
    private ObjectMapper objectMapper;

    @Test
    void givenSampleObject_whenCreateSample_thenReturnSavedSample() throws Exception {
        
        Sample sample = Sample.builder()
                                .id(5)
                                .reference("myTest")
                                .amount(10)
                                .createAs("aTest")
                                .feedback("test went good")
                                .build();
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
    }

    @Test
    void testDelete() {

    }

    @Test
    void testRead() {

    }

    @Test
    void testUpdate() {

    }
}
