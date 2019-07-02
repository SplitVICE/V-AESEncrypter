package UI;

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

    //Method to change normal text into AES text.
    private String AES_output(String text) {
        return this.aes.encrypt(text, jTextField1_password.getText());
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

        buttonGroup1.add(jRadioButton1_encrypt);
        jRadioButton1_encrypt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1_encrypt.setText("Encrypt");

        buttonGroup1.add(jRadioButton2_unencrypt);
        jRadioButton2_unencrypt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2_unencrypt.setText("Unencrypt");

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
        SettingsFrame settingsFrame = new SettingsFrame();
        this.dispose();
    }//GEN-LAST:event_jButton2_settingsActionPerformed

    private void jButton3_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_aboutActionPerformed
        AboutFrame aboutFrame = new AboutFrame();
        this.dispose();
    }//GEN-LAST:event_jButton3_aboutActionPerformed

    private void jButton1_copy_to_clipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_copy_to_clipboardActionPerformed

    }//GEN-LAST:event_jButton1_copy_to_clipboardActionPerformed

    private void jTextArea_panel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_panel1KeyReleased
        //there should be a password typed to perform the text morp
        if (jTextField1_password.getText().equals("")) {
            label_status_change("You must type the password key first.", "red");
        } else {
            System.out.println("hoo1");
            label_status_change("", "black");
            System.out.println("hoo2");
            try {
                System.out.println("text");
                jTextArea_panel2.setText(AES_output(jTextArea_panel1.getText()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (jTextArea_panel1.getText().equals("")) {
            jTextArea_panel2.setText("");
        }
    }//GEN-LAST:event_jTextArea_panel1KeyReleased

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
