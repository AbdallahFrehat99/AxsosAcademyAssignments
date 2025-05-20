public class Phone extends Device {
    public void makeCall() {
        setBattary(-5);
    }

    public void playGame() {
        if (getBattary() < 25) {
            System.out.println("the battary is low");
        } else {

            setBattary(-20);
        }

    }

    public void charge() {
        setBattary(50);

    }
}
