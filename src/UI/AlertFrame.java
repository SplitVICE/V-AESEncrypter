package UI;

public class AlertFrame extends javax.swing.JFrame implements Runnable {
    //This frame is used to display quick simple messages.

    //Requires a message to display.
    public AlertFrame(String message) {
        //Makes the status bar disapear.
        this.setUndecorated(true);
        initComponents();
        //The message is placed inside the jlabel
        this.jLabel1_message.setText(message);
        settings();
    }

    private void settings() {
        //centrates the frame
        this.setLocationRelativeTo(null);
        //deploys the frame
        this.setVisible(true);
        //Thread
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            //Closes the frame after the given time.
            Thread.sleep(400);
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_message.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1_message.setText("message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1_message)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1_message)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1_message;
    // End of variables declaration//GEN-END:variables
}
