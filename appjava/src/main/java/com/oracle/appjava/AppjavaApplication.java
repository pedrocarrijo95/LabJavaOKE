package com.oracle.appjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppjavaApplication.class, args);
	}

    @GetMapping("/javaday")
    public String javaday() {
      return String.format("Java Day Noroeste - Deploy em OKE");
    }

}
