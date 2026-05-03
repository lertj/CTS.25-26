package ro.ase.acs.chain.abstracts;

public abstract class AModuleChat {
    public AModuleChat nextHandler;
    String denumire;

    public AModuleChat( String denumire) {
        this.denumire = denumire;
    }

    public void setNextHandler(AModuleChat nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void filter(String text);

}
