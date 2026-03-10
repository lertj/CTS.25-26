package ro.csie.ase.models;

import ro.csie.ase.abstracts.AWeapon;
import ro.csie.ase.abstracts.IDefendable;

public class Shield extends AWeapon implements IDefendable {

    public Shield(String name, int[] model) {
        super(name, model);
    }

    @Override
    public void use(int hitPoints) {
        this.defend(hitPoints);
    }

    @Override
    public void defend(int hitPoints) {
        System.out.println("Ne aparam cu scutul. " + hitPoints + " hp.");
    }
}
