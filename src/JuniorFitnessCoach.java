public class JuniorFitnessCoach implements Position {
    public String jobCoach = "Creates individual training programs and motivates clients to achieve their goals as well. ";

    @Override
    public String makeJob() {
        return "JuniorCoach: " + jobCoach;
    }
}
