package ro.ase.cts.decorator.models;

import ro.ase.cts.decorator.abstracts.ATextDecorator;
import ro.ase.cts.decorator.abstracts.AEditor;

public class TextEditorBoldDecorator extends ATextDecorator {

    public TextEditorBoldDecorator(AEditor editor) {
        super(editor);
    }
    @Override
    public void showText() {
       // System.out.println("text = " + text + ", size = " + size);
        editor.showText();
        System.out.println("This text is bold.");
    }
}
