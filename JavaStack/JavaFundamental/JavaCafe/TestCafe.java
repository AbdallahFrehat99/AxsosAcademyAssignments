import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {

    /*
      You will need add 1 line to this file to create an instance
      of the CafeUtil class.
      Hint: it will need to correspond with the variable name used below..
    */

//    Arrays ArrayList = new Arrays();
        /* ============ App Test Cases ============= */

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", CafeUtil.getStreakGoal());

         System.out.println("----- Order Total Test-----");
         double[] lineItems = {3.5, 1.5, 4.0, 4.5};
         System.out.printf("Order total: %s \n\n",CafeUtil.getOrderTotal(lineItems));

         System.out.println("----- Display Menu Test-----");

         ArrayList<String> menu = new ArrayList<String>();
         menu.add("drip coffee");
         menu.add("cappuccino");
         menu.add("latte");
         menu.add("mocha");
        CafeUtil.displayMenu(menu);

         System.out.println("\n----- Add Customer Test-----");
         ArrayList<String> customers = new ArrayList<String>();
         // --- Test 4 times ---
        customers.add("Shatha");
         for (int i = 0; i <customers.size(); i++) {
             CafeUtil.addCustomer(customers);
             System.out.println("\n");
         }
    }
    }