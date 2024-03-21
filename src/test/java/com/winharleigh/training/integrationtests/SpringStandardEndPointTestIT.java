package com.winharleigh.training.integrationtests;

import com.firstutility.springboot.test.ping.SpringBootServicesTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource(locations = "classpath:application-test.properties")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringStandardEndPointTestIT extends SpringBootServicesTest {
}
