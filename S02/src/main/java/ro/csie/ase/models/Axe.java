package ro.csie.ase.models;

import ro.csie.ase.abstracts.AWeapon;
import ro.csie.ase.abstracts.IAttackable;
import ro.csie.ase.abstracts.IDefendable;

public class Axe extends AWeapon implements IAttackable, IDefendable {

    public Axe(String name, int[] model) {
        super(name, model);
    }

    @Override
    public void use(int hitPoints) {
        this.attack(hitPoints);
    }

    @Override
    public void attack(int hitPoints) {
        System.out.println("Atacam cu toporul. " + hitPoints + " dmg.");
    }

    @Override
    public void defend(int hitPoints) {
        System.out.println("Ne aparam cu toporul. " + hitPoints*0.7 + " dmg.");
    }
}
