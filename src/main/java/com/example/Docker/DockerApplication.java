package com.example.Docker;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
		System.out.println("lucky is good");
		int a=5;
		//System.out.print(a);
		for(int i=0;i<5;i++) {
			System.out.print(a);	
		}
		
	}
	

}
