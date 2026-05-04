package ro.cts.ase.Command.models;

import ro.cts.ase.Command.abstracts.ICommand;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<ICommand> comenzi = new ArrayList<>();

    public void preiaComanda(ICommand comanda) {
        comenzi.add(comanda);
    }

    public void onoreazaComenzi() {
        for (ICommand comanda : comenzi) {
            comanda.execute();
        }

        comenzi.clear();
    }
}
