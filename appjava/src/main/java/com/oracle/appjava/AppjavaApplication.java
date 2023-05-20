package com.oracle.appjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppjavaApplication.class, args);
	}

    @GetMapping("/javaday")
    public String javaday() {
      return String.format("Java Day Noroeste - Deploy em OKE");
    }

}
