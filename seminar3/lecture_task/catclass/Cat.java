package geekbrains_course.java_core.seminar3.lecture_task.catclass;

public class Cat {
	private static int counter = 0;
	private int id;
	
	String name; 
	String color; 
	int age;
	
	public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.id = ++counter; 
    }
	
	public int getId() {
        return id;
    }
	
	void voice() { 
		System.out.println(name + " meows"); 
	} 
	
	void jump() { 
		if (this.age < 5) 
			System.out.println(name + " jumps"); 
	}
}
