package aaa.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import aaa.model.Battery;

@Configuration
public class MyConfigSeason {

	@Bean
	Battery spring() {
		return new Battery("봄", 500);
	}
	
	@Bean
	Battery summer() {
		return new Battery("여름", 300);
	}
	@Bean
	Battery sutumn() {
		return new Battery("가을", 300);
	}
	@Bean
	Battery winter() {
		return new Battery("겨울", 300);
	}
	
	
}
