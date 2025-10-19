package Decorator.jobs;

import Decorator.decorator.Decorator;
import Decorator.position.Position;

public class FitnessCoach extends Decorator {
    public FitnessCoach(Position position) {
        super(position);
    }

    private String fitnessCoachJob() {
        return "FitnessCoachJob: creates workout programs";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + "\n" + fitnessCoachJob();
    }
}
