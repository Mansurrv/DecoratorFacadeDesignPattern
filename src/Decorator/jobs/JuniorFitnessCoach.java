package Decorator.jobs;

import Decorator.decorator.Decorator;
import Decorator.position.Position;

public class JuniorFitnessCoach extends Decorator {
    private float bonus;

    public JuniorFitnessCoach(Position position, float bonus) {
        super(position);
        this.bonus = bonus;
    }

    @Override
    public String getInformation() {
        return position.getInformation() + " + assist senior trainers, work with beginners";
    }

    @Override
    public double getWage() {
        return position.getWage() + bonus;
    }
}
