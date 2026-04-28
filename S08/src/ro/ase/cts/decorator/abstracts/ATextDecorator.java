package ro.ase.cts.decorator.abstracts;

public abstract class ATextDecorator extends AEditor {
    public AEditor editor;

    public ATextDecorator(AEditor editor) {
        this.editor = editor;
    }

    @Override
    public void showText() {
        editor.showText();
    }
}
