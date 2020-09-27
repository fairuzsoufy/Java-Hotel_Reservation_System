/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar
 */
public class TodayCheckOut extends javax.swing.JFrame {

    
    public TodayCheckOut(String title) throws ParseException {
        initComponents();
        
        setTitle(title);
        model.setColumnIdentifiers(Columns);
        table.setModel(model);
        in();
    }
    
    public void in() throws ParseException{
    ObjectInputStream bin = null;
            try {
                //guests=null;
                bin = new ObjectInputStream(new FileInputStream("D://Guests.bin"));
                guests=(ArrayList<GuestInfo>)bin.readObject();
                
              
                for(int i=0;guests.size()>i;i++)
                {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    String x = dateFormat.format(guests.get(i).getCheckOut()); 
                    Date date = new Date();
                    String y =dateFormat.format(date);
                    
                    if(x.equals(y))
                    {
                        
                        rows[0]=guests.get(i).getRoomNum();
                        rows[1]=guests.get(i).getFName();
                        rows[2]=guests.get(i).getLName();
                        rows[3]=x;
                        rows[4]=guests.get(i).getPhoneNum();
                        rows[5]=guests.get(i).getRoomType();
                        rows[6]=guests.get(i).getAccType();
                        model.addRow(rows);
                        //table.setVisible(true);
                    }
                
                
                }
                
                
                   } catch (IOException ex) {
                Logger.getLogger(DisplayGuests.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DisplayGuests.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    bin.close();
                } catch (IOException ex) {
                    Logger.getLogger(DisplayGuests.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
    }
    
    Object[]Columns={"Room NO.","First Name","Last Name","Check Out","Phone Number","Room Type","Accomodation Type"};
    Object[]rows=new Object[9];
    DefaultTableModel model = new DefaultTableModel();
    static ArrayList<GuestInfo> guests = new ArrayList<GuestInfo>();

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1104, 639));
        getContentPane().setLayout(null);

        table.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 1080, 400);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Check Out Today");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 20, 310, 60);

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

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        AfterLoginUI m = new AfterLoginUI("Grand Hotel");
        m.setVisible(true);
        setVisible(false);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_BackMouseClicked

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
            java.util.logging.Logger.getLogger(TodayCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodayCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodayCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodayCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TodayCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
