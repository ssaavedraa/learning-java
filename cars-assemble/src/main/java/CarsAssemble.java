public class CarsAssemble {
    private final int STANDARD_PRODUCTION_RATE = 221;

    public double productionRatePerHour(int speed) {
        int productionRateBySpeed = speed * STANDARD_PRODUCTION_RATE;

        if (speed >= 1 && speed <= 4) {
            return productionRateBySpeed;
        }

        if (speed >= 5 && speed <= 8) {
            return  productionRateBySpeed * 0.9;
        }

        if (speed == 9) {
            return productionRateBySpeed * 0.8;
        }

        return productionRateBySpeed * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}
