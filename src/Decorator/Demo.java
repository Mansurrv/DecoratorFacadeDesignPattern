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
        Position juniorFitnessCoach = new JuniorFitnessCoach(basicJob, juniorWage);
        Position seniorFitnessCoach = new SeniorFitnessCoach(juniorFitnessCoach, seniorWage);

        Position[] positions = {
                basicJob,juniorFitnessCoach,seniorFitnessCoach
        };

        displayInfo(positions, 0);
    }

    public static void displayInfo(Position[] positions, int idx) {
        if (idx==positions.length) return;

        Position position = positions[idx];
        System.out.println("\n--- Fitness Job Information ---");
        System.out.println(position.getInformation());
        System.out.println("Total Wage: " + position.getWage() + "₸");

        displayInfo(positions, idx+1);
    }
}
