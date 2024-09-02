package geekbrains_course.java_core.seminar3.lecture_task.animalclass;

public class Cat extends Animal {
	public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    void swim() {
        System.out.println(name + " doesn't like to swim");
    }
}
