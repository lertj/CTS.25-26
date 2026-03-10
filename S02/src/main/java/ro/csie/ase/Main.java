package ro.csie.ase;

import ro.csie.ase.models.Axe;
import ro.csie.ase.models.GameCharacter;
import ro.csie.ase.models.Shield;
import ro.csie.ase.models.Sword;

public class Main {
    public static void main(String[] args) {
        GameCharacter mainCharacter = new GameCharacter("Odobasian", 33, 100, new Sword("Sabia fermecata", new int[]{100,827, -999}));
        mainCharacter.play();
        mainCharacter.setWeapon(new Shield("Scutul lui Audi", new int[]{111, 0, 451, -521}));
        mainCharacter.play();
        mainCharacter.setWeapon(new Axe("Toporceanu", new int[]{1111, 10, 1, -5921}));
        mainCharacter.play2();

    }
}
