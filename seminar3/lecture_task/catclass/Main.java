package geekbrains_course.java_core.seminar3.lecture_task.catclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat0; // cat0 = null; 
		cat0 = new Cat(); 
		
		Cat cat1 = new Cat(); 
		Cat cat2 = new Cat();
		
		cat1.name = "Barsik"; 
		cat1.color = "White"; 
		cat1.age = 4; 
		cat2.name = "Murzik"; 
		cat2.color = "Black"; 
		cat2.age = 6; 
		
		System.out.println("Cat1 named: " + cat1.name + " is " + cat1.color + " has age: " + cat1.age); 
		System.out.println("Cat2 named: " + cat2.name + " is " + cat2.color + " has age: " + cat2.age);
	}

}
