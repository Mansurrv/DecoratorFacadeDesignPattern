package Decorator.jobs;

import Decorator.decorator.Decorator;
import Decorator.position.Position;

public class Physiotherapist extends Decorator {
    public Physiotherapist(Position position) {
        super(position);
    }

    private String physiotherapistJob() {
        return "Physiotherapist: helps in recovery training";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + "\n" + physiotherapistJob();
    }
}
