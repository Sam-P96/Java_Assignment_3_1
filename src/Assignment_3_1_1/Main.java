package Assignment_3_1_1;

public class Main {
    public static void main(String[] args) {
        Car Luffy = new Car("Gomu");
        Luffy.fillTank();
        Luffy.accelerate();
        System.out.println(Luffy.getSpeed());

        SuperCar LuffyG2 = new SuperCar("Super","Gomu");
        LuffyG2.fillTank();
        LuffyG2.accelerate();
        System.out.println(LuffyG2.getSpeed());
    }

}
