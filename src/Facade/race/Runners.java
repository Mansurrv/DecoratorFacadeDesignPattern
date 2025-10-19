package Facade.race;

public class Runners {
    public void finishInTime(Time time) {
        if (time.isSFinished()) {
            System.out.println("Runner still running... ");
        }
        else {
            System.out.println("Runner successfully finished... ");
        }
    }
}
