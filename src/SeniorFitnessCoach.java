public class SeniorFitnessCoach extends Decorator {
    public SeniorFitnessCoach(Position position) {
        super(position);
    }

    public String exerciseTechnique() {
        return "SeniorFitnessCoach: Helps clients exercise correctly and safety and monitors exercise technique as well. ";
    }

    @Override
    public String makeJob() {
        return exerciseTechnique() + jobCoach;
    }
}
