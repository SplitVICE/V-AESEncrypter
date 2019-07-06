package Objects;

//This class maintains the text of main panel 1 and 2 and password typed if the
//user goes to another frame.
public class Textkeeper {

    //Static String to keep the content of the panel 1.
    public static String panel_1_content = "";
    //Static String to keep the content of the pane 2.
    public static String panel_2_content = "";
    //Static String to keep the content of the key password typed.
    public static String password_key_content = "";
    //Checks if the user has done a frame change. If true, the content of the
    //String above will be set at its correspondent equivalents.
    public static boolean frame_jump_performed = false;

}
