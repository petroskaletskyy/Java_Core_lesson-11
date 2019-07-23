/*
 * LOGOS IT ACADEMY
 * */
package ua.lviv.lgs.task001;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		System.out.println("Enter size of array:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		Integer[] arr = new Integer[n];

		for (int i = 0; i < n; i++) {
			arr[i] = getRandomValueFromRange(1, 100);
		}

		System.out.println("Value of array before sort");
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println("Sort by asc");
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println("Sort by desc");
		System.out.println(Arrays.toString(arr));
	}

	//Generate random value from range
	/**
	 * @param int min;
	 * @param int max;
	 * @return int;
	 * */
	public static int getRandomValueFromRange(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("min values must be smaller than max value");
		}

		Random random = new Random();
		return random.nextInt((max - min + 1) + min);
	}

}
