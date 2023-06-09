class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    private int speed;
    private int batteryDrain;
    private int distance;
    private int battery = 100;

    public NeedForSpeed (int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery <= 0;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack (int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained() && car.distanceDriven() < this.distance) {
            car.drive();
        }
        System.out.println(distance);
        System.out.println(car.batteryDrained());
        System.out.println(car.distanceDriven());

        if (car.batteryDrained()) {
            return car.distanceDriven() == this.distance;
        }

        return true;
    }
}
