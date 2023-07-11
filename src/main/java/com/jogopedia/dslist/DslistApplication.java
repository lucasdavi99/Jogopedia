package com.jogopedia.dslist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.jogopedi.dslist.entities")
public class DslistApplication {

	public static void main(String[] args) {
		SpringApplication.run(DslistApplication.class, args);
	}

}
