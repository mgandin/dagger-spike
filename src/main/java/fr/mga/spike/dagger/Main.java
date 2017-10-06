package fr.mga.spike.dagger;

public class Main {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = DaggerCoffeeShop.create().maker();
        coffeeMaker.go();
    }
}
