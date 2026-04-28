package ro.ase.cts.decorator.models;

import ro.ase.cts.decorator.abstracts.AEditor;

public class TextEditor extends AEditor {

    @Override
    public void showText() {
        System.out.println("text = " + text + ", size = " + size);
    }

    public TextEditor(String text, int size) {
        this.text = text;
        this.size = size;
    }

}
