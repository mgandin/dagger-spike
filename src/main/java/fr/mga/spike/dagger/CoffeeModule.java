package fr.mga.spike.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {
    @Provides
    public Heater heater() {
        return new Heater();
    }

    @Provides
    public Pump pump(Thermosiphon pump) {
        return pump;
    }
}
