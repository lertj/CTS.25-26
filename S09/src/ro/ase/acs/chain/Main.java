package ro.ase.acs.chain;

import ro.ase.acs.chain.abstracts.AModuleChat;
import ro.ase.acs.chain.models.NegativeChat;
import ro.ase.acs.chain.models.ProfanityChat;
import ro.ase.acs.chain.models.SpamChat;

public class Main {
    public static void main(String[] args) {
        AModuleChat nc = new NegativeChat("Negative language");
        AModuleChat pc = new ProfanityChat("Negative language");
        AModuleChat sc = new SpamChat("Negative language");


        nc.setNextHandler(sc);
        sc.setNextHandler(pc);

        // ...

        nc.filter("Mihai te urasc, spam spam spam ***###");
        System.out.println("**************");
        sc.setNextHandler(nc);
        sc.filter("Mihai te urasc, spam spam spam ***###");
    }
}
