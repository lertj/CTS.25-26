package ro.cts.ase.Command.models;

import ro.cts.ase.Command.abstracts.ICommand;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cook bucatar = new Cook();
        Waiter waiter = new Waiter();

        ICommand pizza1 = new PizzaCommand(bucatar, Arrays.asList("pepperoni", "mozarella", "ciuperci"));
        ICommand paste1 = new PastaCommand(bucatar, "carbonara");

        waiter.preiaComanda(pizza1);
        waiter.preiaComanda(paste1);

        waiter.onoreazaComenzi();
    }
}
