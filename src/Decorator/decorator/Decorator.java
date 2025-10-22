package Decorator.decorator;

import Decorator.position.Position;

public abstract class Decorator implements Position {
    protected Position position;

    public Decorator(Position position) {
        this.position = position;
    }

    @Override
    public String getInformation() {
        return position.getInformation();
    }

    @Override
    public double getWage() {
        return position.getWage();
    }
}
