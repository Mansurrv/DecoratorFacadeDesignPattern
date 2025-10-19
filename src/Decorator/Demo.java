package Decorator;

import Decorator.jobs.BasicFitnessJob;
import Decorator.jobs.Dietitian;
import Decorator.jobs.FitnessCoach;
import Decorator.jobs.Physiotherapist;
import Decorator.position.Position;

public class Demo {
    public static void main(String[] args) {
        Position basicJob = new BasicFitnessJob("just working", "Mansur");

        Position fullJob = new Physiotherapist(new Dietitian(new FitnessCoach(basicJob)));

        System.out.println(fullJob.makeJob());
    }
}
