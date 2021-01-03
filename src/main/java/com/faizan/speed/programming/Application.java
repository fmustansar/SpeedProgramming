package com.faizan.speed.programming;

import com.faizan.speed.programming.fizzbuzz.FizzBuzz;
import com.faizan.speed.programming.implementstack.StackImplementedByFaizan;
import com.faizan.speed.programming.reversestring.ReverseString;
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

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		FizzBuzz.execute();

		/*******************************
		 * LeetCode TwoSum Problem
		 * Approach: BruteForce O(n2)
		 * Complexity: EASY
		 *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int [] theArray= new int [] {2, 3, 7, 4, 8};
		int target =7;


		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

		int[] result = TwoSum.executeBruteForce(target, theArray);
		System.out.println("The calculated answer of TwoSum problem through bruteforce approach is => {"
				+ result[0] + "," + result[1] + "}");


		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		result = TwoSum.executeTheOptimizedHashMapApproach(target, theArray);
		System.out.println("The calculated answer of TwoSum problem through Optimized approach using HashMap is => {"
				+ result[0] + "," + result[1] + "}");


		/*******************************
		 * String Reverse Problem
		 * Approach: StringBuilder
		 * Complexity: VERY EASY
		 *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("String Reverse Problem using Approach: StringBuilder -> " +
				ReverseString.executeUsingStringBuilderReverse("HELLO WORLD"));

		/*******************************
		 * String Reverse Problem
		 * Approach: Manual
		 * Complexity: EASY
		 *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

		System.out.println("String Reverse Problem using Approach: Manual -> " +
				ReverseString.executeUsingManualApproach("HELLO WORLD"));


		/*********************************************************************
		 * String Reverse Problem
		 * Approach: Manual + String Builder class to make just one instance
		 * Complexity: EASY
		 *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("String Reverse Problem using Approach: Manual + String Builder class to make just" +
				" one instance -> " + ReverseString.executeUsingStringAndStringBuilderWithoutReverse("HELLO WORLD"));


		/*********************************************************************
		 * Implementing Stack Problem
		 * Approach: array
		 * Complexity: Easy to Medium
		 *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/
		testStack();
	}


	private void testStack() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		StackImplementedByFaizan stack= new StackImplementedByFaizan(5);
		System.out.println("----------------");
		System.out.println(" STACK OUTPUTS ");
		System.out.println("----------------");
		System.out.println("TEST IS EMPTY - Should be TRUE -> "+ stack.isStackEmpty());
		System.out.println("TEST IS Full - Should be FALSE -> "+ stack.isStackFull());
		//int emptyInteger = stack.pop(); Throws runtime exception Tested OK
		//int emptyInteger = stack.peek(); Throws runtime exception Tested OK
		stack.push(1);
		System.out.println("One Element is inserted so now the following will be");
		System.out.println("TEST IS EMPTY - Should be FALSE -> "+ stack.isStackEmpty());
		System.out.println("TEST IS Full - Should be FALSE -> "+ stack.isStackFull());
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("All 5 Elements are inserted so now the following will be");
		System.out.println("TEST IS EMPTY - Should be FALSE -> "+ stack.isStackEmpty());
		System.out.println("TEST IS Full - Should be True -> "+ stack.isStackFull());
		//stack.push(6); Throws runtime exception Tested OK
	}
}


