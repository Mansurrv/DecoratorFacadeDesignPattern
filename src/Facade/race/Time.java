package Facade.race;

public class Time {
    private boolean isFinished;

    public boolean isSFinished() {
        return isFinished;
    }

    public void startCrossCountry() {
        System.out.println("Cross-country successfully started... ");
        isFinished = true;
    }

    public void finishCrossCountry() {
        System.out.println("Cross-country running successfully stopped... ");
        isFinished = false;
    }
}
