package geekbrains_course.java_core.seminar2.lecture_task;

import java.util.Scanner;

public class reversearray {
	public static int[] ReverseNumbersinArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array[i] = 1;
			}
			else {
				array[i] = 0;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an array length");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		System.out.println("enter array numbers 0 or 1");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			if (array[i] != 0 && array[i] != 1) {
				System.out.println("sorry, you surely have to enter only 0 or 1");
				array[i] = sc.nextInt();
			}
		}
		
		System.out.println("original array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
		int[] newarray = new int[n];
		newarray = ReverseNumbersinArray(array);
		
		System.out.println("reversed array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(newarray[i] + " ");
		}
	}
}
