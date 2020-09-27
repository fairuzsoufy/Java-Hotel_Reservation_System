/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
public class AddGuestUI extends JFrame implements Serializable{

   
     GuestInfo in = new GuestInfo();
    static ArrayList<GuestInfo> guests = new ArrayList<GuestInfo>();
    
    public AddGuestUI(String title) {
        setTitle(title);

        //btn.addActionListener(new AddGuestUI.Action());
        initComponents();
        singleCb.setVisible(false);
        doubleCb.setVisible(false);
        tripleCb.setVisible(false);
        secondCompanionText.setVisible(false);
        firstCompanionText.setVisible(false);
        secondCompanionField.setVisible(false);
        firstCompanionField.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VehicleText = new javax.swing.JTextField();
        MidNameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LastNameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IDText = new javax.swing.JTextField();
        AddressText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        HomeNumLabel = new javax.swing.JLabel();
        PhoneNumText = new javax.swing.JTextField();
        HomeNumText = new javax.swing.JTextField();
        PhoneNumLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RoomTCb = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        AccCb = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Checkinj = new com.toedter.calendar.JDateChooser();
        Checkoutj = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        AdultsSpin = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        KidsSpin = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        PlateText = new javax.swing.JTextField();
        DepositText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        AgeText = new javax.swing.JTextField();
        btn = new javax.swing.JButton();
        Back = new javax.swing.JLabel();
        GenderCb = new javax.swing.JComboBox();
        RoomNoLabel = new javax.swing.JLabel();
        singleCb = new javax.swing.JComboBox();
        doubleCb = new javax.swing.JComboBox();
        tripleCb = new javax.swing.JComboBox();
        firstCompanionText = new javax.swing.JLabel();
        firstCompanionField = new javax.swing.JTextField();
        secondCompanionText = new javax.swing.JLabel();
        secondCompanionField = new javax.swing.JTextField();

        jLabel13.setText("Check Out Date");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(993, 690));

