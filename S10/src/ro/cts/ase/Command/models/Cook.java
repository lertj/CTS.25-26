package ro.cts.ase.Command.models;

import java.util.List;

public class Cook {

    public void gatestePizza(List<String> ingrediente) {
        System.out.println("Bucatarul gateste pizza cu urmatoarele ingrediente: " + ingrediente);
    }

    public void gatestePaste(String tipPaste) {
        System.out.println("Bucatarul gateste paste de tip " + tipPaste);
    }
}
