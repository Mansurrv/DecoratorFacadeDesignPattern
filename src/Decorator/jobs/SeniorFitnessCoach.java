package Decorator.jobs;

import Decorator.decorator.Decorator;
import Decorator.position.Position;

public class SeniorFitnessCoach extends Decorator {
    private double bonus;

    public SeniorFitnessCoach(Position position, double bonus) {
        super(position);
        this.bonus = bonus;
    }

    @Override
    public String getInformation() {
        return position.getInformation() + " + provides advanced workout advice, design personalized and advanced training programs";
    }

    @Override
    public double getWage() {
        return position.getWage() + bonus;
    }
}
