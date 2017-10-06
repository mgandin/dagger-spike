package fr.mga.spike.dagger;

import javax.inject.Inject;

public class CoffeeMaker {

    private final Pump pump;

    @Inject
    public CoffeeMaker(Pump pump) {
        this.pump = pump;
    }

    public void go() {
        pump.go();
    }
}
