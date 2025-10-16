public class Decorator implements Position {
    Position position;

    public String jobDietitian = "Creates personalized nutrition plans and provides dietary guidance as well. ";
    public String jobCoach = "Helps clients exercise correctly and safety and monitors exercise technique as well. ";

    public Decorator(Position position) {
        this.position = position;
    }

    @Override
    public String makeJob() {
        return position.makeJob();
    }
}
