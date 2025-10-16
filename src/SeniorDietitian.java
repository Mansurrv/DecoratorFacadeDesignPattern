public class SeniorDietitian extends Decorator {
    public SeniorDietitian(Position position) {
        super(position);
    }

    public String adviceFromSeniorDietitian() {
        return "SeniorDietitian: Makes meal plans. ";
    }

    @Override
    public String makeJob() {
        return adviceFromSeniorDietitian() + jobDietitian;
    }
}
