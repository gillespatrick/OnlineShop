package com.back.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.onlineshopcommon.entity","com.back.admin.user" })
public class OnlineShopBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopBackApplication.class, args);
	}

}
