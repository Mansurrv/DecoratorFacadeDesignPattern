package Decorator.decorator;

import Decorator.position.Position;

public class Decorator implements Position {
    Position position;

    public Decorator(Position position) {
        this.position = position;
    }

    @Override
    public String makeJob() {
        return position.makeJob();
    }
}
