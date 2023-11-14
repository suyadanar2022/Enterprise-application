package edu.mum.cs544;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.mum.cs544")
public class Config {


	@Bean
	IBookService bookService() {
		return new BookService();
	}
	
}