        jLabel1.setText("First Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setText("Add Guest");

        VehicleText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        VehicleText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VehicleTextKeyPressed(evt);
            }
        });

        MidNameText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        MidNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MidNameTextKeyPressed(evt);
            }
        });

        jLabel3.setText("Middle Name");

        LastNameText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LastNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LastNameTextKeyPressed(evt);
            }
        });

        jLabel4.setText("Last Name");

        jLabel5.setText("National ID");

        IDText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        IDText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDTextKeyPressed(evt);
            }
        });

        AddressText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        AddressText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AddressTextKeyPressed(evt);
            }
        });

        jLabel6.setText("Address");

        HomeNumLabel.setText("Home Number");

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

        HomeNumText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        HomeNumText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HomeNumTextKeyPressed(evt);
            }
        });

        PhoneNumLabel.setText("Phone Number");

        jLabel9.setText("Room Type");

        RoomTCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Single", "Double", "Triple" }));
        RoomTCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomTCbActionPerformed(evt);
            }
        });
        RoomTCb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RoomTCbKeyPressed(evt);
            }
        });

        jLabel10.setText("Accomdation Type");

        AccCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Half Board", "Full Board", "All Inclusive", "Bed and Breakfast", "Bed Only", "Day Use" }));

        jLabel11.setText("Check In Date");

        jLabel12.setText("Check Out Date");

        jLabel14.setText("Gender");

        jLabel7.setText("Adults");

        jLabel8.setText("Kids");

        jLabel15.setText("Deposit");

        jLabel16.setText("Vehicle Model");

        jLabel17.setText("Plate No.");

        firstNameText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        firstNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameTextKeyPressed(evt);
            }
        });

        PlateText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PlateText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlateTextKeyPressed(evt);
            }
        });

        DepositText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        DepositText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DepositTextKeyPressed(evt);
            }
        });

        jLabel18.setText("Age");

        AgeText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        AgeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeTextKeyPressed(evt);
            }
        });

        btn.setText("SAVE");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        Back.setText("");
        Back.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Omar\\Desktop\\Hotel reservation system\\Back.png")
            .getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
    Back.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            BackMouseClicked(evt);
        }
    });

    GenderCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

    RoomNoLabel.setText("RoomNo.");

    singleCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "100", "101", "102", "103", "104", "105", "106" }));
    singleCb.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            singleCbActionPerformed(evt);
        }
    });
    singleCb.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            singleCbKeyPressed(evt);
        }
    });

    doubleCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "200", "201", "202", "203", "204", "205", "206" }));
    doubleCb.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            doubleCbActionPerformed(evt);
        }
    });
    doubleCb.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            doubleCbKeyPressed(evt);
        }
    });

    tripleCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "300", "301", "302", "303", "304", "305", "306" }));
    tripleCb.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tripleCbActionPerformed(evt);
        }
    });
    tripleCb.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tripleCbKeyPressed(evt);
        }
    });

    firstCompanionText.setText("First companion");

    firstCompanionField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
    firstCompanionField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            firstCompanionFieldKeyPressed(evt);
        }
    });

    secondCompanionText.setText("Second companion");

    secondCompanionField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
    secondCompanionField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            secondCompanionFieldKeyPressed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(76, 76, 76)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Checkinj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MidNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HomeNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HomeNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomTCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PhoneNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PhoneNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Checkoutj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(AdultsSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(54, 54, 54)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(KidsSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(secondCompanionText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(secondCompanionField))
                        .addComponent(firstCompanionText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RoomNoLabel)
                                    .addGap(67, 67, 67))
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(firstCompanionField)
                                .addComponent(PlateText, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(VehicleText)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(singleCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(doubleCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tripleCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(DepositText))))))
            .addGap(0, 212, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(Back)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(363, 363, 363))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AdultsSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(KidsSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13))
                .addGroup(layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(VehicleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(RoomNoLabel))
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(PlateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(singleCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doubleCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tripleCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(47, 47, 47)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(DepositText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(19, 19, 19)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(firstCompanionField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(firstCompanionText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(secondCompanionText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(secondCompanionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(226, 226, 226)
            .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addGap(92, 92, 92)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(firstNameText))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(MidNameText))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(LastNameText))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(AgeText))
            .addGap(3, 3, 3)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(IDText))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(AddressText))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(HomeNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(HomeNumText))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(PhoneNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(PhoneNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(RoomTCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(AccCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addComponent(Checkinj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addComponent(Checkoutj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(91, 91, 91))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
       

            in.setFName(firstNameText.getText());
            in.setMName(MidNameText.getText());
            in.setLName(LastNameText.getText());      
            in.setAddress(AddressText.getText());
            in.setGender((String) GenderCb.getSelectedItem());
            if((String)RoomTCb.getSelectedItem()==("Single"))
            {
                in.setRoomNum((String)singleCb.getSelectedItem());
            }
            if((String)RoomTCb.getSelectedItem()==("Double"))
            {
                in.setRoomNum((String)doubleCb.getSelectedItem());
                in.setFirstComp(firstCompanionField.getText());
            }
            if((String)RoomTCb.getSelectedItem()==("Triple"))
            {
                in.setRoomNum((String)tripleCb.getSelectedItem());
                in.setFirstComp(firstCompanionField.getText());
                in.setSecondComp(secondCompanionField.getText());
            }
            in.setIdNum(IDText.getText());
            in.setHomeNum(HomeNumText.getText());
            in.setPhoneNum(PhoneNumText.getText());           
            in.setKids((int) KidsSpin.getValue());
            in.setAdults((int) AdultsSpin.getValue());
            in.setAccType((String) AccCb.getSelectedItem());
            in.setIdNum(IDText.getText());
            in.setCheckIn(Checkinj.getDate());
            in.setCheckOut(Checkoutj.getDate());
            in.setAge(AgeText.getText());
            in.setDeposit(Double.parseDouble(DepositText.getText()));
            in.setRoomType((String)RoomTCb.getSelectedItem());
            in.setExtraBed(0);
            
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
                b=0;
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
        
            in.setTotal(days*(a+b));
            
            if(((String) AccCb.getSelectedItem()).equals("DayUse"))
            {
                if(!Checkoutj.getDate().equals(Checkinj.getDate()))
                {
                    JOptionPane.showMessageDialog(null,"You Choose DAYUSE !! so CheckOut day is same as CheckIn");
                }
                Checkoutj.getDate().equals(Checkinj.getDate());
                in.setCheckIn(Checkinj.getDate());
                in.setCheckOut(Checkoutj.getDate());
                
               
                try
            {
                
            if(Double.parseDouble(DepositText.getText())>days*(a+b))
                throw new ExceptionClass();
            }
            catch(ExceptionClass e)
                    {
                         JOptionPane.showMessageDialog(null, "Deposit is bigger than Total cheque", "Error",JOptionPane.ERROR_MESSAGE);
                    }
            }
            if  (DepositText.getText().isEmpty())
            {
                in.setDeposit(0.0);
            }
            
            if (firstNameText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "First Name Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            else if(AgeText.getText().isEmpty())
            {
              JOptionPane.showMessageDialog(null, "Age is Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);

            }
            else if ((String)RoomTCb.getSelectedItem()==(""))
            {
                JOptionPane.showMessageDialog(null, "Must choose Room Type", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            else if(Integer.parseInt(AgeText.getText())<18)
            {
              JOptionPane.showMessageDialog(null, "Age is less than 18", "Error",JOptionPane.ERROR_MESSAGE);

            }
            else if(Integer.parseInt(AgeText.getText())>99)
            {
              JOptionPane.showMessageDialog(null, "Age is abnormal", "Error",JOptionPane.ERROR_MESSAGE);

            }
           
            else if  (MidNameText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Middle Name Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            
            else if (LastNameText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Last Name Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            else if( AdultsSpin.getValue().equals(0))
            {
                JOptionPane.showMessageDialog(null, "Must add 1 Adult at least", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            else if (IDText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Age Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            
            
            else if (IDText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "ID Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            
            else if (AddressText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Address Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            
            
            else if (HomeNumText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Home Number Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            else if (PhoneNumText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Phone Number Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            } 
            
            else  if(Checkinj.getDate() == null)
            {
              JOptionPane.showMessageDialog(null, "Please Choose a check in day", "Empty Field",JOptionPane.ERROR_MESSAGE);

            }
                    
            else if(Checkoutj.getDate() == null)
            {
              JOptionPane.showMessageDialog(null, "Please Choose a check out day", "Empty Field",JOptionPane.ERROR_MESSAGE);

            }
                  
            else if
                    (Checkoutj.getDate().before(Checkinj.getDate()))
            {
                JOptionPane.showMessageDialog(null, "CheckOut Day Is Before CheckIn Day", "Error",JOptionPane.ERROR_MESSAGE);
            }
            
            
            
          
               
            
            
     
             else{
            
                
                   
                    
                try {
                    write();
                    JOptionPane.showMessageDialog(null, " Form Saved! ");
                    AfterLoginUI afterl = new AfterLoginUI("Grand Hotel");
                    afterl.setVisible(true);
                    setVisible(false);
                    afterl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } catch (IOException ex) {
                    Logger.getLogger(AddGuestUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddGuestUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
             }
        }
         public void write() throws FileNotFoundException, IOException, ClassNotFoundException{
       
//            ObjectInputStream i = new ObjectInputStream(new FileInputStream("D://Guests.bin"));
//            guests=(ArrayList<GuestInfo>)i.readObject(); 
            guests.add(in);
            ObjectOutputStream bin = new ObjectOutputStream(new FileOutputStream("D://Guests.bin"));
            bin.writeObject(guests);
            bin.close();
        
        
       
        
       
    
    }//GEN-LAST:event_btnActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
         AfterLoginUI m = new AfterLoginUI("Grand Hotel");
                        m.setVisible(true);
                        setVisible(false);
                        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_BackMouseClicked

    private void AgeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeTextKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        
        if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9||key==evt.VK_BACK_SPACE||key==evt.VK_ENTER)))
    {
         AgeText.setEditable(true);
       
    }
    else
    {JOptionPane.showMessageDialog(null, "Cannot type letters", "Wrong Input",JOptionPane.ERROR_MESSAGE);
        AgeText.setText("");
       
    }
    
    
    

    
    }//GEN-LAST:event_AgeTextKeyPressed

    private void IDTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTextKeyPressed

        // TODO add your handling code here:
             int key=evt.getKeyCode();
        
        if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9||key==evt.VK_ENTER||key==evt.VK_BACK_SPACE)))
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

    private void PhoneNumTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumTextKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
                if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9||key==evt.VK_BACK_SPACE||key==evt.VK_ENTER)))
    {
         PhoneNumText.setEditable(true);
       
    }
    else
    {JOptionPane.showMessageDialog(null, "Cannot type letters", "Wrong Input",JOptionPane.ERROR_MESSAGE);
        PhoneNumText.setText("");
       
    }

    }//GEN-LAST:event_PhoneNumTextKeyPressed

    private void PhoneNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumTextActionPerformed

    private void HomeNumTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HomeNumTextKeyPressed
        // TODO add your handling code here:
        
        int key=evt.getKeyCode();
                if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9||key==evt.VK_BACK_SPACE||key==evt.VK_ENTER)))
    {
         HomeNumText.setEditable(true);
       
    }
    else
    {JOptionPane.showMessageDialog(null, "Cannot type letters", "Wrong Input",JOptionPane.ERROR_MESSAGE);
        HomeNumText.setText("");
    }
    }//GEN-LAST:event_HomeNumTextKeyPressed

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

    private void DepositTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DepositTextKeyPressed
        // TODO add your handling code here:
         
        int key=evt.getKeyCode();
                if(((key>=evt.VK_0&&key<=evt.VK_9||key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9||key==evt.VK_BACK_SPACE||key==evt.VK_PERIOD)))
    {
         DepositText.setEditable(true);
       
    }
    else
    {JOptionPane.showMessageDialog(null, "Cannot type letters", "Wrong Input",JOptionPane.ERROR_MESSAGE);
        DepositText.setText("");
    }
    }//GEN-LAST:event_DepositTextKeyPressed

    private void RoomTCbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RoomTCbKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_RoomTCbKeyPressed

    private void RoomTCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomTCbActionPerformed
        // TODO add your handling code here:
        if((String)RoomTCb.getSelectedItem()==("Single"))
        {
            singleCb.setVisible(true);
            doubleCb.setVisible(false);
            tripleCb.setVisible(false);
            firstCompanionText.setVisible(false);
            secondCompanionText.setVisible(false);
            firstCompanionField.setVisible(false);
            secondCompanionField.setVisible(false);
        }
        if((String)RoomTCb.getSelectedItem()==("Double"))
        {
            singleCb.setVisible(false);
            doubleCb.setVisible(true);
            tripleCb.setVisible(false);
            firstCompanionText.setVisible(true);
            firstCompanionField.setVisible(true);
            secondCompanionText.setVisible(false);
            secondCompanionField.setVisible(false
            );
            
        }
        if((String)RoomTCb.getSelectedItem()==("Triple"))
        {
            singleCb.setVisible(false);
            doubleCb.setVisible(false);
            tripleCb.setVisible(true);
            secondCompanionText.setVisible(true);
            firstCompanionText.setVisible(true);
            secondCompanionField.setVisible(true);
            firstCompanionField.setVisible(true);
        }
    }//GEN-LAST:event_RoomTCbActionPerformed

    private void firstCompanionFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstCompanionFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCompanionFieldKeyPressed

    private void secondCompanionFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secondCompanionFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondCompanionFieldKeyPressed

    private void singleCbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_singleCbKeyPressed
       
        
    }//GEN-LAST:event_singleCbKeyPressed

    private void doubleCbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doubleCbKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_doubleCbKeyPressed

    private void tripleCbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tripleCbKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tripleCbKeyPressed

    private void singleCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleCbActionPerformed
//         
//          try {
//             if(search((String)singleCb.getSelectedItem())==true)
//             {
//                 JOptionPane.showMessageDialog(null, "Already Booked", "Invalid",JOptionPane.ERROR_MESSAGE);
//             }
//             else 
//             {
//             }
//             } catch (IOException ex) {
//             Logger.getLogger(AddGuestUI.class.getName()).log(Level.SEVERE, null, ex);
//         } catch (ClassNotFoundException ex) {
//             Logger.getLogger(AddGuestUI.class.getName()).log(Level.SEVERE, null, ex);
//         }
    }//GEN-LAST:event_singleCbActionPerformed

    private void doubleCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleCbActionPerformed
//
//        try {
//             if(search((String)doubleCb.getSelectedItem())==true)
//             {
//                 JOptionPane.showMessageDialog(null, "Already Booked", "Invalid",JOptionPane.ERROR_MESSAGE);
//             }
//             else
//             {
//             }} catch (IOException ex) {
//             Logger.getLogger(AddGuestUI.class.getName()).log(Level.SEVERE, null, ex);
//         } catch (ClassNotFoundException ex) {
//             Logger.getLogger(AddGuestUI.class.getName()).log(Level.SEVERE, null, ex);
//         }
    }//GEN-LAST:event_doubleCbActionPerformed

    private void tripleCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tripleCbActionPerformed
       
