package Facade;

public class Runners {
    public void finishInTime(Time time) {
        if (time.isStarted()) {
            System.out.println("Runner still running... ");
        }else {
            System.out.println("Runner successfully finished... ");
        }
    }
}
