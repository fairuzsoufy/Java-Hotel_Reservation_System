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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.global;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar
 */
public class EditGuestUI extends javax.swing.JFrame  implements Serializable{

    /**
     * Creates new form EditGuestUI
     */
    public EditGuestUI(String title) {
        
        initComponents();
        setTitle(title);
        
        firstNameText.setVisible(false);
        MidNameText.setVisible(false);
        LastNameText.setVisible(false);
        AgeText.setVisible(false);
        AddressText.setVisible(false);
        IDText.setVisible(false);
        GenderCb.setVisible(false);
        PhoneNumText.setVisible(false);
        HomeNumText.setVisible(false);
        Checkinj.setVisible(false);
        Checkoutj.setVisible(false);
        RoomTCb.setVisible(false);
        AccCb.setVisible(false);
        AdultsSpin.setVisible(false);
        KidsSpin.setVisible(false);
        DepositText.setVisible(false);
        VehicleText.setVisible(false);
        PlateText.setVisible(false);
        jLabel1.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel8.setVisible(false);
        jLabel6.setVisible(false);
        jLabel5.setVisible(false);
        jLabel14.setVisible(false);
        PhoneNumLabel.setVisible(false);
        HomeNumLabel.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel7.setVisible(false);
        jLabel18.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        Editbtn.setVisible(false);
       
        
    }
  static ArrayList<GuestInfo> guests = new ArrayList<GuestInfo>();
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

