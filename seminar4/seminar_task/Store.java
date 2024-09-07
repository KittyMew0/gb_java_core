package geekbrains_course.java_core.seminar4.seminar_task;

public class Store {
    private static final Customer[] customers = {
        new Customer("Ivan", 20, "+1-222-333-44-55"),
        new Customer("Petr", 30, "+2-333-444-55-66"),
    };

    private static final Item[] items = {
        new Item("Ball", 100),
        new Item("Sandwich", 1000),
        new Item("Table", 10000),
        new Item("Car", 100000),
        new Item("Rocket", 1000000),
    };

    private static Order[] orders = new Order[5];

    public static void main(String[] args) {
        Object[][] info = {
            {customers[0], items[0], 1}, // good
            {customers[1], items[1], -1}, // bad amount -1
            {customers[0], items[2], 150}, // bad amount >100
            {customers[1], new Item("Flower", 10), 1}, // no item
            {new Customer("Fedor", 40, "+3-444-555-66-77"), items[3], 1}, // no customer
        };

        int capacity = 0;
        for (int i = 0; i < info.length && capacity < orders.length; i++) {
            try {
                orders[capacity] = buy((Customer) info[i][0], (Item) info[i][1], (int) info[i][2]);
                capacity++;
            } 
            catch (ProductException | AmountException e) {
                e.printStackTrace();
            } 
            catch (CustomerException e) {
                throw new RuntimeException(e);
            } 
            finally {
                System.out.println("Orders made: " + capacity);
            }
        }
    }

    private static boolean isInArray(Object[] arr, Object o) {
        for (Object obj : arr) {
            if (obj.equals(o)) { 
            	return true;
            }
        }
        return false;
    }

    public static Order buy(Customer who, Item what, int howMuch) {
        if (!isInArray(customers, who)) {
        	throw new CustomerException("Unknown customer: " + who);
        }
        if (!isInArray(items, what)) {
        	throw new ProductException("Unknown item: " + what);
        }
        if (howMuch < 0 || howMuch > 100) {
        	throw new AmountException("Incorrect amount: " + howMuch);
        }
        return new Order(who, what, howMuch);
    }
}
