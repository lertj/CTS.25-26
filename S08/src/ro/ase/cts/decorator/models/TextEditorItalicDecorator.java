package ro.ase.cts.decorator.models;

import ro.ase.cts.decorator.abstracts.AEditor;
import ro.ase.cts.decorator.abstracts.ATextDecorator;

public class TextEditorItalicDecorator extends ATextDecorator {

    public TextEditorItalicDecorator(AEditor editor) {
        super(editor);
    }

    @Override
    public void showText() {
        editor.showText();
        System.out.println("This text is italic.");
    }
}
