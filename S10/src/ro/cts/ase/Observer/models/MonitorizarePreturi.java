package ro.cts.ase.Observer.models;

import ro.cts.ase.Observer.abstracts.IObservable;

import java.util.ArrayList;
import java.util.List;

public class MonitorizarePreturi {
    private List<IObservable> abonati = new ArrayList<>();

    public void abonare(IObservable abonat) {
        this.abonati.add(abonat);
    }

    public void dezabonare(IObservable abonat) {
        this.abonati.remove(abonat);
    }

    public void notificareCrestePret() {
        for (IObservable abonat : abonati) {
            abonat.crestePret();
        }
    }


    public void notificareScadePret() {
        for(IObservable abonat: abonati) {
            abonat.scadePret(System.currentTimeMillis());
        }
    }
}
