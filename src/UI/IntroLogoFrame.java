package UI;

import Logic.Static;
import java.awt.Color;

public class IntroLogoFrame extends javax.swing.JFrame implements Runnable {

    public IntroLogoFrame() {
        //Sets the icon image to the status bar and windows status bar
        setIconImage(Static.getIconImage());
        //Deletes the status bar.
        setUndecorated(true);
        initComponents();
        //Makes the frame transparent
        setBackground(new Color(0, 0, 0, 0));
        //centrates the frame
        this.setLocationRelativeTo(null);
    }

    @Override
    public void run() {
        try {
            //makes the frame visible
            this.setVisible(true);
            //Sleeps for 0.8 seconds
            Thread.sleep(800);
            //closes the frame
            this.dispose();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/program_logo_t.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1_logo)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_logo)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1_logo;
    // End of variables declaration//GEN-END:variables

}
