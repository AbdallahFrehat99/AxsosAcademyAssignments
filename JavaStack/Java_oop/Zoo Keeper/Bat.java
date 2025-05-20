public class Bat extends Mammal{
    public Bat() {
        setEnergyLevel(300);
    }

    public void fly() {
        setBatEnergy(-50);
        System.out.println("the bat is now airborne.");
    }
    public void eatHuman() {
        setBatEnergy(25);
        System.out.println("the bat is eating a human.");
    }
    public void attackTown(){
        setBatEnergy(-100);
        System.out.println("the bat is attacking the town.");
    }
}
