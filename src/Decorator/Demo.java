package Decorator;

import Decorator.jobs.BasicFitnessJob;
import Decorator.jobs.JuniorFitnessCoach;
import Decorator.jobs.SeniorFitnessCoach;
import Decorator.position.Position;

public class Demo {
    public static void main(String[] args) {
        float basicWage = 1_000_000.1F;
        float juniorWage = 9_000_000.9F;
        float seniorWage = 91_000_000.91F;

        Position basicJob = new BasicFitnessJob("provides basic fitness sessions", "Coach Mansur", basicWage);
        displayInfo(basicJob);

        Position dietitian = new JuniorFitnessCoach(basicJob, juniorWage);
        displayInfo(dietitian);

        Position fitnessCoach = new SeniorFitnessCoach(dietitian, seniorWage);
        displayInfo(fitnessCoach);
    }

    public static void displayInfo(Position position) {
        System.out.println("\n--- Fitness Job Information ---");
        System.out.println(position.getInformation());
        System.out.println("Total Wage: " + position.getWage() + "₸");
    }
}
