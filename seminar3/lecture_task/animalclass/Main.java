package geekbrains_course.java_core.seminar3.lecture_task.animalclass;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "White", 4);
        
        cat1.run();
        cat1.jump();
        cat1.swim();  
        
        Dog dog1 = new Dog("Bobik", "brown", 7);
        
        dog1.run();
        dog1.jump();
        dog1.swim();  
        
        Bird bird1 = new Bird("Parrot", "green", 1);
        
        bird1.run();
        bird1.jump();
        bird1.swim();  
    }
}
