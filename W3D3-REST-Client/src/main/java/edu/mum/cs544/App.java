package edu.mum.cs544;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class App {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        //SpringApplication.run(App.class, args);
        String s = "Hello";
        Character c = s.charAt(2);
        StringBuilder sbd = new StringBuilder(s);
        sbd.setCharAt(2,Character.toUpperCase(c));

        char[] car = s.toCharArray();
        car[2] = Character.toUpperCase(car[2]);
        new String(car);



    }
}
