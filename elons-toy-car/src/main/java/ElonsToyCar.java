public class ElonsToyCar {
    private int battery = 100;
    private int distance;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distance);
    }

    public String batteryDisplay() {
        return battery > 0
                ? String.format("Battery at %d%%", battery)
                : "Battery empty";
    }

    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery -= 1;
        }
    }
}
