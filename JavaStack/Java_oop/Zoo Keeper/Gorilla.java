public class Gorilla extends Mammal {
    
    public void throwSomething(){
        setEnergy(-5);
        System.out.println("The gorilla has thrown an object.");
    }
    public void climp(){
        setEnergy(-10);
        System.out.println("The gorilla has climbed a tree.");
    }
    public void eatBananas(){
        setEnergy(10);
        System.out.println("The gorilla has eaten a banana.");
    }

}
