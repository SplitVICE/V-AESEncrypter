package Logic;

import java.io.Serializable;

public class UserData implements Serializable {

    private static final long serialVersionUID = 2883991000023476147L;

    //Boolean that keeps the decision of showing the logo or not
    private boolean show_intro_logo = true;
    //controls the language that the program will have. English by default.
    private String language = "english";

    public UserData() {
    }

    public boolean isShow_intro_logo() {
        return show_intro_logo;
    }

    public void setShow_intro_logo(boolean show_intro_logo) {
        this.show_intro_logo = show_intro_logo;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    

}
