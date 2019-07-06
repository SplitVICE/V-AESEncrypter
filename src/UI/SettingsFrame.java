package UI;

import Logic.Static;

public class SettingsFrame extends javax.swing.JFrame {

    public SettingsFrame() {
        initComponents();
        settings();
        UI_settings();
    }

    private void settings() {
        //Sets the icon image to the status bar and windows status bar
        setIconImage(Static.getIconImage());
        //Sets program title and version to state bar.
        this.setTitle(Static.title + " " + Static.version);
        //centrates the frame
        this.setLocationRelativeTo(null);
        //deploys the frame
        this.setVisible(true);
        //Prevents the window to be resizable
        this.setResizable(false);
    }

    private void UI_settings() {
        if (Static.data.getUserData().isShow_intro_logo()) {
            jRadioButton3_show_logo_yes.setSelected(true);
        } else {
            jRadioButton4_show_logo_no.setSelected(true);
        }
        jRadioButton1_language_english.setSelected(true);
        jRadioButton2_language_spanish.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1_language_english = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton2_language_spanish = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton3_show_logo_yes = new javax.swing.JRadioButton();
        jRadioButton4_show_logo_no = new javax.swing.JRadioButton();
        jButton1_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton1_language_english);
        jRadioButton1_language_english.setText("English");

        jLabel1.setText("Language");

        buttonGroup1.add(jRadioButton2_language_spanish);
        jRadioButton2_language_spanish.setText("Español");

        jLabel2.setText("Show intro logo");

        buttonGroup2.add(jRadioButton3_show_logo_yes);
        jRadioButton3_show_logo_yes.setText("Yes");
        jRadioButton3_show_logo_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3_show_logo_yesActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton4_show_logo_no);
        jRadioButton4_show_logo_no.setText("No");
        jRadioButton4_show_logo_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_show_logo_noActionPerformed(evt);
            }
        });

        jButton1_back.setText("Back");
        jButton1_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2_language_spanish)
                            .addComponent(jRadioButton1_language_english))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3_show_logo_yes)
                                    .addComponent(jRadioButton4_show_logo_no)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1_back, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jLabel1)
                    .addContainerGap(144, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton3_show_logo_yes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4_show_logo_no))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1_language_english)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2_language_spanish)))
                .addGap(18, 18, 18)
                .addComponent(jButton1_back)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jLabel1)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_backActionPerformed
        MainFrame mainFrame = new MainFrame();
        this.dispose();
    }//GEN-LAST:event_jButton1_backActionPerformed

    private void jRadioButton3_show_logo_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3_show_logo_yesActionPerformed
        Static.data.getUserData().setShow_intro_logo(true);
        Static.data.updateInfo();
    }//GEN-LAST:event_jRadioButton3_show_logo_yesActionPerformed

    private void jRadioButton4_show_logo_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_show_logo_noActionPerformed
        Static.data.getUserData().setShow_intro_logo(false);
        Static.data.updateInfo();
    }//GEN-LAST:event_jRadioButton4_show_logo_noActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1_language_english;
    private javax.swing.JRadioButton jRadioButton2_language_spanish;
    private javax.swing.JRadioButton jRadioButton3_show_logo_yes;
    private javax.swing.JRadioButton jRadioButton4_show_logo_no;
    // End of variables declaration//GEN-END:variables
}
