
package Logic;

import java.awt.Image;
import java.awt.Toolkit;


public class Static {
    
    public static String folderForDataName = "V-AESEncrypter";
    public static String globalFolderForData = "Just Vice";
    public static String DataPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName + "\\UserData.txt";
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName;
    public static String title = "V-AESEncrypter",version = "0.1";
    public static Data data = new Data();
    public static Run run;

//    public static Image getIconImage() {
//        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogov2.png"));
//    }
    
}
