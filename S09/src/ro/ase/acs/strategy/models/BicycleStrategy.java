package ro.ase.acs.strategy.models;

import ro.ase.acs.strategy.abstracts.ITransportStrategy;

public class BicycleStrategy implements ITransportStrategy {
    @Override
    public void transport() {
        System.out.println("Pedalling...");
    }
}
