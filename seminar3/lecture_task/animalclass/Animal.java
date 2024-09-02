package geekbrains_course.java_core.seminar3.lecture_task.animalclass;
import java.lang.Math;
import java.util.Scanner;

public class Animal {
	String name;
	String color;
	int age;
	int distance, max_distance;
	
	Scanner sc = new Scanner(System.in);
	
	void run() {
		max_distance = 100 + (int)(Math.random() * 25);
		System.out.println("enter distance to run ");
		distance = sc.nextInt();
		if (distance < max_distance) {
			System.out.println(name + " runs " + distance + " meters");
		}
		else {
			System.out.println(name + " can't run that long");
		}
	}
	
	void swim() {
		max_distance = 100 + (int)(Math.random() * 25);
		System.out.println("enter distance to swim ");
		distance = sc.nextInt();
		if (distance < max_distance) {
			System.out.println(name + " swims " + distance + " meters");
		}
		else {
			System.out.println(name + " can't swim that long");
		}
	}
	
	void jump() {
		max_distance = 100 + (int)(Math.random() * 25);
		System.out.println("enter distance to jump ");
		distance = sc.nextInt();
		if (distance < max_distance) {
			System.out.println(name + " jumps " + distance + " meters");
		}
		else {
			System.out.println(name + " can't jump that long");
		}
	}
}
