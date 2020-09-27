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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar
 */
public class CheckOutUI extends javax.swing.JFrame {

   
    public CheckOutUI(String title) {
        initComponents();
        setTitle(title);
        firstLabel.setVisible(false);
        lastLabel.setVisible(false);
        inLabel.setVisible(false);
        outLabel.setVisible(false);
        accLabel.setVisible(false);
        extraBedLabel.setVisible(false);
        subTotalLabel.setVisible(false);
        depositLabel.setVisible(false);
        discountLabel.setVisible(false);
        totalLabel.setVisible(false);
        inField.setVisible(false);
        outField.setVisible(false);
        checkOutBtn.setVisible(false);
        roomTypeLabel.setVisible(false);
        extraBedField.setVisible(false);
        extraBedLabel.setVisible(false);
        HotelNameText.setVisible(false);
        HotelMail.setVisible(false);
        HotelAddress.setVisible(false);
        HotelLine.setVisible(false);
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel6.setVisible(false);
        jLabel8.setVisible(false);
    }

    ArrayList<GuestInfo> guests = new ArrayList<GuestInfo>();
    HotelInfo in = new HotelInfo();
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lastLabel = new javax.swing.JLabel();
        firstLabel = new javax.swing.JLabel();
        accLabel = new javax.swing.JLabel();
        discountLabel = new javax.swing.JLabel();
        subTotalLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        lastField = new javax.swing.JLabel();
        accField = new javax.swing.JLabel();
        depositField = new javax.swing.JLabel();
        discountField = new javax.swing.JLabel();
        subTotalField = new javax.swing.JLabel();
        totalField = new javax.swing.JLabel();
        checkOutBtn = new javax.swing.JButton();
        inLabel = new javax.swing.JLabel();
        outLabel = new javax.swing.JLabel();
        outField = new com.toedter.calendar.JDateChooser();
        inField = new com.toedter.calendar.JDateChooser();
        depositLabel = new javax.swing.JLabel();
        firstField = new javax.swing.JLabel();
        inDate = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        SearchText = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();
        SearchLabel = new javax.swing.JLabel();
        roomTypeField = new javax.swing.JLabel();
        extraBedLabel = new javax.swing.JLabel();
        roomTypeLabel = new javax.swing.JLabel();
        extraBedField = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HotelNameText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HotelAddress = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HotelLine = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        HotelMail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(825, 582));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Check Out");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 20, 130, 40);

        lastLabel.setText("Last Name:");
        getContentPane().add(lastLabel);
        lastLabel.setBounds(30, 120, 80, 16);

        firstLabel.setText("First Name:");
        getContentPane().add(firstLabel);
        firstLabel.setBounds(30, 90, 70, 16);

        accLabel.setText("Accomodation Type");
        getContentPane().add(accLabel);
        accLabel.setBounds(30, 210, 120, 20);

        discountLabel.setText("Discount");
        getContentPane().add(discountLabel);
        discountLabel.setBounds(30, 340, 60, 16);

        subTotalLabel.setText("Sub-Total");
        getContentPane().add(subTotalLabel);
        subTotalLabel.setBounds(30, 310, 56, 16);

        totalLabel.setText("Total");
        getContentPane().add(totalLabel);
        totalLabel.setBounds(30, 370, 41, 16);
        getContentPane().add(lastField);
        lastField.setBounds(130, 120, 140, 20);
        getContentPane().add(accField);
        accField.setBounds(160, 210, 100, 20);
        getContentPane().add(depositField);
        depositField.setBounds(130, 270, 90, 20);
        getContentPane().add(discountField);
        discountField.setBounds(140, 340, 70, 20);
        getContentPane().add(subTotalField);
        subTotalField.setBounds(140, 310, 80, 20);
        getContentPane().add(totalField);
        totalField.setBounds(140, 370, 70, 20);

        checkOutBtn.setText("CheckOut");
        checkOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(checkOutBtn);
        checkOutBtn.setBounds(280, 410, 120, 30);

        inLabel.setText("Check In Date:");
        getContentPane().add(inLabel);
        inLabel.setBounds(30, 150, 90, 16);

        outLabel.setText("Check Out Date:");
        getContentPane().add(outLabel);
        outLabel.setBounds(30, 180, 100, 16);
        getContentPane().add(outField);
        outField.setBounds(140, 180, 120, 22);
        getContentPane().add(inField);
        inField.setBounds(140, 150, 120, 22);

        depositLabel.setText("Deposit");
        getContentPane().add(depositLabel);
        depositLabel.setBounds(30, 270, 60, 20);
        getContentPane().add(firstField);
        firstField.setBounds(130, 90, 150, 20);
        getContentPane().add(inDate);
        inDate.setBounds(490, 130, 0, 0);

        Back.setText("");
        Back.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Omar\\Desktop\\Hotel reservation system\\Back.png")
            .getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
    Back.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            BackMouseClicked(evt);
        }
    });
    getContentPane().add(Back);
    Back.setBounds(0, 0, 77, 40);
    getContentPane().add(SearchText);
    SearchText.setBounds(100, 80, 140, 30);

    Searchbtn.setText("Search");
    Searchbtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            SearchbtnActionPerformed(evt);
        }
    });
    getContentPane().add(Searchbtn);
    Searchbtn.setBounds(120, 120, 90, 25);

    SearchLabel.setText("Search With Room No.");
    getContentPane().add(SearchLabel);
    SearchLabel.setBounds(100, 60, 150, 20);
    getContentPane().add(roomTypeField);
    roomTypeField.setBounds(130, 240, 90, 20);

    extraBedLabel.setText("Extra Bed");
    getContentPane().add(extraBedLabel);
    extraBedLabel.setBounds(330, 90, 80, 20);

    roomTypeLabel.setText("Room Type");
    getContentPane().add(roomTypeLabel);
    roomTypeLabel.setBounds(30, 240, 80, 20);
    getContentPane().add(extraBedField);
    extraBedField.setBounds(400, 90, 80, 20);

    jLabel2.setText("Hotel:");
    getContentPane().add(jLabel2);
    jLabel2.setBounds(400, 180, 34, 16);
    getContentPane().add(HotelNameText);
    HotelNameText.setBounds(510, 176, 170, 30);

    jLabel4.setText("Hotel Address");
    getContentPane().add(jLabel4);
    jLabel4.setBounds(380, 220, 90, 16);
    getContentPane().add(HotelAddress);
    HotelAddress.setBounds(500, 210, 320, 30);

    jLabel6.setText("Hot Line");
    getContentPane().add(jLabel6);
    jLabel6.setBounds(390, 250, 60, 16);
    getContentPane().add(HotelLine);
    HotelLine.setBounds(510, 240, 170, 30);

    jLabel8.setText("Email");
    getContentPane().add(jLabel8);
    jLabel8.setBounds(390, 280, 60, 16);
    getContentPane().add(HotelMail);
    HotelMail.setBounds(500, 270, 170, 30);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    
    boolean search(String  room) throws FileNotFoundException, IOException, ClassNotFoundException{
        
   
        boolean found = false;
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("D://Guests.bin"));
        guests=(ArrayList<GuestInfo>)file.readObject(); 
        for(int i=0;i<guests.size();i++)
        { 
            if(guests.get(i).getRoomNum().equals(room)) 
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
    
    
    private void checkOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutBtnActionPerformed
        
        try {
            rem(SearchText.getText());
            JOptionPane.showMessageDialog( null, "Guest checked Out");
            AfterLoginUI m = new AfterLoginUI("Grand Hotel");
            m.setVisible(true);
            setVisible(false);
            m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        } catch (IOException ex) {
            Logger.getLogger(CheckOutUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CheckOutUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_checkOutBtnActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        AfterLoginUI m = new AfterLoginUI("Grand Hotel");
        m.setVisible(true);
        setVisible(false);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_BackMouseClicked

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        try {
            // TODO add your handling code here:

            if(search(SearchText.getText())==true)
            {

                for(int i=0;i<guests.size();i++)
                {
                    if(guests.get(i).getRoomNum().equals(SearchText.getText()))
                    {

                        firstField.setText(guests.get(i).getFName());
                        lastField.setText(guests.get(i).getLName());
                        inField.setDate(guests.get(i).getCheckIn());
                        outField.setDate(guests.get(i).getCheckOut());
                        roomTypeField.setText(guests.get(i).getRoomType());
                        accField.setText(guests.get(i).getAccType());
                        depositField.setText(Double.toString(guests.get(i).getDeposit()));
                        totalField.setText(Double.toString((guests.get(i).getTotal())+guests.get(i).getExtraBed()-guests.get(i).getDeposit()));
                        extraBedField.setText((Double.toString(guests.get(i).getExtraBed())));
                        HotelNameText.setText(in.getHotelName());
                        HotelMail.setText(in.getEmail());
                        HotelLine.setText(in.getHotline());
                        HotelAddress.setText(in.getHotelAddress());
                        SearchLabel.setVisible(false);
                        SearchText.setVisible(false);
                        Searchbtn.setVisible(false);
                        firstLabel.setVisible(true);
                        lastLabel.setVisible(true);
                        inLabel.setVisible(true);
                        outLabel.setVisible(true);
                        accLabel.setVisible(true);
                        HotelNameText.setVisible(true);
                        HotelMail.setVisible(true);
                        HotelAddress.setVisible(true);
                        HotelLine.setVisible(true);
                        subTotalLabel.setVisible(true);
                        depositLabel.setVisible(true);
                        discountLabel.setVisible(true);
                        totalLabel.setVisible(true);
                        inField.setVisible(true);
                        outField.setVisible(true);
                        checkOutBtn.setVisible(true);
                        extraBedField.setVisible(true);
                        extraBedLabel.setVisible(true);
                        if(guests.get(i).getExtraBed()==0.0)
                        {
                            extraBedField.setVisible(false);
                        extraBedLabel.setVisible(false);
                        }
                        roomTypeLabel.setVisible(true);
                        jLabel2.setVisible(true);
                        jLabel4.setVisible(true);
                        jLabel6.setVisible(true);
                        jLabel8.setVisible(true);
                        

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

    
   public void rem(String number) throws IOException, ClassNotFoundException {
     try
     {
               
                ObjectInputStream bin = new ObjectInputStream(new FileInputStream("D://Guests.bin"));
                guests=(ArrayList<GuestInfo>)bin.readObject();
                boolean found = false;
      
                for(int i=0;i<guests.size();i++)
                    
                {
                    if(guests.get(i).getRoomNum().equals(number))
                    {
                        guests.remove(i);
                        
                        found=true;
                        ObjectOutputStream x = new ObjectOutputStream( new FileOutputStream("D://Guests.bin"));
                        x.writeObject(guests);
                        x.close();
                    }
                    
                    
                }
                if(found==true)
                {
                    JOptionPane.showMessageDialog( null, "Process done");
                }
               
               
                
     }
     catch(Exception e){
          System.out.println(e);
   
                
                
}
   }
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CheckOutUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel HotelAddress;
    private javax.swing.JLabel HotelLine;
    private javax.swing.JLabel HotelMail;
    private javax.swing.JLabel HotelNameText;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JTextField SearchText;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JLabel accField;
    private javax.swing.JLabel accLabel;
    private javax.swing.JButton checkOutBtn;
    private javax.swing.JLabel depositField;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JLabel discountField;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JLabel extraBedField;
    private javax.swing.JLabel extraBedLabel;
    private javax.swing.JLabel firstField;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JLabel inDate;
    private com.toedter.calendar.JDateChooser inField;
    private javax.swing.JLabel inLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lastField;
    private javax.swing.JLabel lastLabel;
    private com.toedter.calendar.JDateChooser outField;
    private javax.swing.JLabel outLabel;
    private javax.swing.JLabel roomTypeField;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JLabel subTotalField;
    private javax.swing.JLabel subTotalLabel;
    private javax.swing.JLabel totalField;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
