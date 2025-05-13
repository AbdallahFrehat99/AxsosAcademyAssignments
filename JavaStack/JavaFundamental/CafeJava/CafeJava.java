package CafeJava;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coffeePrice = 13;
        double cappuccinoPrice =5;
        double lattePrice =7;
        // Customer name variables (add yours below)
        String customer1 = "Shatha";
        String customer2 = "Ahmed";
        String customer3 = "Sali";
        String customer4 = "Adam";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        boolean isReadyOrder5 = true; 
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:

        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"
        // ** Your customer interaction print statements will go here ** //
        System.out.println(generalGreeting + customer3);
        if (isReadyOrder3) {
            System.out.println(customer3+ readyMessage +displayTotalMessage+coffeePrice );
        }else{
            System.out.println(customer3+pendingMessage);
        }
    
        System.out.println("-------------------------------------------------------------");
        
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.println(customer2+ readyMessage +displayTotalMessage+cappuccinoPrice );
        }else{
            System.out.println(customer2+pendingMessage);
        }

        System.out.println("-------------------------------------------------------------");
        
        System.out.println(generalGreeting + customer3);
        if (isReadyOrder5) {
            System.out.println(customer3+ readyMessage +displayTotalMessage+lattePrice*2 );
        }else{
            System.out.println(customer3+pendingMessage);
        }

        System.out.println("-------------------------------------------------------------");

        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println(customer4+ readyMessage +displayTotalMessage+ coffeePrice);
        }else{
            System.out.println(customer4+pendingMessage);
        }
        System.out.format("Sorry %s, we made a mistake. You have %.2f $ left.",customer4,(coffeePrice-lattePrice));
        System.out.println("");
        System.out.println("-------------------------------------------------------------");

    }

}


