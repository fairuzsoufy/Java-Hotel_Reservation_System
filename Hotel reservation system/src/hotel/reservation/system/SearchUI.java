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
import javax.swing.JOptionPane;

/**
 *
 * @author Omar
 */
public class SearchUI extends javax.swing.JFrame implements Serializable {

    
    public SearchUI(String title) {
        initComponents();
        setTitle(title);
        firstNameText.setVisible(true);
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchText = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();
        SearchLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AccCb = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        Checkoutj = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        KidsSpin = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        AdultsSpin = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HomeNumLabel = new javax.swing.JLabel();
        PhoneNumLabel = new javax.swing.JLabel();
        RoomTCb = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        GenderCb = new javax.swing.JComboBox();
        Checkinj = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        IDText = new javax.swing.JLabel();
        firstNameText = new javax.swing.JLabel();
        MidNameText = new javax.swing.JLabel();
        LastNameText = new javax.swing.JLabel();
        AgeText = new javax.swing.JLabel();
        AddressText = new javax.swing.JLabel();
        PhoneNumText = new javax.swing.JLabel();
        HomeNumText = new javax.swing.JLabel();
        PlateText = new javax.swing.JLabel();
        VehicleText = new javax.swing.JLabel();
        DepositText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 900));
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

        jLabel11.setText("Check In Date");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 510, 79, 16);

        jLabel12.setText("Check Out Date");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 550, 88, 16);

        jLabel10.setText("Accomdation Type");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 630, 105, 16);

        jLabel1.setText("First Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 140, 62, 16);

        AccCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DayUse", "Half Board", "Full Board", "All Inclusive", "Bed and Breakfast", "Bed Only" }));
        getContentPane().add(AccCb);
        AccCb.setBounds(140, 620, 190, 30);

        jLabel14.setText("Gender");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 380, 41, 16);
        getContentPane().add(Checkoutj);
        Checkoutj.setBounds(140, 540, 190, 30);

        jLabel3.setText("Middle Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 180, 74, 16);
        getContentPane().add(KidsSpin);
        KidsSpin.setBounds(140, 690, 40, 22);

        jLabel7.setText("Adults");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 660, 60, 16);
        getContentPane().add(AdultsSpin);
        AdultsSpin.setBounds(140, 660, 40, 22);

        jLabel15.setText("Deposit");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 730, 60, 16);

        jLabel8.setText("Kids");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 690, 50, 20);

        jLabel17.setText("Plate No.");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 810, 51, 16);

        jLabel16.setText("Vehicle Model");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 770, 79, 16);

        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 220, 80, 16);

        jLabel5.setText("National ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 340, 62, 16);

        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 300, 70, 16);

        HomeNumLabel.setText("Home Number");
        getContentPane().add(HomeNumLabel);
        HomeNumLabel.setBounds(20, 470, 82, 16);

        PhoneNumLabel.setText("Phone Number");
        getContentPane().add(PhoneNumLabel);
        PhoneNumLabel.setBounds(20, 420, 84, 16);

        RoomTCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Double", "Triple" }));
        getContentPane().add(RoomTCb);
        RoomTCb.setBounds(140, 580, 190, 30);

        jLabel9.setText("Room Type");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 590, 65, 16);

        jLabel18.setText("Age");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 260, 30, 16);

        GenderCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(GenderCb);
        GenderCb.setBounds(140, 370, 100, 30);
        getContentPane().add(Checkinj);
        Checkinj.setBounds(140, 500, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Search Guest");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 10, 240, 90);

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
    getContentPane().add(IDText);
    IDText.setBounds(140, 330, 130, 30);
    getContentPane().add(firstNameText);
    firstNameText.setBounds(140, 130, 130, 30);
    getContentPane().add(MidNameText);
    MidNameText.setBounds(140, 170, 130, 30);
    getContentPane().add(LastNameText);
    LastNameText.setBounds(140, 210, 130, 30);
    getContentPane().add(AgeText);
    AgeText.setBounds(140, 250, 130, 30);
    getContentPane().add(AddressText);
    AddressText.setBounds(140, 290, 130, 30);
    getContentPane().add(PhoneNumText);
    PhoneNumText.setBounds(140, 420, 130, 30);
    getContentPane().add(HomeNumText);
    HomeNumText.setBounds(140, 460, 130, 30);
    getContentPane().add(PlateText);
    PlateText.setBounds(140, 800, 130, 30);
    getContentPane().add(VehicleText);
    VehicleText.setBounds(140, 760, 130, 30);
    getContentPane().add(DepositText);
    DepositText.setBounds(140, 720, 130, 30);

    pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        
       
        try {
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

                    }
                }

            }
            else
            {
                JOptionPane.showMessageDialog( null, "Wrong");

            }
        } catch (IOException ex) {
            Logger.getLogger(SearchUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        

    }//GEN-LAST:event_SearchbtnActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        AfterLoginUI m = new AfterLoginUI("Grand Hotel");
        m.setVisible(true);
        setVisible(false);
       // m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(SearchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new SearchUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AccCb;
    private javax.swing.JLabel AddressText;
    private javax.swing.JSpinner AdultsSpin;
    private javax.swing.JLabel AgeText;
    private javax.swing.JLabel Back;
    private com.toedter.calendar.JDateChooser Checkinj;
    private com.toedter.calendar.JDateChooser Checkoutj;
    private javax.swing.JLabel DepositText;
    private javax.swing.JComboBox GenderCb;
    private javax.swing.JLabel HomeNumLabel;
    private javax.swing.JLabel HomeNumText;
    private javax.swing.JLabel IDText;
    private javax.swing.JSpinner KidsSpin;
    private javax.swing.JLabel LastNameText;
    private javax.swing.JLabel MidNameText;
    private javax.swing.JLabel PhoneNumLabel;
    private javax.swing.JLabel PhoneNumText;
    private javax.swing.JLabel PlateText;
    private javax.swing.JComboBox RoomTCb;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JTextField SearchText;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JLabel VehicleText;
    private javax.swing.JLabel firstNameText;
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
