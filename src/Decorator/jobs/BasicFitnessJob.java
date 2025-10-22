package Decorator.jobs;

import Decorator.position.Position;

public class BasicFitnessJob implements Position {
    private String job;
    private String memberName;
    private float wage;

    public BasicFitnessJob(String job, String memberName, float  wage) {
        this.job = job;
        this.memberName = memberName;
        this.wage = wage;
    }

    @Override
    public String getInformation() {
        return memberName + "'s basic fitness job: " + job;
    }

    @Override
    public double getWage() {
        return wage;
    }


}
