package UI;

import Logic.Static;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class MacGunFrame extends javax.swing.JFrame {

    public MacGunFrame() {
        this.setUndecorated(true);
        //Sets the icon image to the status bar and windows status bar
        setIconImage(Static.getIconImage());
        initComponents();
        //Sets program title and version to state bar.
        this.setTitle(Static.title + " " + Static.version);
        //sets the frame on center
        this.setLocationRelativeTo(null);
        //makes the frame visible
        this.setVisible(true);
        //Sets the image of mac_gun at the jlabel.
        resize_img();
    }

    private void resize_img() {
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../IMG/mac_gun.png")));
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(jLabel_gun_mac.getWidth(), jLabel_gun_mac.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel_gun_mac.setIcon(i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_gun_mac = new javax.swing.JLabel();
        jButton1_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1_back.setText("ok...");
        jButton1_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_gun_mac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1_back, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_gun_mac, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1_back))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_backActionPerformed
        MainFrame mainFrame = new MainFrame();
        this.dispose();
    }//GEN-LAST:event_jButton1_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_back;
    private javax.swing.JLabel jLabel_gun_mac;
    // End of variables declaration//GEN-END:variables
}
