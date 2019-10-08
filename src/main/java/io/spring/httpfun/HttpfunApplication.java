package io.spring.httpfun;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(org.springframework.cloud.stream.app.http.source.HttpSourceConfiguration.class)
public class HttpfunApplication {

	@Bean
	public Function<String, String> upper() {
		return value -> value.toUpperCase();
	}

	@Bean
	public Function<String, String> concat() {
		return value -> "Hello "+ value;
	}

	@Bean
	public Function<String, String> suffix() {
		return value -> value + " fini";
	}

	public static void main(String[] args) {
		SpringApplication.run(HttpfunApplication.class, args);
	}

}
