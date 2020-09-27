/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class BodyCareUI extends javax.swing.JFrame {

    /**
     * Creates new form BodyCareUI
     */
    public BodyCareUI(String title) {
        initComponents();
        setTitle(title);
    }

    ArrayList<GuestInfo> guests = new ArrayList<GuestInfo>();
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        RoomNum = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(473, 711));
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
    jLabel2.setBounds(140, 410, 220, 30);

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Type of Body Care:");
    getContentPane().add(jLabel3);
    jLabel3.setBounds(120, 110, 220, 30);

    jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
    jComboBox1.setBorder(null);
    jComboBox1.setInheritsPopupMenu(true);
    jComboBox1.setOpaque(false);
    getContentPane().add(jComboBox1);
    jComboBox1.setBounds(160, 300, 130, 40);

    jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spa", "Sauna", "Jacuzzi", "Gym" }));
    jComboBox2.setBorder(null);
    jComboBox2.setInheritsPopupMenu(true);
    jComboBox2.setOpaque(false);
    getContentPane().add(jComboBox2);
    jComboBox2.setBounds(140, 150, 180, 40);

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Hours Needed:");
    getContentPane().add(jLabel4);
    jLabel4.setBounds(140, 260, 220, 30);

    RoomNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    RoomNum.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            RoomNumKeyPressed(evt);
        }
    });
    getContentPane().add(RoomNum);
    RoomNum.setBounds(170, 450, 110, 40);

    saveBtn.setText("Save");
    saveBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            saveBtnActionPerformed(evt);
        }
    });
    getContentPane().add(saveBtn);
    saveBtn.setBounds(180, 570, 90, 40);

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
                
                
            }
            else
            {
                JOptionPane.showMessageDialog( null, "Wrong");
                
            }
        } catch (IOException ex) {
            Logger.getLogger(BodyCareUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BodyCareUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BodyCareUI("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JTextField RoomNum;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
