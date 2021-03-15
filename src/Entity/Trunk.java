package Entity;

public class Trunk implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by land in a box.");
    }
}
