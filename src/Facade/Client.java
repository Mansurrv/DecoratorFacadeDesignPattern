package Facade;

import Facade.facade.Facade;

public class Client {
    public static void main(String[] args) {
        Facade planFacade = new Facade();
        planFacade.plan();
    }
}
