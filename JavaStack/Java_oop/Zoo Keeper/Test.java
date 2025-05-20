public class Test {
    public static void main(String[] args) {
        Bat batman = new Bat();
        Gorilla gorilla = new Gorilla();

        System.out.println(batman.displayEnergy());
        batman.fly();
        System.out.println(batman.displayEnergy());
        batman.attackTown();
        System.out.println(batman.displayEnergy());
        batman.eatHuman();
        System.out.println(batman.displayEnergy());

        System.out.println("----------------------------------------------------------------");

        gorilla.throwSomething();
        System.out.println(gorilla.displayEnergy());
        gorilla.climp();
        System.out.println(gorilla.displayEnergy());
        gorilla.eatBananas();
        System.out.println(gorilla.displayEnergy());

    }
}
