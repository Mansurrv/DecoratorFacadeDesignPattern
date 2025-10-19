package Decorator;

import Decorator.jobs.BasicFitnessJob;
import Decorator.jobs.JuniorFitnessCoach;
import Decorator.jobs.SeniorFitnessCoach;
import Decorator.position.Position;

public class Demo {
    public static void main(String[] args) {
        Position basicJob = new BasicFitnessJob("provides basic fitness sessions", "Coach Mansur", 1_000_000.1);
        displayInfo(basicJob);

        Position dietitian = new JuniorFitnessCoach(basicJob, 9_000_000.9);
        displayInfo(dietitian);

        Position fitnessCoach = new SeniorFitnessCoach(dietitian, 91_000_000.91);
        displayInfo(fitnessCoach);
    }

    public static void displayInfo(Position position) {
        System.out.println("\n--- Fitness Job Information ---");
        System.out.println(position.getInformation());
        System.out.println("Total Wage: " + position.getWage() + "₸");
    }
}
