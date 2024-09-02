package geekbrains_course.java_core.seminar3.seminar_task;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 3000);
        Employee emp2 = new Employee("Alice", 3500);
        Manager manager1 = new Manager("Bob", 5000);

        Employee[] employees = {emp1, emp2, manager1};

        System.out.println("Before raise:");
        for (Employee emp : employees) {
            emp.displayInfo();
        }

        Manager.raiseSalary(employees, 500);

        System.out.println("\nAfter raise:");
        for (Employee emp : employees) {
            emp.displayInfo();
        }
        
        
        
        Employee emp = new Employee("Alice", 3500);

        int result = emp.compareDates(2023, 8, 25, 2022, 12, 31);

        if (result > 0) {
            System.out.println("Первая дата больше.");
        } else if (result < 0) {
            System.out.println("Вторая дата больше.");
        } else {
            System.out.println("Даты равны.");
        }
    }
}
