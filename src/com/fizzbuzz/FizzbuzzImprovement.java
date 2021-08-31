package com.fizzbuzz;

import java.util.stream.IntStream;

public class FizzbuzzImprovement {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100).mapToObj(i -> i % 3 == 0 ? "Fizz " : (i % 5 == 0 ? "Buzz " : i + " "))
				.forEach(System.out::print);
	}
}
