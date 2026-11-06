package Assignment_3_1_2;

public class Bus extends Car {
    private int passengers;

    public Bus(String typeName) {
        super(typeName);
        this.passengers = 0;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    // I dont see any instructions to add "max" passengers... sooo..... 👀
    public void passengerEnter(int ppl) {
        this.passengers += ppl;
    }

    public void passengerExit(int ppl) {
        this.passengers -= ppl;
    }
}
