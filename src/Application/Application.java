package Application;

import Factory.Logistics;
import Factory.RoadLogistics;
import Factory.SeaLogistics;

import java.util.Scanner;

public class Application {
    private static Logistics logistics;

    private static void initialize(String want) throws Exception {
        if (want.equals("Sea")) {
            logistics = new SeaLogistics();
        } else if (want.equals("Road")) {
            logistics = new RoadLogistics();
        } else {
            throw new Exception("Error!");
        }
    }

    public static void main(String[] args) throws Exception {
        String want = (new Scanner(System.in)).next();
        initialize(want);
        logistics.planDelivery();
    }
}
