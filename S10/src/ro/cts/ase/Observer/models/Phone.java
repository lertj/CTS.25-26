package ro.cts.ase.Observer.models;

import ro.cts.ase.Observer.abstracts.IObservable;

public class Phone implements IObservable {

    @Override
    public void crestePret() {
        System.out.println("A crescut pretul la telefon, va sugeram sa va vindeti telefonul");
    }

    @Override
    public void scadePret(long timestamp) {
        System.out.println("A scazut pretul la telefon, nu va recomandam sa-l vindeti");
    }
}
