package ro.ase.acs.chain.models;

import ro.ase.acs.chain.abstracts.AModuleChat;

public class SpamChat extends AModuleChat {
    public SpamChat(String denumire) {
        super(denumire);
    }

    @Override
    public void filter(String text) {
       if(text.split("spam").length>2){
            text = text.replace("spam", "//");
        }
        System.out.println(text);
    }
}
