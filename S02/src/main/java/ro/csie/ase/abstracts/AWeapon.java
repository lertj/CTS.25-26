package ro.csie.ase.abstracts;

public abstract class AWeapon {
    String name;
    int[] model;

    public AWeapon(String name, int[] model) {
        this.name = name;
        this.model = model;
    }

    public abstract void use(int hitPoints);
}
