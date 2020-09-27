/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Fairuz
 */
public class LogInUI extends javax.swing.JFrame {

  //
    public LogInUI(String title) {
        initComponents();
        setTitle(title);
        
    }
    JOptionPane err = new JOptionPane();
    HashMap<String,String> table1 = new HashMap<String,String>();
    HashMap<String,String> table2 = new HashMap<String,String>();
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        comb = new javax.swing.JComboBox();
        btn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(440, 713));
        setResizable(false);
        getContentPane().setLayout(null);

        userText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userText.setForeground(new java.awt.Color(255, 255, 255));
        userText.setToolTipText("");
        userText.setBorder(null);
        userText.setCaretColor(new java.awt.Color(255, 255, 255));
        userText.setName(""); // NOI18N
        userText.setOpaque(false);
        getContentPane().add(userText);
        userText.setBounds(70, 170, 300, 50);

        passText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passText.setForeground(new java.awt.Color(255, 255, 255));
        passText.setBorder(null);
        passText.setCaretColor(new java.awt.Color(255, 255, 255));
        passText.setOpaque(false);
        getContentPane().add(passText);
        passText.setBounds(70, 280, 300, 60);

        comb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Receptionist", "Manager" }));
        comb.setBorder(null);
        comb.setOpaque(false);
        comb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combActionPerformed(evt);
            }
        });
        getContentPane().add(comb);
        comb.setBounds(60, 400, 320, 60);

        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMouseClicked(evt);
            }
        });
        getContentPane().add(btn);
        btn.setBounds(60, 540, 310, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login As:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 370, 120, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 140, 120, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 260, 120, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel reservation system/src/hotel/reservation/system/images/Capture3.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 440, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combActionPerformed

       public void addManager(String u,String p) throws IOException, ClassNotFoundException
    {
    
        ObjectInputStream i = new ObjectInputStream(new FileInputStream("D://ManagerUsers.bin"));
        table1=(HashMap<String, String>) i.readObject();
        table1.put(u, p);
        ObjectOutputStream bin = new ObjectOutputStream(new FileOutputStream("D://ManagerUsers.bin"));
        bin.writeObject(table1);
       
    }
    
    public void addReceptionist(String u,String p) throws IOException, ClassNotFoundException
    {
        ObjectInputStream i = new ObjectInputStream(new FileInputStream("D://ReceptionistUsers.bin"));
        table2=(HashMap<String, String>) i.readObject();
        table2.put(u, p);
        ObjectOutputStream bin = new ObjectOutputStream(new FileOutputStream("D://ReceptionistUsers.bin"));
        bin.writeObject(table2);
       
    }
    
       public boolean LoginRecep(String username, String password) throws IOException, ClassNotFoundException

    {
        
        ObjectInputStream bin = new ObjectInputStream( new FileInputStream("D://ReceptionistUsers.bin"));
        table2 = (HashMap<String,String>)bin.readObject(); 
        username=userText.getText();
        password = passText.getText();
        if (table2.containsKey(username))
        {
            String storedPassword = table2.get(username);
            if (storedPassword.equals(password)) {
                return true;
            } 
            else return false;
        }
        
        

         else 
        {
            return false;
        }
        
    }
      
    public boolean LoginManager(String username, String password) throws IOException, ClassNotFoundException
    {
       
        ObjectInputStream bin = new ObjectInputStream( new FileInputStream("D://ManagerUsers.bin"));
        table1 = (HashMap<String,String>)bin.readObject(); 
        username=userText.getText();
        password = passText.getText();
        if (table1.containsKey(username))
        {
            String storedPassword = table1.get(username);
            if (storedPassword.equals(password)) {
                return true;
            } 
            else
            {
                return false;
            }
        }
        
        

   else
            return false;
    }
    
    private void btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseClicked
        // TODO add your handling code here:
        if (userText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "USername Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);        

            }
           
            else if  (passText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Password Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
        
            else 
                    {
        

                     if (comb.getSelectedItem() == "Manager")
                    {
                         try {
                             if(LoginManager(userText.getText(),passText.getText()))
                             {
                                 AfterManagerUI m = new AfterManagerUI("Grand Hotel");
                                 m.setLocationRelativeTo(null);
                                 m.setVisible(true);
                                 setVisible(false);
                                 m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                 
                             }
                             else
                             {
                                 err.showMessageDialog(null, "Username or Password is incorrect! ", " Error ",
                                         err.ERROR_MESSAGE);
                             }        } catch (IOException ex) {
                             Logger.getLogger(LogInUI.class.getName()).log(Level.SEVERE, null, ex);
                         } catch (ClassNotFoundException ex) {
                             Logger.getLogger(LogInUI.class.getName()).log(Level.SEVERE, null, ex);
                         }
                    }
                if (comb.getSelectedItem() == "Receptionist")
                {
                         try {
                             if(LoginRecep(userText.getText(),passText.getText()))
                             {
                                 
                                 AfterLoginUI after = new AfterLoginUI("Grand Hotel");
                                 after.setLocationRelativeTo(null);
                                 after.setVisible(true);
                                 setVisible(false);
                                 after.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                 
                             }
                             else
                             {
                                 err.showMessageDialog(null, "Username or Password is incorrect! ", " Error ",
                                         err.ERROR_MESSAGE);
                             }        } catch (IOException ex) {
                             Logger.getLogger(LogInUI.class.getName()).log(Level.SEVERE, null, ex);
                         } catch (ClassNotFoundException ex) {
                             Logger.getLogger(LogInUI.class.getName()).log(Level.SEVERE, null, ex);
                         }
                }
                if(comb.getSelectedItem() == " ")
                {
                     err.showMessageDialog(null, "Please Choose a Valid Job ", " Error ",
                     err.ERROR_MESSAGE);
                }

            
                    }
    }//GEN-LAST:event_btnMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn;
    private javax.swing.JComboBox comb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
