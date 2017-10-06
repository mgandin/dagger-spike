package fr.mga.spike.dagger;

import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeShop {
    CoffeeMaker maker();
}
