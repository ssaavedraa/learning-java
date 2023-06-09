class Darts {
    int score(double xOfDart, double yOfDart) {
        double dartRadius = getRadius(xOfDart, yOfDart);

        if (dartRadius <= 1) {
            return 10;
        }

        if (dartRadius <= 5) {
            return 5;
        }

        if (dartRadius <= 10) {
            return 1;
        }

        return 0;
    }

    double getRadius (double xOfDart, double yOfDart) {
        return Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));
    }
}
