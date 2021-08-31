
package com.fizzbuzz;

public class Fizzbuzz {

	public String fizzBuzzGenerator(int value) {
		if (value % 3 == 0) {
			return "Fizz";
		} else if (value % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(value);
		}
	}

	public static void main(String[] args) {
		Fizzbuzz fizzbuzz = new Fizzbuzz();
		for (int i = 1; i <= 100; i++) {
			System.out.println(fizzbuzz.fizzBuzzGenerator(i));
		}
	}
}
