
import java.util.Arrays;
import java.util.List;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    // This methods adds 1 to the count of birds seen today.
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;
    }

    // This method returns true if there were any days with zero sightings of birds
    public boolean hasDayWithoutBirds() {
         for (int i : birdsPerDay) {
            if (i == 0) return true;
         }
         return false;
    }

    // This method returns the total numbers of birds spotted for the first `numberOfDays` days.
    // If `numberOfDays` is greater than the array length it return the total for all days.
    // If `numberOfDays` is less than or equal to 0, it returns 0.
    public int getCountForFirstDays(int numberOfDays) {
        int countOfBirds = 0;
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        for(int i = 0; i < numberOfDays; i++) {
            countOfBirds += birdsPerDay[i];
        }
        return countOfBirds;
    }

    // If the number of birds seen in a day is 5 or more, it is considered a busy day.
    // This method returns the number of busy days in the last week.
    // If there are no busy days, it returns 0.
    public int getBusyDays() {
        int countOfBusyDays = 0;
        for (int i : birdsPerDay) {
            if (i >=5) {
                countOfBusyDays += 1;
            }
        }
        return countOfBusyDays;
    }
}
