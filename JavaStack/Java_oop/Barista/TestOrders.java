public class TestOrders {
    public static void main(String[] args) {

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Abdallah");
        Order order4 = new Order("Baha");
        Order order5 = new Order("Yazan");
        
        Item item1 = new Item("drip coffee", 1.5);
        Item item2 = new Item("latte", 2.5);
        Item item3 = new Item("cappuccino", 3.5);
        
        order1.addItem(item3);
        order1.addItem(item2);

        order2.addItem(item1);
        order2.addItem(item3);

        order3.addItem(item1);
        order3.addItem(item2);
        order3.setReady(true);

        order4.addItem(item3);
        order4.addItem(item1);

        order5.addItem(item3);
        order5.addItem(item3);

        System.out.println(order1.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        System.out.println("--------------------------------------------");
        order1.display();
        System.out.println("--------------------------------------------");
        order2.getOrderTotal();
        order2.display();
        System.out.println("--------------------------------------------");
        order3.getOrderTotal();
        order3.display();
        System.out.println("--------------------------------------------");
        order4.getOrderTotal();
        order4.display();
        System.out.println("--------------------------------------------");
        order5.getOrderTotal();
        order5.display();
    }
}
