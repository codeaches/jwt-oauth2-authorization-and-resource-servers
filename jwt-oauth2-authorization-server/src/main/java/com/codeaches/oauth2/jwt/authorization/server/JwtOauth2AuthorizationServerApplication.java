package com.codeaches.oauth2.jwt.authorization.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
public class JwtOauth2AuthorizationServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(JwtOauth2AuthorizationServerApplication.class, args);
  }
}
