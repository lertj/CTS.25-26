package ro.cts.ase.Observer.models;

import ro.cts.ase.Observer.abstracts.IObservable;

public class Bread implements IObservable {

    @Override
    public void crestePret() {
        System.out.println("A crescut pretul la paine");
    }

    @Override
    public void scadePret(long timestamp) {
        System.out.println("A scazut pretul -" + timestamp);
    }

}
