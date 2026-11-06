package Assignment_3_1_1;

public class SuperCar extends Car {
    private String engineType;

    public SuperCar(String engineType, String typeName) {
        super(typeName);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return this.engineType;
    }

    @Override
    public void accelerate() {
        if (this.gasolineLevel > 0) {
            this.speed += 30;
        } else {
            this.speed = 0;
        }
    }

    @Override
    public void decelerate() {
        if (this.gasolineLevel > 0) {
            this.speed -= 30;
        } else {
            this.speed = 0;
        }
    }
}
