package com.codeaches.oauth2.jwt.carinventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class JwtCarInventoryServiceApplication {

    public static void main(String[] args) {
	SpringApplication.run(JwtCarInventoryServiceApplication.class, args);
    }
}
