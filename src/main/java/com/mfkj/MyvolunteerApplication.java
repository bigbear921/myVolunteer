package com.mfkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MyvolunteerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyvolunteerApplication.class, args);
	}

}