        SearchText = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();
        SearchLabel = new javax.swing.JLabel();
        MidNameText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        VehicleText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AccCb = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        Checkoutj = new com.toedter.calendar.JDateChooser();
        LastNameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        KidsSpin = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        AdultsSpin = new javax.swing.JSpinner();
        PlateText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IDText = new javax.swing.JTextField();
        AddressText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        HomeNumLabel = new javax.swing.JLabel();
        PhoneNumText = new javax.swing.JTextField();
        HomeNumText = new javax.swing.JTextField();
        PhoneNumLabel = new javax.swing.JLabel();
        RoomTCb = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        AgeText = new javax.swing.JTextField();
        DepositText = new javax.swing.JTextField();
        GenderCb = new javax.swing.JComboBox();
        Checkinj = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        Editbtn = new javax.swing.JButton();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1233, 928));
        setPreferredSize(new java.awt.Dimension(1233, 928));
        getContentPane().setLayout(null);
        getContentPane().add(SearchText);
        SearchText.setBounds(130, 50, 140, 30);

        Searchbtn.setText("Search");
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbtn);
        Searchbtn.setBounds(150, 90, 90, 25);

        SearchLabel.setText("Search With Room No.");
        getContentPane().add(SearchLabel);
        SearchLabel.setBounds(130, 30, 150, 20);

        MidNameText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        MidNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MidNameTextKeyPressed(evt);
            }
        });
        getContentPane().add(MidNameText);
        MidNameText.setBounds(130, 160, 150, 31);

        jLabel11.setText("Check In Date");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 490, 79, 16);

        VehicleText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        VehicleText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VehicleTextKeyPressed(evt);
            }
        });
        getContentPane().add(VehicleText);
        VehicleText.setBounds(130, 740, 150, 31);

        jLabel12.setText("Check Out Date");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 530, 88, 16);

        jLabel10.setText("Accomdation Type");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 610, 105, 16);

        jLabel1.setText("First Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 130, 62, 16);

        AccCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DayUse", "Half Board", "Full Board", "All Inclusive", "Bed and Breakfast", "Bed Only" }));
        getContentPane().add(AccCb);
        AccCb.setBounds(130, 600, 190, 30);

        jLabel14.setText("Gender");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 370, 41, 16);
        getContentPane().add(Checkoutj);
        Checkoutj.setBounds(130, 520, 190, 30);

        LastNameText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LastNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LastNameTextKeyPressed(evt);
            }
        });
        getContentPane().add(LastNameText);
        LastNameText.setBounds(130, 200, 150, 31);

        jLabel3.setText("Middle Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 170, 74, 16);
        getContentPane().add(KidsSpin);
        KidsSpin.setBounds(130, 670, 40, 22);

        jLabel7.setText("Adults");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(45, 640, 60, 16);
        getContentPane().add(AdultsSpin);
        AdultsSpin.setBounds(130, 640, 40, 22);

        PlateText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PlateText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlateTextKeyPressed(evt);
            }
        });
        getContentPane().add(PlateText);
        PlateText.setBounds(130, 780, 150, 31);

        firstNameText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        firstNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameTextKeyPressed(evt);
            }
        });
        getContentPane().add(firstNameText);
        firstNameText.setBounds(130, 120, 150, 31);

        jLabel15.setText("Deposit");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 710, 60, 16);

        jLabel8.setText("Kids");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(53, 670, 50, 16);

        jLabel17.setText("Plate No.");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(40, 790, 51, 16);

        jLabel16.setText("Vehicle Model");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 750, 79, 16);

        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 210, 80, 16);

        jLabel5.setText("National ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 330, 62, 16);

        IDText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        IDText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDTextKeyPressed(evt);
            }
        });
        getContentPane().add(IDText);
        IDText.setBounds(130, 320, 190, 31);

        AddressText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        AddressText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AddressTextKeyPressed(evt);
            }
        });
        getContentPane().add(AddressText);
        AddressText.setBounds(130, 280, 150, 31);

        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 290, 70, 16);

        HomeNumLabel.setText("Home Number");
        getContentPane().add(HomeNumLabel);
        HomeNumLabel.setBounds(20, 450, 82, 16);

        PhoneNumText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PhoneNumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumTextActionPerformed(evt);
            }
        });
        PhoneNumText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneNumTextKeyPressed(evt);
            }
        });
        getContentPane().add(PhoneNumText);
        PhoneNumText.setBounds(130, 400, 190, 31);

        HomeNumText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        HomeNumText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HomeNumTextKeyPressed(evt);
            }
        });
        getContentPane().add(HomeNumText);
        HomeNumText.setBounds(130, 440, 190, 31);

        PhoneNumLabel.setText("Phone Number");
        getContentPane().add(PhoneNumLabel);
        PhoneNumLabel.setBounds(20, 410, 84, 16);

        RoomTCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Double", "Triple" }));
        getContentPane().add(RoomTCb);
        RoomTCb.setBounds(130, 560, 190, 30);

        jLabel9.setText("Room Type");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 570, 65, 16);

        jLabel18.setText("Age");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(50, 250, 30, 16);

        AgeText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        AgeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeTextKeyPressed(evt);
            }
        });
        getContentPane().add(AgeText);
        AgeText.setBounds(130, 240, 100, 31);

        DepositText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        DepositText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DepositTextKeyPressed(evt);
            }
        });
        getContentPane().add(DepositText);
        DepositText.setBounds(130, 700, 150, 31);

        GenderCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(GenderCb);
        GenderCb.setBounds(130, 360, 100, 30);
        getContentPane().add(Checkinj);
        Checkinj.setBounds(130, 480, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Edit Guest");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 20, 180, 90);

        Editbtn.setText("SAVE");
        Editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Editbtn);
        Editbtn.setBounds(590, 820, 110, 40);

        Back.setText("");
        Back.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Omar\\Desktop\\Hotel reservation system\\Back.png")
            .getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
    Back.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            BackMouseClicked(evt);
        }
    });
    getContentPane().add(Back);
    Back.setBounds(0, 0, 77, 50);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        try {         
            // TODO add your handling code here:

            if(search(SearchText.getText())==true)
            {
                
                
                for(int i=0;i<guests.size();i++)
                {
                    if(guests.get(i).getRoomNum().equals(SearchText.getText()))
                    { 
                       
                        firstNameText.setText(guests.get(i).getFName());
                        MidNameText.setText(guests.get(i).getMName());
                        LastNameText.setText(guests.get(i).getLName());
                        AgeText.setText(guests.get(i).getAge());
                        AddressText.setText(guests.get(i).getAddress());
                        IDText.setText(guests.get(i).getIdNum());
                        GenderCb.setSelectedItem(guests.get(i).getGender());
                        PhoneNumText.setText(guests.get(i).getPhoneNum());
                        HomeNumText.setText(guests.get(i).getHomeNum());
                        Checkinj.setDate(guests.get(i).getCheckIn());
                        Checkoutj.setDate(guests.get(i).getCheckOut());
                        RoomTCb.setSelectedItem(guests.get(i).getRoomType());
                        AccCb.setSelectedItem(guests.get(i).getAccType());
                        AdultsSpin.setValue(guests.get(i).getAdults());
                        KidsSpin.setValue(guests.get(i).getKids());
                        DepositText.setText(Double.toString(guests.get(i).getDeposit()));
                        VehicleText.setText(guests.get(i).getVehicle());
                        PlateText.setText(guests.get(i).getPlate());
                        
                        SearchLabel.setVisible(false);
                        SearchText.setVisible(false);
                        Searchbtn.setVisible(false);
 
                        firstNameText.setVisible(true);
                        MidNameText.setVisible(true);
                        LastNameText.setVisible(true);
                        AgeText.setVisible(true);
                        AddressText.setVisible(true);
                        IDText.setVisible(true);
                        GenderCb.setVisible(true);
                        PhoneNumText.setVisible(true);
                        HomeNumText.setVisible(true);
                        Checkinj.setVisible(true);
                        Checkoutj.setVisible(true);
                        RoomTCb.setVisible(true);
                        AccCb.setVisible(true);
                        AdultsSpin.setVisible(true);
                        KidsSpin.setVisible(true);
                        DepositText.setVisible(true);
                        VehicleText.setVisible(true);
                        PlateText.setVisible(true);
                         jLabel1.setVisible(true);
                        jLabel3.setVisible(true);
                        jLabel4.setVisible(true);
                        jLabel8.setVisible(true);
                        jLabel6.setVisible(true);
                        jLabel5.setVisible(true);
                        jLabel14.setVisible(true);
                        PhoneNumLabel.setVisible(true);
                        HomeNumLabel.setVisible(true);
                        jLabel11.setVisible(true);
                        jLabel12.setVisible(true);
                        jLabel9.setVisible(true);
                        jLabel10.setVisible(true);
                        jLabel7.setVisible(true);
                        jLabel18.setVisible(true);
                        jLabel15.setVisible(true);
                        jLabel16.setVisible(true);
                        jLabel17.setVisible(true);
                        Editbtn.setVisible(true);
                       
                        
                        
                
                    }
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog( null, "Wrong");
               
            }
        } catch (IOException ex) {       
            Logger.getLogger(EditGuestUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditGuestUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_SearchbtnActionPerformed

    private void MidNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MidNameTextKeyPressed
        // TODO add your handling code here:

        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9))
        {

            JOptionPane.showMessageDialog(null, "Cannot put numbers", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            MidNameText.setText("");

        }
        else
        {
            MidNameText.setEditable(true);
        }
    }//GEN-LAST:event_MidNameTextKeyPressed

    private void VehicleTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VehicleTextKeyPressed
        // TODO add your handling code here:

        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9))
        {

            JOptionPane.showMessageDialog(null, "Cannot put numbers", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            VehicleText.setText("");

        }
        else
        {
            VehicleText.setEditable(true);
        }
    }//GEN-LAST:event_VehicleTextKeyPressed

    private void LastNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNameTextKeyPressed
        // TODO add your handling code here:

        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9))
        {

            JOptionPane.showMessageDialog(null, "Cannot put numbers", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            LastNameText.setText("");

        }
        else
        {
            LastNameText.setEditable(true);
        }
    }//GEN-LAST:event_LastNameTextKeyPressed

    private void PlateTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlateTextKeyPressed

    }//GEN-LAST:event_PlateTextKeyPressed

    private void firstNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextKeyPressed
        // TODO add your handling code here:

        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9))
        {

            JOptionPane.showMessageDialog(null, "Cannot put numbers", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            firstNameText.setText("");

        }
        else
        {
            firstNameText.setEditable(true);
        }
    }//GEN-LAST:event_firstNameTextKeyPressed

    private void IDTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTextKeyPressed

        // TODO add your handling code here:
        int key=evt.getKeyCode();

        if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)))
        {
            IDText.setEditable(true);

        }
        else
        {JOptionPane.showMessageDialog(null, "Cannot type letters", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            IDText.setText("");

        }
        if(IDText.getText().length()>=15&&((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)))
        {
            JOptionPane.showMessageDialog(null, "ID is less than 15 digit", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            IDText.setText("");

        }
        else
        {
            IDText.setEditable(true);
        }
    }//GEN-LAST:event_IDTextKeyPressed

    private void AddressTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressTextKeyPressed
        // TODO add your handling code here:

        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9))
        {

            JOptionPane.showMessageDialog(null, "Cannot put numbers", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            AddressText.setText("");

        }
        else
        {
            AddressText.setEditable(true);
        }
    }//GEN-LAST:event_AddressTextKeyPressed

    private void PhoneNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumTextActionPerformed

    private void PhoneNumTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumTextKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9||key==evt.VK_BACK_SPACE)))
        {
            PhoneNumText.setEditable(true);

        }
        else
        {JOptionPane.showMessageDialog(null, "Cannot type letters", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            PhoneNumText.setText("");

        }
    }//GEN-LAST:event_PhoneNumTextKeyPressed

    private void HomeNumTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HomeNumTextKeyPressed
        // TODO add your handling code here:

        int key=evt.getKeyCode();
        if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9||key==evt.VK_BACK_SPACE)))
        {
            HomeNumText.setEditable(true);

        }
        else
        {JOptionPane.showMessageDialog(null, "Cannot type letters", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            HomeNumText.setText("");
        }
    }//GEN-LAST:event_HomeNumTextKeyPressed

    private void AgeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeTextKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();

        if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9||key==evt.VK_BACK_SPACE)))
        {
            AgeText.setEditable(true);

        }
        else
        {JOptionPane.showMessageDialog(null, "Cannot type letters", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            AgeText.setText("");

        }
        if(AgeText.getText().length()>=2&&((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)))
        {
            JOptionPane.showMessageDialog(null, "Abnormal Age", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            AgeText.setText("");

        }
        else
        {
            AgeText.setEditable(true);
        }

    }//GEN-LAST:event_AgeTextKeyPressed

    private void DepositTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DepositTextKeyPressed
        // TODO add your handling code here:

        int key=evt.getKeyCode();
        if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)))
        {
            DepositText.setEditable(true);

        }
        else
        {JOptionPane.showMessageDialog(null, "Cannot type letters", "Wrong Input",JOptionPane.ERROR_MESSAGE);
            DepositText.setText("");
        }
    }//GEN-LAST:event_DepositTextKeyPressed

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
                      
            ObjectInputStream bin = null;
            
        try {
            bin = new ObjectInputStream (new FileInputStream("D://Guests.bin"));
            guests=(ArrayList<GuestInfo>)bin.readObject();
            
            for(int i=0;i<guests.size();i++)
            {
                
                if(guests.get(i).getRoomNum().equals(SearchText.getText()))
                {
                  
                    GuestInfo w = new GuestInfo();
                    w.setLName(LastNameText.getText());
                    w.setMName(MidNameText.getText());
                    w.setFName(firstNameText.getText());
                    w.setAge(AgeText.getText());
                    w.setAddress(AddressText.getText());
                    w.setIdNum(IDText.getText());
                    w.setGender((String)GenderCb.getSelectedItem());
                    w.setCheckIn(Checkinj.getDate());
                    w.setCheckOut(Checkoutj.getDate());
                    w.setRoomType((String)RoomTCb.getSelectedItem());
                    w.setAccType((String)AccCb.getSelectedItem());
                    w.setAdults((int)AdultsSpin.getValue());
                    w.setKids((int)KidsSpin.getValue());
                    w.setDeposit(Double.parseDouble(DepositText.getText()));
                    w.setAdults((int)AdultsSpin.getValue());
                    w.setVehicle((VehicleText.getText()));
                    w.setPlate((PlateText.getText()));
                    w.setExtraBed(guests.get(i).getExtraBed());
                    double a=1,b=1;
                    if((String)RoomTCb.getSelectedItem()=="Single")
                    {
                        a=700;
                    }
                    if((String)RoomTCb.getSelectedItem()=="Double")
                    {
                        a=600;
                    }
                    if((String)RoomTCb.getSelectedItem()=="Triple")
                    {
                        a=550;
                    }
                    if((String)AccCb.getSelectedItem()=="Half Board")
                    {
                        b=150;
                    }
                    if((String)AccCb.getSelectedItem()=="Full Board")
                    {
                        b=225;
                    }
                    if((String)AccCb.getSelectedItem()=="All Inclusive")
                    {
                        b=300;
                    }
                    if((String)AccCb.getSelectedItem()=="Bed and Breakfast")
                    {
                        b=75;
                    }
                    if((String)AccCb.getSelectedItem()=="Bed Only")
                    {
                        b=1;
                    }
                    if((String)AccCb.getSelectedItem()=="Day Use")
                    {
                        b=500;
                    }

                    Date d=new Date();
                    d=Checkoutj.getDate();
                    Date f = new Date();
                    f=Checkinj.getDate();
                    int days ;
                    days=(int)( (d.getTime() - f.getTime()) / (1000 * 60 * 60 * 24) );

                    w.setTotal(days*(a+b));
                    guests.set(i, w);
                    ObjectOutputStream e = new ObjectOutputStream (new FileOutputStream("D://Guests.bin"));
                    e.writeObject(guests);
                    e.close();
                    JOptionPane.showMessageDialog(null, "Saved", "Edit Guest",JOptionPane.ERROR_MESSAGE);
                    AfterLoginUI m = new AfterLoginUI("Grand Hotel");
                    m.setVisible(true);
                    setVisible(false);
                    m.setLocationRelativeTo(null);
                    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(EditGuestUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditGuestUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bin.close();
            } catch (IOException ex) {
                Logger.getLogger(EditGuestUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_EditbtnActionPerformed

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
            java.util.logging.Logger.getLogger(EditGuestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditGuestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditGuestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditGuestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new EditGuestUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AccCb;
    private javax.swing.JTextField AddressText;
    private javax.swing.JSpinner AdultsSpin;
    private javax.swing.JTextField AgeText;
    private javax.swing.JLabel Back;
    private com.toedter.calendar.JDateChooser Checkinj;
    private com.toedter.calendar.JDateChooser Checkoutj;
    private javax.swing.JTextField DepositText;
    private javax.swing.JButton Editbtn;
    private javax.swing.JComboBox GenderCb;
    private javax.swing.JLabel HomeNumLabel;
    private javax.swing.JTextField HomeNumText;
    private javax.swing.JTextField IDText;
    private javax.swing.JSpinner KidsSpin;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JTextField MidNameText;
    private javax.swing.JLabel PhoneNumLabel;
    private javax.swing.JTextField PhoneNumText;
    private javax.swing.JTextField PlateText;
    private javax.swing.JComboBox RoomTCb;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JTextField SearchText;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JTextField VehicleText;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
