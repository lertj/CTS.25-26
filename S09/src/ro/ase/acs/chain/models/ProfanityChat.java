package ro.ase.acs.chain.models;

import ro.ase.acs.chain.abstracts.AModuleChat;

public class ProfanityChat extends AModuleChat {

    public ProfanityChat(String denumire) {
        super(denumire);
    }

    @Override
    public void filter(String text) {
        if(text.contains("***###")){
            text = text.replace("***###", "");
            System.out.println("Profanity detected!");
        }
        if(nextHandler != null){
            nextHandler.filter(text);
        }

    }
}
