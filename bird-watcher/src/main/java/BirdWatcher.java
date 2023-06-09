import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int todayBirds = birdsPerDay[birdsPerDay.length - 1];

        birdsPerDay[birdsPerDay.length - 1] = todayBirds + 1;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays
                .stream(birdsPerDay)
                .filter(birds -> birds == 0)
                .toArray()
                .length > 0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[] trimmedArray = Arrays.copyOfRange(birdsPerDay, 0, numberOfDays);

        return Arrays.stream(trimmedArray).sum();
    }

    public int getBusyDays() {
        return Arrays
                .stream(birdsPerDay)
                .filter(birds -> birds >= 5)
                .toArray()
                .length;
    }
}
