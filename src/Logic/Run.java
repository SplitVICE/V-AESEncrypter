package Logic;

import UI.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Run {

    //Core method that starts the program
    public static void start_program() {
        try {
            //Loads program data
            Static.data.LoadData();
            //Show or not the program logo.
            if (Static.data.getUserData().isShow_intro_logo()) {
                //Opends the program logo
                IntroLogoFrame ilf = new IntroLogoFrame();
                //Thread to set the time limit of the frame before being closed
                Thread t = new Thread(ilf);
                //Starts Thread
                t.start();
                //the entire programs waits for the Thread to finish
                t.join();
            }
            //Opens the main frame of the program.
            MainFrame mainFrame = new MainFrame();
        } catch (Exception e) {
        }
    }

    //Copies to clipboard the content that is placed inside the method.
    public static void copy_to_clipboard(String str) {
        StringSelection selection = new StringSelection(str);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }

}
