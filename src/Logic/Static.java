package Logic;

//import java.awt.Image;

import java.awt.Image;
import java.awt.Toolkit;

//import java.awt.Toolkit;
public class Static {

    //Program data folder to save data.
    public static String folderForDataName = "V-AESEncrypter";
    //Global data folder to all my programs
    public static String globalFolderForData = "SPLIT VICE";
    //Path to the UserData.txt file. This file contains the user data and program data.
    public static String DataPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName + "\\UserData.txt";
    //Path to the program folder data.
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName;
    //Program title and version to display and to keep record.
    public static String title = "V-AESEncrypter", version = "1.1";
    //Data static object to save and load info.
    public static Data data = new Data();

    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogov2.png"));
    }
}
