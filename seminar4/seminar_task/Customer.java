package geekbrains_course.java_core.seminar4.seminar_task;

public class Customer {
    protected String name;
    protected int age;
    protected String phoneNumber;

    public Customer(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public String getPhoneNumber() {
    	return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) { 
    	this.phoneNumber = phoneNumber;
    }

}
