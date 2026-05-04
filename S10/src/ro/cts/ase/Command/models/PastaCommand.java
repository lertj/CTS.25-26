package ro.cts.ase.Command.models;

import ro.cts.ase.Command.abstracts.ICommand;

public class PastaCommand implements ICommand {
    private Cook bucatar;
    private String tipPaste;

    public PastaCommand(Cook bucatar, String tipPaste) {
        this.bucatar = bucatar;
        this.tipPaste = tipPaste;
    }

    @Override
    public void execute() {
        bucatar.gatestePaste(tipPaste);
    }
}