//         try {
//             if(search((String)tripleCb.getSelectedItem())==true)
//             {
//                 JOptionPane.showMessageDialog(null, "Already Booked", "Invalid",JOptionPane.ERROR_MESSAGE);
//             }
//             else
//             {
//                
//             }} catch (IOException ex) {
//             Logger.getLogger(AddGuestUI.class.getName()).log(Level.SEVERE, null, ex);
//         } catch (ClassNotFoundException ex) {
//             Logger.getLogger(AddGuestUI.class.getName()).log(Level.SEVERE, null, ex);
//         }
    }//GEN-LAST:event_tripleCbActionPerformed

//    boolean search(String  name) throws FileNotFoundException, IOException, ClassNotFoundException{
//        
//   
//        boolean found = false;
//        ObjectInputStream file = new ObjectInputStream(new FileInputStream("D://Guests.bin"));
//        guests=(ArrayList<GuestInfo>)file.readObject(); 
//        
//      
//        for(int i=0;i<guests.size();i++)
//        {
//            if(guests.get(i).getRoomNum().equals(name)) 
//            { 
//                found=true;
//                
//            }
//        }
//         
//
//        if(found==true)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//        
//    
//    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new AddGuestUI().setVisible(true);
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
    private javax.swing.JLabel RoomNoLabel;
    private javax.swing.JComboBox RoomTCb;
    private javax.swing.JTextField VehicleText;
    private javax.swing.JButton btn;
    private javax.swing.JComboBox doubleCb;
    private javax.swing.JTextField firstCompanionField;
    private javax.swing.JLabel firstCompanionText;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField secondCompanionField;
    private javax.swing.JLabel secondCompanionText;
    private javax.swing.JComboBox singleCb;
    private javax.swing.JComboBox tripleCb;
    // End of variables declaration//GEN-END:variables
}
