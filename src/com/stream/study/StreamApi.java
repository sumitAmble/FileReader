package com.stream.study;

import java.util.Arrays;
import java.util.List;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

		// using terminal operation with out using method references
		list.stream()
		.filter(StreamApi::Even)
		.filter(StreamApi::GT3)
		.map(StreamApi::multiply)
		.findFirst();
	}

	public static boolean GT3(int i) {
		return i > 3;
	}

	public static boolean Even(int i) {
		return i % 2 == 0;
	}
	
	public static int multiply(int i) {
		return i*2;
	}

}
