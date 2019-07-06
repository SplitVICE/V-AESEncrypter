package UI;

import Logic.Run;
import Logic.Static;
import Objects.AES;
import Objects.Textkeeper;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MainFrame extends javax.swing.JFrame {

    //Aes object to use inside the class to morp the text.
    private AES aes = new AES();

    public MainFrame() {
        //Sets the icon image to the status bar and windows status bar
        setIconImage(Static.getIconImage());
        initComponents();
        settings();
    }

    private void settings() {
        //Sets program title and version to state bar.
        this.setTitle(Static.title + " " + Static.version);
        //centrates the frame
        this.setLocationRelativeTo(null);
        //deploys the frame
        this.setVisible(true);
        //Prevents the window to be resizable
        this.setResizable(false);
        //by default, the encrypt combobox will be always selected.
        jRadioButton1_encrypt.setSelected(true);
        //The status label gets cleaned
        label_status_change("", "black");
        //Settings of the panels
        panels_settings();
        buttons_settings();
        //the field of key password request focus to immediately type there
        jTextField1_password.requestFocus();
    }

    // <editor-fold desc="Frame buttons and listeners. initComponents method">
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_password = new javax.swing.JTextField();
        jRadioButton1_encrypt = new javax.swing.JRadioButton();
        jRadioButton2_unencrypt = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_panel2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4_status = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_panel1 = new javax.swing.JTextArea();
        jButton1_copy_to_clipboard = new javax.swing.JButton();
        jButton2_settings = new javax.swing.JButton();
        jButton3_about = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 208, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Password key:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("V-AESEncrypter");

        jTextField1_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_passwordKeyTyped(evt);
            }
        });

        buttonGroup1.add(jRadioButton1_encrypt);
        jRadioButton1_encrypt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1_encrypt.setText("Encrypt");
        jRadioButton1_encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_encryptActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2_unencrypt);
        jRadioButton2_unencrypt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2_unencrypt.setText("Unencrypt");
        jRadioButton2_unencrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_unencryptActionPerformed(evt);
            }
        });

        jTextArea_panel2.setColumns(20);
        jTextArea_panel2.setRows(5);
        jScrollPane1.setViewportView(jTextArea_panel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Text output");

        jLabel4_status.setText("STATUS LOREM IPSUM IS A DUMMY TEXT TO FILL EMPTY SPACES");

        jTextArea_panel1.setColumns(20);
        jTextArea_panel1.setRows(5);
        jTextArea_panel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea_panel1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea_panel1);

        jButton1_copy_to_clipboard.setText("COPY TO CLIPBOARD");
        jButton1_copy_to_clipboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_copy_to_clipboardActionPerformed(evt);
            }
        });

        jButton2_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/gear_settings_img.png"))); // NOI18N
        jButton2_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_settingsActionPerformed(evt);
            }
        });

        jButton3_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/about_button_image.png"))); // NOI18N
        jButton3_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_aboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1_encrypt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2_unencrypt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4_status, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1_password))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_about, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(jButton1_copy_to_clipboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton3_about)
                    .addComponent(jButton2_settings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1_encrypt)
                    .addComponent(jRadioButton2_unencrypt)
                    .addComponent(jLabel4_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1_copy_to_clipboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_settingsActionPerformed
        //Saves the content of panels and key password fields.
        save_panel_1_and_2_and_keyPassword_content();
        //Opens settings frame
        SettingsFrame settingsFrame = new SettingsFrame();
        this.dispose();
    }//GEN-LAST:event_jButton2_settingsActionPerformed

    private void jButton3_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_aboutActionPerformed
        //Saves the content of panels and key password fields.
        save_panel_1_and_2_and_keyPassword_content();
        //Opens about frame.
        AboutFrame aboutFrame = new AboutFrame();
        this.dispose();
    }//GEN-LAST:event_jButton3_aboutActionPerformed


    private void jButton1_copy_to_clipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_copy_to_clipboardActionPerformed
        //if there are text inside the panel 2, it will be copied to clipboard.
        if (!jTextArea_panel2.getText().equals("")) {
            //Method to copy content to clipboard.
            Run.copy_to_clipboard(jTextArea_panel2.getText());
            //Shows a message to the user that the content was copied.
            AlertFrame a = new AlertFrame("Copied!");
        }
    }//GEN-LAST:event_jButton1_copy_to_clipboardActionPerformed

    private void jTextArea_panel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_panel1KeyReleased
        //LISTENS TO ALL THE KEYBOARD TYPES THE USER DOES AT THE PANEL 1.
        panels_engine();
    }//GEN-LAST:event_jTextArea_panel1KeyReleased

    private void jRadioButton1_encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_encryptActionPerformed
        panels_engine();
    }//GEN-LAST:event_jRadioButton1_encryptActionPerformed

    private void jRadioButton2_unencryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_unencryptActionPerformed
        panels_engine();
    }//GEN-LAST:event_jRadioButton2_unencryptActionPerformed

    private void jTextField1_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_passwordKeyTyped
        panels_engine();
    }//GEN-LAST:event_jTextField1_passwordKeyTyped

    // </editor-fold>
    
    // <editor-fold desc="Logic methods">
    //Settings of the buttons "Settings" and "About"
    private void buttons_settings() {
        jButton3_about.setOpaque(false);
        jButton3_about.setContentAreaFilled(false);
        jButton3_about.setBorderPainted(false);

        jButton2_settings.setOpaque(false);
        jButton2_settings.setContentAreaFilled(false);
        jButton2_settings.setBorderPainted(false);
    }

    //Method that performs all the transfer of the text of the panels
    private void panels_engine() {
        //there should be a password typed to perform the text morp
        if (is_there_a_password_key_typed()) {
            panels_text_mannager();
        }
        clean_panel2_if_panel1_is_empty();
    }

    //Method that validates if there is a password key typed.
    private boolean is_there_a_password_key_typed() {
        if (jTextField1_password.getText().equals("")) {
            label_status_change("You must type the password key first.", "red");
            return false;
        } else {
            label_status_change("", "black");
            return true;
        }
    }

    //Transfer the text inside the panel1 to the panel2. Also, checks if the
    //the text is normal or AES.
    private void panels_text_mannager() {
        //String that contains the resultset of the panel one when passes through
        //AES object. It is used to review for errors.
        String panel1_output_string = "";
        //if encrypter is selected...
        if (jRadioButton1_encrypt.isSelected()) {
            //Content of panel1 will be transfered to panel1_output_string as AES.
            panel1_output_string = this.aes.encrypt(jTextArea_panel1.getText(), jTextField1_password.getText());
            //Checks is there isn't any issue with AES syntax.
            //text will be trasnfered as AES text to the panel2
            jTextArea_panel2.setText(panel1_output_string);
        } else {
            //Content of panel1 will be transfered to panel1_output_string as 
            //normal text.
            panel1_output_string = this.aes.decrypt(jTextArea_panel1.getText(), jTextField1_password.getText());
            //Checks is there isn't any issue with AES syntax.
            if (!is_there_a_AES_error(panel1_output_string)) {
                //text will be trasnfered as normal text to the panel2
                jTextArea_panel2.setText(panel1_output_string);
            }
        }
    }

    //Method that gives if the syntax written inside panel 1 is correct
    //or if the keypassword is incorrect
    private boolean is_there_a_AES_error(String panel1_output_string) {
        //Boolean that checks if the text written down is AES text.
        boolean is_aes_text = true;
        //Boolean that checks if key password is correct
        boolean is_key_password_correct = true;

        //is the text written down AES?
        if (this.aes.is_the_text_AES(panel1_output_string)) {
            is_aes_text = true;
        } else {

            is_aes_text = false;
        }
        //is key password correct?
        if (this.aes.is_key_password_correct(panel1_output_string)) {
            is_key_password_correct = true;
        } else {

            is_key_password_correct = false;
        }

        //if those booleans are correct, then there are not any problem. Returns
        //false.
        if (is_aes_text && is_key_password_correct) {
            label_status_change("", "red");
            return false;
            //if there is something incorrect then...
        } else {
            //if the text is not aes text there will be displayed an error that
            //says so and also the panel 2 will be cleared
            if (!is_aes_text) {
                //Error message
                label_status_change("The text given is not AES format!", "red");
                //Clears the panel 2
                jTextArea_panel2.setText("");
            }
            //if the key password is not correct then there wiill be displayed
            //an error message and also the panel 2 will be cleared
            if (!is_key_password_correct) {
                //Error message
                label_status_change("The key password is incorrect!", "red");
                //clears panel 2
                jTextArea_panel2.setText("");
            }
            //at the end returns true. it means there is a error at the aes
            //format or key password.
            return true;
        }
    }

    //If there are any text at the panel 1, it will clear the panel 2
    private void clean_panel2_if_panel1_is_empty() {
        if (jTextArea_panel1.getText().equals("")) {
            jTextArea_panel2.setText("");
        }
    }

    //Gives color and text to the status label.
    private void label_status_change(String message, String color) {
        switch (color) {
            case "red":
                jLabel4_status.setForeground(Color.red);
                break;
            case "blue":
                jLabel4_status.setForeground(Color.blue);
                break;
            case "green":
                jLabel4_status.setForeground(Color.green);
                break;
            case "black":
                jLabel4_status.setForeground(Color.black);
                break;
            default:
                throw new AssertionError();
        }
        jLabel4_status.setText(message);
    }

    private void panels_settings() {
        //no lateral scroll
        jTextArea_panel1.setLineWrap(true);
        //Line jump if text is too big
        jTextArea_panel1.setWrapStyleWord(true);
        //no lateral scroll
        jTextArea_panel2.setLineWrap(true);
        //Line jump if text is too big
        jTextArea_panel2.setWrapStyleWord(true);
        //You are not supposed to be able to type at the panel two. So it will
        //be disabled to be written into
        jTextArea_panel2.setEditable(false);

        //If the MainFrame is being opened after the user went to another frame
        //The content of panels and key password field will be re-established
        if (Textkeeper.frame_jump_performed) {
            jTextField1_password.setText(Textkeeper.password_key_content);
            jTextArea_panel1.setText(Textkeeper.panel_1_content);
            jTextArea_panel2.setText(Textkeeper.panel_2_content);
        }
    }

    //Sets the content inside the panels and the key password field into
    //variables at the Textkeeper class. In order to fill the panels and the
    //key password field with the same info they had before changing the frame.
    private void save_panel_1_and_2_and_keyPassword_content() {
        Textkeeper.panel_1_content = jTextArea_panel1.getText();
        Textkeeper.panel_2_content = jTextArea_panel2.getText();
        Textkeeper.password_key_content = jTextField1_password.getText();
        Textkeeper.frame_jump_performed = true;
    }

// </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1_copy_to_clipboard;
    private javax.swing.JButton jButton2_settings;
    private javax.swing.JButton jButton3_about;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4_status;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1_encrypt;
    private javax.swing.JRadioButton jRadioButton2_unencrypt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea_panel1;
    private javax.swing.JTextArea jTextArea_panel2;
    private javax.swing.JTextField jTextField1_password;
    // End of variables declaration//GEN-END:variables
}
