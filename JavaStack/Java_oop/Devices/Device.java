public class Device {

    private int battary;

    public Device() {
        this.battary = 100;
    }

    public int getBattary() {
        return battary;
    }

    public void setBattary(int battary) {
        this.battary += battary;
        if (this.battary>100) {
            this.battary=100;
            System.out.println("the battery is full");
        }
        if(this.battary<10){
            System.out.println("battery critical");
        }
    }
    
    
}