package geekbrains_course.java_core.seminar2.seminar_task;

import java.util.Scanner;

public class arraymethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		
		int length = sc.nextInt();
			
		if (length < 0) {
			do {
				System.out.println("Sorry, array can't be empty");
				length = sc.nextInt();
			} while (length < 0);
		}
		
		int[] array = new int[length];
		
		System.out.println("enter array");
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		
		int evenCounter = evenNumbersCounter(array, length);
		System.out.println(evenCounter);
		int difference = difference(array, length);
		System.out.println(difference);
		boolean zeron = twoNeighboorZero(array, length);
		System.out.println(zeron);
	}
	
	public static int evenNumbersCounter(int[] array, int length) {
		System.out.println("counting even numbers");
		int counter = 0;
		for (int i = 0; i < length; i++) {
			if (array[i] / 2 == 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public static int difference(int[] array, int length) {
		System.out.println("counting difference between min and max value");
		int minvalue = array[0], maxvalue = array[0];
		for (int i = 0; i < length; i++) {
			if (array[i] < minvalue) {
				minvalue = array[i];
			}
			if (array[i] > maxvalue) {
				maxvalue = array[i];
			}
		}
		return maxvalue - minvalue;
	}
	
	public static boolean twoNeighboorZero(int[] array, int length) {
		System.out.println("searching for two neighboor zero values");
		for (int i = 0; i < length; i++) {
			if (array[i] == 0 && array[i + 1] == 0) {
				return true;
			}
		}
		return false;
	}
}
