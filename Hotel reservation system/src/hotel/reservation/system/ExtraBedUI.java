/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar
 */
public class ExtraBedUI extends javax.swing.JFrame implements Serializable{

    /**
     * Creates new form ExtraBedUI
     */
    public ExtraBedUI(String title) {
        initComponents();
        setTitle(title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RoomNum = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 710));
        setResizable(false);
        getContentPane().setLayout(null);

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

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Room Number:");
    getContentPane().add(jLabel2);
    jLabel2.setBounds(150, 200, 220, 30);

    RoomNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    RoomNum.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            RoomNumKeyPressed(evt);
        }
    });
    getContentPane().add(RoomNum);
    RoomNum.setBounds(180, 240, 100, 40);

    saveBtn.setText("Save");
    saveBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            saveBtnActionPerformed(evt);
        }
    });
    getContentPane().add(saveBtn);
    saveBtn.setBounds(190, 360, 90, 40);

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/reservation/system/images/1 (3).jpg"))); // NOI18N
    jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    getContentPane().add(jLabel1);
    jLabel1.setBounds(-10, -20, 490, 750);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        ExtrasUI m = new ExtrasUI("Grand Hotel");
        m.setVisible(true);
        setVisible(false);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_BackMouseClicked

    private void RoomNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RoomNumKeyPressed

        int key=evt.getKeyCode();

        if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9||key==evt.VK_BACK_SPACE)))
        {
            RoomNum.setEditable(true);

        }
        else
        {JOptionPane.showMessageDialog(null, "Cannot type letters", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            RoomNum.setText("");

        }
        if(RoomNum.getText().length()>=3&&((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)))
        {
            JOptionPane.showMessageDialog(null, "Room number invalid", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            RoomNum.setText("");

        }
        else
        {
            RoomNum.setEditable(true);
        }

    }//GEN-LAST:event_RoomNumKeyPressed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        try {
            if(search(RoomNum.getText())==true)
            {
                JOptionPane.showMessageDialog( null, "Found");
                for(int i=0;i<guests.size();i++)
                {
                   if(guests.get(i).getRoomNum().equals(RoomNum.getText())) 
                    { 
                        GuestInfo d = new GuestInfo();
                        //guests.get(i).setTotal(guests.get(i).getTotal()+150.0);
                        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://Guests.bin"));
                        guests=(ArrayList<GuestInfo>)in.readObject(); 
                        d.setFName(guests.get(i).getFName());
                        d.setMName(guests.get(i).getMName());
                        d.setLName(guests.get(i).getLName());
                        d.setAddress(guests.get(i).getAddress());
                        d.setGender(guests.get(i).getGender());
                        d.setRoomType(guests.get(i).getRoomType());
                        d.setRoomNum(guests.get(i).getRoomNum());
                        d.setIdNum(guests.get(i).getIdNum());
                        d.setHomeNum(guests.get(i).getHomeNum());
                        d.setPhoneNum(guests.get(i).getPhoneNum());
                        d.setKids(guests.get(i).getKids());
                        d.setAdults(guests.get(i).getAdults());
                        d.setAccType(guests.get(i).getAccType());
                        d.setCheckIn(guests.get(i).getCheckIn());
                        d.setCheckOut(guests.get(i).getCheckOut());
                        d.setAge(guests.get(i).getAge());
                        d.setDeposit(guests.get(i).getDeposit());
                        d.setRoomType(guests.get(i).getRoomType());
                        d.setTotal(guests.get(i).getTotal());
                        d.setExtraBed(150);
                        guests.set(i, d);
                        ObjectOutputStream bin = new ObjectOutputStream(new FileOutputStream("D://Guests.bin"));
                        bin.writeObject(guests);
                        bin.close();
                        JOptionPane.showMessageDialog( null, "Extra Bed Added");
                        AfterLoginUI m = new AfterLoginUI("Grand Hotel");
                        m.setVisible(true);
                        setVisible(false);
                        m.setLocationRelativeTo(null);
                        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                    }
                }
            }
            if(search(RoomNum.getText())==false)
            {
                JOptionPane.showMessageDialog( null, "Wrong Room Number");

            }
        } catch (IOException ex) {
            Logger.getLogger(ExtraBedUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExtraBedUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_saveBtnActionPerformed

  boolean search(String  name) throws FileNotFoundException, IOException, ClassNotFoundException{
        
   
        boolean found = false;
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("D://Guests.bin"));
        guests=(ArrayList<GuestInfo>)file.readObject(); 
        for(int i=0;i<guests.size();i++)
        { 
            if(guests.get(i).getRoomNum().equals(name)) 
            { 
                found=true;
                
            }
        }

        if(found==true)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    
    }
     static ArrayList<GuestInfo> guests = new ArrayList<GuestInfo>();
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
            java.util.logging.Logger.getLogger(ExtraBedUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExtraBedUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExtraBedUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExtraBedUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ExtraBedUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JTextField RoomNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
