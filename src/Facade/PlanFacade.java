package Facade;

public class PlanFacade {
    CrossCountryRunning runner = new CrossCountryRunning();
    Time time = new Time();
    Runners firstRunner = new Runners();

    public void plan() {
        runner.start();
        time.startCrossCountry();
        firstRunner.finishInTime(time);
        time.finishCrossCountry();
        firstRunner.finishInTime(time);
    }
}
