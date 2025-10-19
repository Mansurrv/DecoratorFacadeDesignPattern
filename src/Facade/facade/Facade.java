package Facade.facade;

import Facade.start.StartCross;
import Facade.race.Time;
import Facade.race.Runners;

public class Facade {
    StartCross runner = new StartCross();
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
