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

		/*******************************
		 * LeetCode TwoSum Problem
		 * Approach: BruteForce O(n2)
		 * Complexity: EASY
		 *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/
		int [] theArray= new int [] {2, 3, 7, 4, 8};
		int target =7;

		TwoSum tumSum = new TwoSum();
		int[] result = tumSum.executeBruteForce(target, theArray);
		System.out.println("The calculated answer of TwoSum problem through bruteforce approach is => {"
				+ result[0] + "," + result[1] + "}");


		result = tumSum.executeTheOptimizedHashMapApproach(target, theArray);
		System.out.println("The calculated answer of TwoSum problem through Optimized approach using HashMap is => {"
				+ result[0] + "," + result[1] + "}");

	}
}


