public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name = "Mocha";
        item1.price = 2.0;

        item2.name = "Latte";
        item2.price = 3.0;

        item3.name = "Coffee";
        item3.price = 3.5;

        item4.name = "Cappuchino";
        item4.price = 4;

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Rami";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        order2.items.add(item1.name);
        order2.total += item1.price;

        order3.items.add(item4.name);
        order3.total += item4.price;

        order4.items.add(item2.name);
        order4.total += item2.price;

        order1.ready = true;

        order4.items.add(item2.name);
        order4.items.add(item2.name);
        order4.total += item2.price * 2;

        order2.ready = true;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        for (Object item : order4.items) {
            System.out.printf("Order: %s\n", item);
        }
        System.out.println("-------------------------------------------------------------");

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        for (Object item : order3.items) {
            System.out.printf("Order: %s\n", item);
        }
    }
}
