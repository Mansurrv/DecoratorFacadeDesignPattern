package Decorator.jobs;

import Decorator.decorator.Decorator;
import Decorator.position.Position;

public class Dietitian extends Decorator {
    public Dietitian(Position position) {
        super(position);
    }

    private String dietitianJob() {
        return "Dietitian: makes meal plans";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + "\n" + dietitianJob();
    }
}
