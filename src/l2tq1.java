/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunway
 */
public class l2tq1 extends javax.swing.JFrame {

    /**
     * Creates new form l2tq1
     */
    public l2tq1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        b = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(794, 351));
        setMinimumSize(new java.awt.Dimension(794, 351));
        setPreferredSize(new java.awt.Dimension(794, 351));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("URW Bookman L", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 44, 215));
        jLabel2.setText(" \t  What does AM mean?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 760, 40);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("URW Palladio L", 3, 24)); // NOI18N
        r1.setForeground(new java.awt.Color(54, 44, 215));
        r1.setText("Angelo marconi");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1);
        r1.setBounds(20, 100, 270, 36);

        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("URW Palladio L", 3, 24)); // NOI18N
        r4.setForeground(new java.awt.Color(54, 44, 215));
        r4.setText("Amperes");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        getContentPane().add(r4);
        r4.setBounds(20, 220, 118, 36);

        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("URW Palladio L", 3, 24)); // NOI18N
        r3.setForeground(new java.awt.Color(54, 44, 215));
        r3.setText("Amplitude modulation");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        getContentPane().add(r3);
        r3.setBounds(20, 180, 280, 36);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("URW Palladio L", 3, 24)); // NOI18N
        r2.setForeground(new java.awt.Color(54, 44, 215));
        r2.setText("Anno median");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2);
        r2.setBounds(20, 140, 310, 36);

        b.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        b.setForeground(new java.awt.Color(54, 44, 215));
        b.setText("NEXT");
        b.setEnabled(false);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        getContentPane().add(b);
        b.setBounds(340, 290, 130, 44);

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/sunway/NetBeansProjects/sunway/src/Screenshot from 2019-07-31 12-29-02.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(794, 351));
        jLabel1.setMinimumSize(new java.awt.Dimension(794, 351));
        jLabel1.setPreferredSize(new java.awt.Dimension(794, 351));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
      b.setEnabled(true);
    }//GEN-LAST:event_r1ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
       b.setEnabled(true);
    }//GEN-LAST:event_r4ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        b.setEnabled(true);
    }//GEN-LAST:event_r3ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
       b.setEnabled(true);
    }//GEN-LAST:event_r2ActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
      
        {        int points;
    if (r3.isSelected())
    {points=1;}
    else 
        points=0;
   
   l2tq2 q=new l2tq2();
    q.setVisible (true);}
        dispose();
    }//GEN-LAST:event_bActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(l2tq1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(l2tq1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(l2tq1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(l2tq1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new l2tq1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    // End of variables declaration//GEN-END:variables
}
