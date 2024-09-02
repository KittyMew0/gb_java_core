package geekbrains_course.java_core.seminar3.seminar_task;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public static void raiseSalary(Employee[] employees, double increase) {
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                emp.setSalary(emp.getSalary() + increase);
            }
        }
    }
}
