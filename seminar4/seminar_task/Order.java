package geekbrains_course.java_core.seminar4.seminar_task;

public class Order {
    private Customer customer;
    private Item item;
    private int quantity;

    public Order(Customer customer, Item item, int quantity) {
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
    }

}
