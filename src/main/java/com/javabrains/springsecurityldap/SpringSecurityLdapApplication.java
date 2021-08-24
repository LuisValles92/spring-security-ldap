package com.javabrains.springsecurityldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityLdapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityLdapApplication.class, args);
	}

	/*
	localhost:8080/login
		Username -> uid
		Password -> userPassword
	 */

}
