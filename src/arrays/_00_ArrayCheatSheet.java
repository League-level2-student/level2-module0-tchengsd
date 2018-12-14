package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] words = new String[5];
		for (int i = 0; i < words.length; i++) {
			words[i] = "word" + i;
		}
		// 2. print the third element in the array
		System.out.println(words[2]);
		// 3. set the third element to a different value
		words[2] = "this";
		// 4. print the third element again
		System.out.println(words[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		// 6. make an array of 50 integers
		int[] values = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < values.length; i++) {
			int rng = rand.nextInt(1000);
			values[i] = rng;
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallest = 999;
		for (int number : values) {
			if (number < smallest) {
				smallest = number;
			}
		}
		System.out.println(smallest);
		// 9 print the entire array to see if step 8 was correct
		for (int number : values) {
			System.out.println(number);
		}
		// 10. print the largest number in the array.
		int largest = 0;
		for (int number : values) {
			if (number > largest) {
				largest = number;
			}
		}
		System.out.println(largest);
	}
}
