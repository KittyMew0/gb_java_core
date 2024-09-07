package geekbrains_course.java_core.seminar4.seminar_task;

public class Item {
    protected String name;
    protected int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item {name = '" + name + "', price = '" + price + "'}";
    }

}
