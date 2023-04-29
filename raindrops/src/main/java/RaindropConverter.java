class RaindropConverter {

    String convert(int number) {
        String stringResult = "";

        if (number % 3 == 0) {
            stringResult += "Pling";
        }

        if (number % 5 == 0) {
            stringResult += "Plang";
        }

        if (number % 7 == 0) {
            stringResult += "Plong";
        }

        return stringResult.isEmpty()
                ? String.valueOf(number)
                : stringResult;
    }

}
