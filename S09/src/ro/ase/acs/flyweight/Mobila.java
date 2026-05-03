package ro.ase.acs.flyweight;

public class Mobila implements Renderable {
    private String model;
    private String color;

    public Mobila(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void render(Obiect3D stare) {
        System.out.println(model + color + stare.toString());
    }
}
