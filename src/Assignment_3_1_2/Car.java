package Assignment_3_1_2;

public class Car {
    protected double speed;
    protected double gasolineLevel;
    protected String typeName;

    // Constructor
    public Car(String typeName) {
        this.typeName = typeName;
        this.speed = 0;
        this.gasolineLevel = 0;
    }

    // Getters and Seters
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    public void setGasolineLevel(double gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }


    // Car Methods (for the super class)
    public void accelerate() {
        if (gasolineLevel > 0) {
            this.speed += 10;
        } else {
            this.speed = 0;
        }
    }

    public void decelerate() {
        if (gasolineLevel > 0) {
            this.speed -= 10;
        } else {
            this.speed = 0;
        }
    }

    public void fillTank() {
        this.gasolineLevel = 100;
    }
}
