public class DeviceTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.getBattary());
        phone.makeCall();
        phone.makeCall();
        phone.makeCall();
        phone.makeCall();

        phone.playGame();
        phone.playGame();
        phone.playGame();
        phone.playGame();
        phone.playGame();
        phone.playGame();
        System.out.println(phone.getBattary());

        phone.charge();
        phone.charge();
        System.out.println(phone.getBattary());
    }
}
