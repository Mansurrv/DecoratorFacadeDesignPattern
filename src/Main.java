public class Main {
    public static void main(String[] args) {
        Position seniorCoach = new SeniorFitnessCoach(new JuniorFitnessCoach());
        Position juniorCoach = new JuniorFitnessCoach();

        Position juniorDietitian = new JuniorDietitian();
        Position seniorDietitian = new SeniorDietitian(new JuniorDietitian());

        System.out.println(seniorCoach.makeJob());
        System.out.println(juniorCoach.makeJob());

        System.out.println();

        System.out.println(juniorDietitian.makeJob());
        System.out.println(seniorDietitian.makeJob());
    }
}
