package com.mfkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@MapperScan("com.mfkj.mapper")
public class MyvolunteerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyvolunteerApplication.class, args);
	}

}
