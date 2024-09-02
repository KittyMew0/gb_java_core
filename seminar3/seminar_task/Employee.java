package geekbrains_course.java_core.seminar3.seminar_task;

public class Employee {
	protected String name;
	protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
	}
    
    public int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {

        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day2;
        
        return date1 - date2;
    }
    
}
