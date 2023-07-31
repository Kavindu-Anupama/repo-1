package com.rhinopartners.Springproject.api;

import static org.mockito.ArgumentMatchers.any;

import javax.ws.rs.core.MediaType;

import org.assertj.core.api.Condition.Status;
import org.junit.jupiter.api.Test;
import org.postgresql.core.ResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.http.client.MockClientHttpRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rhinopartners.Springproject.dto.SampleDTO;
import com.rhinopartners.Springproject.entity.Sample;
import com.rhinopartners.Springproject.service.SampleService;

import jakarta.servlet.ServletContext;

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

        // //given - precondition
        SampleDTO sampleDTO = SampleDTO.builder()
                .id(5)
                .reference("myTest")
                .amount(10)
                .createAs("aTest")
                .feedback("test went good")
                .build();

        mockMvc.perform(post("/"))
                .andExpect(status().isOk())
                .andExpect(model().attributeHasErrors("sampleDTO"));

        // RequestBuilder requestBuilder = MockMvcRequestBuilders
        // .post("/").contentType(MediaType.APPLICATION_JSON)
        // .content(objectMapper.writeValueAsString(sampleDTO));
        // Builds a MockHttpServletRequest.

        // when - action
        // ResultActions resultActions = mockMvc.perform(requestBuilder);
        // Allows applying actions, such as expectations, on the result of an executed
        // request.

        // then - varification
        // resultActions.andExpect();

    }

    @Test
    void givenSampleId_whenDeleteSample_thenReturn204() throws Exception {

        // given - preconditions
        int sampleId = 5;
        given(sampleService).deleteSample(sampleId);
    }

    @Test
    void testRead() {

    }

    @Test
    void testUpdate() {

    }
}
