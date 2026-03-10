package ro.csie.ase.models;

import ro.csie.ase.abstracts.AWeapon;
import ro.csie.ase.abstracts.IAttackable;

public class Sword extends AWeapon implements IAttackable {

    public Sword(String name, int[] model) {
        super(name, model);
    }

    @Override
    public void use(int hitPoints) {
        this.attack(hitPoints);
    }

    @Override
    public void attack(int hitPoints) {
        System.out.println("Atacam cu sabia. " + hitPoints + " dmg.");
    }
}
