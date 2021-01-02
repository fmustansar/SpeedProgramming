package com.faizan.speed.programming;

import com.faizan.speed.programming.fizzbuzz.FizzBuzz;
import com.faizan.speed.programming.twosum.TwoSum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public void executionFunction () {
		/*******************************
		 * HackerRank FizzBuzz Problem
		 * Complexity: VERY EASY
		 *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/

		FizzBuzz fb = new FizzBuzz();
		fb.execute();

	}
}


