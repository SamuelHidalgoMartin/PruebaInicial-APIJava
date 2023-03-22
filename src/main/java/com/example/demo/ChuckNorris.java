package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ChuckNorris {

    public static void main(String[] args) {
      SpringApplication.run(ChuckNorris.class, args);
    }

    @GetMapping("/mensajeAleatorio")
    public String mensajeChukNorris() {
			RestTemplate rest = new RestTemplate();
			String url = "https://api.chucknorris.io/jokes/random";
			return rest.getForObject(url, String.class);
    }
		
}