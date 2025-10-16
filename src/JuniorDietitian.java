public class JuniorDietitian implements Position {
    public String jobDietitian = "Creates personalized nutrition plans and provides dietary guidance. ";

    @Override
    public String makeJob() {
        return "JuniorDietitian: " + jobDietitian;
    }
}
