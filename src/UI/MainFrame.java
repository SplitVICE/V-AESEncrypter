package UI;

import Logic.Run;
import Logic.Static;
import Objects.AES;
import java.awt.Color;

public class MainFrame extends javax.swing.JFrame {

    //Aes object to use inside the class to morp the text.
    private AES aes = new AES();

    public MainFrame() {
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
        //by default, the encrypt combobox will be always selected.
        jRadioButton1_encrypt.setSelected(true);
        //The status label gets cleaned
        label_status_change("", "black");
        //Settings of the panels
        panels_settings();
    }

    // <editor-fold desc="Buttons to frames and initComponents">
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Password key:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("V-AESEncrypter");

        jTextField1_password.setText("vice");
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
        jLabel3.setText("Output");

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

        jButton2_settings.setText("Settings");
        jButton2_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_settingsActionPerformed(evt);
            }
        });

        jButton3_about.setText("About");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jButton1_copy_to_clipboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1_encrypt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2_unencrypt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_about)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4_status, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1_password)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1_encrypt)
                    .addComponent(jRadioButton2_unencrypt)
                    .addComponent(jButton2_settings)
                    .addComponent(jButton3_about)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_settingsActionPerformed
        //Opens settings frame
        SettingsFrame settingsFrame = new SettingsFrame();
        this.dispose();
    }//GEN-LAST:event_jButton2_settingsActionPerformed

    private void jButton3_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_aboutActionPerformed
        //Opens about frame.
        AboutFrame aboutFrame = new AboutFrame();
        this.dispose();
    }//GEN-LAST:event_jButton3_aboutActionPerformed

    // </editor-fold>

    private void jButton1_copy_to_clipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_copy_to_clipboardActionPerformed
        //if there are text inside the panel 2, it will be copied to clipboard.
        if (!jTextArea_panel2.getText().equals("")) {
            //Method to copy content to clipboard.
            Run.copy_to_clipboard(jTextArea_panel2.getText());
            //Shows a message to the user that the content was copied.
            AlertFrame a = new AlertFrame("Copied!");
        }
    }//GEN-LAST:event_jButton1_copy_to_clipboardActionPerformed

    //LISTENS TO ALL THE KEYBOARD TYPES THE USER DOES AT THE PANEL 1.
    private void jTextArea_panel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_panel1KeyReleased
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
        System.out.println("output: " + panel1_output_string);
        boolean status = false;        
        //is the text written down AES?
        if (this.aes.is_the_text_AES(panel1_output_string)) {
            label_status_change("", "red");
            jTextArea_panel2.setText("");
            status = false;
        } else {
            //Error label
            label_status_change("The text given is not AES format!", "red");
            jTextArea_panel2.setText("");
            status = true;
        }
        //is key password correct?
        if (this.aes.is_key_password_correct(panel1_output_string)) {
            label_status_change("", "red");
            jTextArea_panel2.setText("");
            status = false;
        } else {
            //Error label
            label_status_change("The password is incorrect!", "red");
            jTextArea_panel2.setText("");
            status = true;
        }
        return status;
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
    }

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
