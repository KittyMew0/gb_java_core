package geekbrains_course.java_core.seminar3.lecture_task.animalclass;

public class Bird extends Animal {
	public Bird(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	@Override
	void jump() {
		max_distance = 100 + (int)(Math.random() * 25);
		System.out.println("enter distance to fly ");
		distance = sc.nextInt();
		if (distance < max_distance) {
			System.out.println(name + " flies " + distance + " meters");
		}
		else {
			System.out.println(name + " can't fly that long");
		}
	}
}
