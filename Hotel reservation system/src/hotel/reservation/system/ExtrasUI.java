/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Omar
 */
public class ExtrasUI extends javax.swing.JFrame {

    /**
     * Creates new form HealthClubUI
     */
    public ExtrasUI(String title) {
        initComponents();
        setTitle(title);
//         Back.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Omar\\Desktop\\Hotel reservation system\\Back.png")
//         .getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        Back = new javax.swing.JLabel();
        btn14 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(472, 714));
        getContentPane().setLayout(null);

        btn3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("Body Care");
        btn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn3.setContentAreaFilled(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(130, 340, 190, 50);

        btn7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("Extra Bed");
        btn7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn7.setContentAreaFilled(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(130, 120, 190, 50);

        Back.setText("");
        Back.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Omar\\Desktop\\Hotel reservation system\\Back.png")
            .getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
    Back.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            BackMouseClicked(evt);
        }
    });
    getContentPane().add(Back);
    Back.setBounds(0, 0, 77, 50);

    btn14.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
    btn14.setForeground(new java.awt.Color(255, 255, 255));
    btn14.setText("Delay");
    btn14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
    btn14.setContentAreaFilled(false);
    btn14.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn14ActionPerformed(evt);
        }
    });
    getContentPane().add(btn14);
    btn14.setBounds(130, 460, 190, 50);

    btn13.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
    btn13.setForeground(new java.awt.Color(255, 255, 255));
    btn13.setText("Extra Food");
    btn13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
    btn13.setContentAreaFilled(false);
    btn13.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn13ActionPerformed(evt);
        }
    });
    getContentPane().add(btn13);
    btn13.setBounds(130, 230, 190, 50);

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/reservation/system/images/1 (3).jpg"))); // NOI18N
    jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    getContentPane().add(jLabel1);
    jLabel1.setBounds(-10, -20, 490, 750);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        
        BodyCareUI m = new BodyCareUI("Grand Hotel");
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        setVisible(false);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        ExtraBedUI m = new ExtraBedUI("Grand Hotel");
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        setVisible(false);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btn7ActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        AfterLoginUI m = new AfterLoginUI("Grand Hotel");
        m.setVisible(true);
        setVisible(false);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_BackMouseClicked

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn14ActionPerformed

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
            java.util.logging.Logger.getLogger(ExtrasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExtrasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExtrasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExtrasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ExtrasUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
