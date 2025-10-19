package Decorator.jobs;

import Decorator.position.Position;

public class BasicFitnessJob implements Position {
    private String job;
    private String memberName;

    public BasicFitnessJob(String job, String memberName) {
        this.job = job;
        this.memberName = memberName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String makeJob() {
        return memberName + "'s Basic Fitness Job: " + job;
    }
}
