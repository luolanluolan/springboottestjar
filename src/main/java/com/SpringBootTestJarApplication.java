package com;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.sinosoft")//sinosoft
@EntityScan("com.sinosoft")
@SpringBootApplication
public class SpringBootTestJarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestJarApplication.class, args);
	}

}
