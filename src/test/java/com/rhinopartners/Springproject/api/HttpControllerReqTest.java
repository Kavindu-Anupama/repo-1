package com.rhinopartners.Springproject.api;

import static org.mockito.ArgumentMatchers.any;

import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rhinopartners.Springproject.dto.SampleDTO;
import com.rhinopartners.Springproject.service.SampleService;
import static org.mockito.BDDMockito.*;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(HttpControllerReq.class)
public class HttpControllerReqTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SampleService sampleService;

    @MockBean
    private ObjectMapper objectMapper;

    @Test
    void givenSampleObject_whenCreateSample_thenReturn201() throws Exception {

        // given - precondition
        SampleDTO sampleDTO = SampleDTO.builder()
                .id(5)
                .reference("myTest")
                .amount(10)
                .createAs("aTest")
                .feedback("test went good")
                .build();
        given(sampleService.saveSample(any(SampleDTO.class)))
                .willAnswer((invocation) -> invocation.getArgument(0));

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/").contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(sampleDTO));
        // Builds a MockHttpServletRequest.

        // when - action
        ResultActions resultActions = mockMvc.perform(requestBuilder);
        // Allows applying actions, such as expectations, on the result of an executed
        // request.

        // then - varification
        resultActions.andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    void givenSampleId_whenDeleteSample_thenReturn204() throws Exception {

    }

    @Test
    void testRead() {

    }

    @Test
    void testUpdate() {

    }
}
