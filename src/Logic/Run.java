package Logic;

import UI.MainFrame;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Run {

    //Core method that starts the program
    public static void start_program() {
        //Opens the main frame of the program.
        MainFrame mainFrame = new MainFrame();
    }

    //Copies to clipboard the content that is placed inside the method.
    public static void copy_to_clipboard(String str) {
        StringSelection selection = new StringSelection(str);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }

}
