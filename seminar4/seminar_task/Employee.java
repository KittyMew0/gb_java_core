package geekbrains_course.java_core.seminar4.seminar_task;

public class Employee {
	enum Genders{MALE, FEMALE};
	Genders gender;
	
	protected String name;
	protected int salary;
	//protected Genders gender;
	
	public Employee(String name, int salary, Genders gender) {
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}
	
	public Genders getGender() {
		return gender;
	}
	
	public void setGender(Genders gender) {
		this.gender = gender;
	}

}
