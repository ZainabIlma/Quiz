
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunway
 */
public class l2sq3 extends javax.swing.JFrame {

    /**
     * Creates new form sq3
     */
    public l2sq3() {
        initComponents();
    }int counter=10;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        b = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(746, 440));
        setMinimumSize(new java.awt.Dimension(746, 440));
        setPreferredSize(new java.awt.Dimension(746, 440));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("URW Bookman L", 3, 36)); // NOI18N
        jLabel2.setText("Wellington Trophy is related to which ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 930, 47);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("URW Palladio L", 3, 24)); // NOI18N
        r2.setText("Polo ");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2);
        r2.setBounds(10, 200, 230, 40);

        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("URW Palladio L", 3, 24)); // NOI18N
        r3.setForeground(new java.awt.Color(11, 11, 23));
        r3.setText(" Tennis ");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        getContentPane().add(r3);
        r3.setBounds(10, 250, 230, 41);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("URW Palladio L", 3, 24)); // NOI18N
        r1.setText("Hockey ");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1);
        r1.setBounds(10, 150, 230, 41);

        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("URW Palladio L", 3, 24)); // NOI18N
        r4.setText(" Rowing ");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        getContentPane().add(r4);
        r4.setBounds(10, 100, 230, 41);

        b.setFont(new java.awt.Font("URW Palladio L", 3, 24)); // NOI18N
        b.setText("NEXT");
        b.setEnabled(false);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        getContentPane().add(b);
        b.setBounds(340, 280, 140, 41);

        jLabel3.setFont(new java.awt.Font("URW Bookman L", 3, 30)); // NOI18N
        jLabel3.setText("game ?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 120, 32);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIME LEFT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dustismo Roman", 3, 30))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(71, 74));
        jPanel1.setMinimumSize(new java.awt.Dimension(71, 74));
        jPanel1.setPreferredSize(new java.awt.Dimension(71, 74));

        time.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        time.setMaximumSize(new java.awt.Dimension(49, 20));
        time.setMinimumSize(new java.awt.Dimension(49, 20));
        time.setPreferredSize(new java.awt.Dimension(49, 20));
        jPanel1.add(time);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(480, 80, 200, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot from 2019-07-26 09-38-08.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(746, 440));
        jLabel1.setMinimumSize(new java.awt.Dimension(746, 440));
        jLabel1.setPreferredSize(new java.awt.Dimension(746, 440));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 746, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
         b.setEnabled(true); 
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        b.setEnabled(true); 
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        b.setEnabled(true); 
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        b.setEnabled(true); 
    }//GEN-LAST:event_r4ActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
         int points;
    if (r1.isSelected())
    {points=1;}
    else 
        points=0;
     l2sq4 q=new l2sq4();
    q.setVisible (true);
    dispose();
    }//GEN-LAST:event_bActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Timer timer=new Timer();
TimerTask task=new TimerTask(){

    public void run() {
     time.setText(""+counter);
     counter--;
if (counter==-1)
{
    JOptionPane.showMessageDialog(null,"time out");
}
    } };
   timer.scheduleAtFixedRate(task, 1000, 1000); // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(sq3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sq3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sq3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sq3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new l2sq3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
