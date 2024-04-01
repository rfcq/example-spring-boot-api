package com.rfcq.infoshow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.rfcq.infoshow")
@EntityScan("com.rfcq.infoshow")
@EnableJpaRepositories("com.rfcq.infoshow")
public class InfoshowApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfoshowApplication.class, args);
	}

}
