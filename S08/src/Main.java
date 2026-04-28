import ro.ase.cts.decorator.abstracts.AEditor;
import ro.ase.cts.decorator.models.TextEditor;
import ro.ase.cts.decorator.models.TextEditorBoldDecorator;
import ro.ase.cts.decorator.models.TextEditorItalicDecorator;
import ro.ase.cts.decorator.models.TextEditorStrikethroughDecorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main{
    public static void main(String[] args) {
        AEditor editor = new TextEditor("ABCDE", 14);
        editor.showText();
        editor =  new TextEditorBoldDecorator(editor);
        editor = new TextEditorItalicDecorator(editor);
        editor.showText();
        System.out.println();

        AEditor editor2 = new TextEditor("FGH", 12);
        editor2 = new TextEditorItalicDecorator(new TextEditorBoldDecorator(new TextEditorStrikethroughDecorator(editor2)));
        editor2.showText();
    }
}

