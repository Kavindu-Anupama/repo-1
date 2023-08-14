package com.rhinopartners.Springproject.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.annotation.Configuration;

import com.rhinopartners.Springproject.entity.Sample;


@Configuration
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SampleRepositoryTest {

    @Autowired
	private SampleRepository sampleRepository;

	@Test
	public void saveSampleTest() {
		Sample sample = Sample.builder()
			.id(5)
			.reference("test")
			.amount(4)
			.createAs("test_passing")
			.feedback("good")
			.build();

		sampleRepository.save(sample);

		Assertions.assertThat(sample.getId()).isEqualTo(5);
	}

	@Test
	public void getSampleTest() {
		Sample sample = sampleRepository.findById(5).get();
		Assertions.assertThat(sample.getId()).isEqualTo(5);
	}
}
