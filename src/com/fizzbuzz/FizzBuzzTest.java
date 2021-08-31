package com.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testThree() {
		Fizzbuzz fizzBuzz = new Fizzbuzz();
		Assert.assertTrue(fizzBuzz.fizzBuzzGenerator(3).equalsIgnoreCase("Fizz"));
	}

	@Test
	public void testFive() {
		Fizzbuzz fizzBuzz = new Fizzbuzz();
		Assert.assertTrue(fizzBuzz.fizzBuzzGenerator(5).equalsIgnoreCase("Buzz"));
	}

	@Test
	public void testRandomNumber() {
		Fizzbuzz fizzBuzz = new Fizzbuzz();
		Assert.assertTrue(fizzBuzz.fizzBuzzGenerator(1).equalsIgnoreCase("1"));
		Assert.assertTrue(fizzBuzz.fizzBuzzGenerator(4).equalsIgnoreCase("4"));
		Assert.assertTrue(fizzBuzz.fizzBuzzGenerator(8).equalsIgnoreCase("8"));
		Assert.assertTrue(fizzBuzz.fizzBuzzGenerator(11).equalsIgnoreCase("11"));
		Assert.assertTrue(fizzBuzz.fizzBuzzGenerator(91).equalsIgnoreCase("91"));

	}

	@Test
	public void testHighValue() {
		Fizzbuzz fizzBuzz = new Fizzbuzz();
		Assert.assertTrue(fizzBuzz.fizzBuzzGenerator(101).equalsIgnoreCase("101"));
	}
}
