package com.Sebastiao.springbootclothesseller;

import com.Sebastiao.springbootclothesseller.utils.ProblemDetails;
import com.Sebastiao.springbootclothesseller.utils.ValidationProblemDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

//@RestControllerAdvice
@SpringBootApplication
public class SpringBootClothesSellerApplication {
	/**
	 * **
	 * @Bean
	 * public PasswordEncoder passwordEncoder()
	 * {
	 *     return new BCryptPasswordEncoder();
	 * }
	 */

	public static void main(String[] args) {

		SpringApplication.run(SpringBootClothesSellerApplication.class, args);
	}

	@ExceptionHandler(ExpiredJwtException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> handleValitionException(ExpiredJwtException methodArgumentNotValidException) {
		var message = methodArgumentNotValidException.getMessage();
		return new ResponseEntity<>(message, HttpStatus.UNAUTHORIZED);
	}
}
