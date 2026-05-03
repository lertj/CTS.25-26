package ro.ase.acs.chain.models;

import ro.ase.acs.chain.abstracts.AModuleChat;

public class NegativeChat extends AModuleChat {

    public NegativeChat(String denumire) {
        super( denumire);
    }

    @Override
    public void filter(String text) {
        text = text.replace("rau","-");
        text = text.replace("diabolic","-");
        text = text.replace("urasc","-");
        System.out.println(text);
            if(nextHandler!=null){
                nextHandler.filter(text);
            }
    }

}
