package Assignment_3_1_2;

public class Main {
    public static void main(String[] args) {
//        Car Luffy = new Car("Gomu");
//        Luffy.fillTank();
//        Luffy.accelerate();
//        System.out.println(Luffy.getSpeed());
//
//        SuperCar LuffyG2 = new SuperCar("Super","Gomu");
//        LuffyG2.fillTank();
//        LuffyG2.accelerate();
//        System.out.println(LuffyG2.getSpeed());

        Bus shenron = new Bus("Dragon");
        shenron.fillTank();
        shenron.accelerate();
        System.out.println(shenron.gasolineLevel);
        System.out.println(shenron.getSpeed());

        //I also dont see anything about having to have the bus speed be 0 to board passengers...
        shenron.passengerEnter(3);
        System.out.println(shenron.getPassengers());
    }

}
