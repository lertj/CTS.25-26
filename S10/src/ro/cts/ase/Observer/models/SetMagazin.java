package ro.cts.ase.Observer.models;

import ro.cts.ase.Observer.abstracts.IObservable;

public class SetMagazin {

    public static void main(String[] args) {

        Bread b1 = new Bread();
        Phone p1 = new Phone();

        MonitorizarePreturi monitorizarePreturi = new MonitorizarePreturi();
        monitorizarePreturi.abonare(b1);
        monitorizarePreturi.abonare(p1);
        monitorizarePreturi.notificareCrestePret();


        monitorizarePreturi.abonare(new Bread());

        IObservable observerAnonim = new IObservable() {
            @Override
            public void crestePret() {
                System.out.println("A crescut pretul la mar");
            }

            @Override
            public void scadePret(long timestamp) {
                System.out.println("Este un produs perisabil, va rugam sa-l cumparati");
            }
        };

        monitorizarePreturi.abonare(observerAnonim);

        monitorizarePreturi.notificareScadePret();
    }
}
