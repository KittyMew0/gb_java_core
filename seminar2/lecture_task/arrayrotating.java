package geekbrains_course.java_core.seminar2.lecture_task;

import java.util.Scanner;

public class arrayrotating {
    public static int[] rotateArray(int[] array, int nrotate) {
        int[] newarray = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + nrotate) % array.length;
            newarray[newIndex] = array[i];
        }
        
        return newarray;
    }
	
	public static void main(String[] args) {
		int length;
		int nrotate;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		length = sc.nextInt();
		
		System.out.println("enter a number that array should use to rotate");
		nrotate = sc.nextInt();
		
		int[] array = new int[length];
		
		System.out.println("enter array");
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("original array: ");
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
		
		int[] newarray = new int[length];
		newarray = rotateArray(array, nrotate);
		
		System.out.println("rotated array: ");
		for (int i = 0; i < length; i++) {
			System.out.print(newarray[i] + " ");
		}
	}
}
