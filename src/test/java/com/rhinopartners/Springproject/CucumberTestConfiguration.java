package com.rhinopartners.Springproject;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ComponentScan("com.rhinopartners")
public class CucumberTestConfiguration {

    @Bean
    public TestRestTemplate restTemplate() {
        return new TestRestTemplate(); 
    }
    
}
