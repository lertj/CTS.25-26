package ro.ase.acs.flyweight;

public class Main {
    public static void main(String[] args){
        Obiect3D stare1 = new Obiect3D(2000, 100,120,210,true);
        Obiect3D stare2 = new Obiect3D(2590, 500,520,250,false);

        Mobila mobila = new Mobila("Noptiera.obj","black" );
        mobila.render(stare1);
        System.out.println();
        mobila.render(stare2);

        Mobila m1 = MobilaFactory.getMobila(MobilaType.DULAP);
        m1.render(stare1);


    }
}
