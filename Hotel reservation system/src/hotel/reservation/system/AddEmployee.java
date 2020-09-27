/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
/**
 *
 * @author Fairuz
 */
public class AddEmployee extends JFrame {
    
            EmployeeInfo in = new EmployeeInfo();

    static ArrayList<EmployeeInfo> emp = new ArrayList<EmployeeInfo>();
    JTextField fullNameText = new JTextField();
    JTextField AddressText = new JTextField();
    JTextField IDText = new JTextField();
    JTextField HomeNumText=new JTextField();
    JTextField PhoneNumText=new JTextField();
    JComboBox GenderCb = new JComboBox(new String[]{"Male","Female"});
    JComboBox JobTitleCb = new JComboBox(new String[]{"Assistant Hotel Manager","Accounting","Bell Man","Bartender","Doctor","Event Planner","House Keeping","HR","Kitchen Manager"
            ,"Kitchen Staff","Life Guard","Marketing and Advertising","Purchasing","Receptionist","Restaurant Manager","Room Service","Security","Supervisor of Guest Services","Waiter/Waitress"});
    JDateChooser BirthJ = new JDateChooser();
     JLabel Back=new JLabel();

    
    public AddEmployee(String title) throws IOException
    {
        setTitle(title);
        setSize(2000,1000);
        setLayout(null);

        JLabel lbl=new JLabel(" New Employee Form ");
        JButton btn = new JButton("SAVE");
        JLabel fullNameLabel = new JLabel("Full Name");
        JLabel IDLabel = new JLabel(" National ID ");
        JLabel AddressLabel = new JLabel(" Address ");
        JLabel HomeNumLabel = new JLabel("Home Number");
        JLabel PhoneNumLabel=new JLabel("Mobile Number");
        JLabel GenderLabel = new JLabel(" Gender ");
        JLabel DOBLabel=new JLabel("Birth of Date");
        JLabel JobTitleLabel=new JLabel("Job Title");
        btn.setBounds(1700,850,130,80);
        btn.setBackground(Color.white);
        btn.setFont(new Font(" ", Font.PLAIN, 30));
        lbl.setBounds(800, 30, 500, 100);
        lbl.setFont(new Font(" ", Font.BOLD, 45));
        fullNameLabel.setBounds(70, 170, 300, 100);
        fullNameLabel.setFont(new Font(" ", Font.PLAIN, 30));
        fullNameText.setBounds(140,250,300,50);
        fullNameText.setFont(new Font(" ", Font.PLAIN, 20));
        IDLabel.setBounds(70, 320, 300, 100);
        IDLabel.setFont(new Font(" ", Font.PLAIN, 30));
        IDText.setBounds(140,390,300,50);
        IDText.setFont(new Font(" ", Font.PLAIN, 20));
        AddressLabel.setBounds(70, 460, 300, 100);
        AddressLabel.setFont(new Font(" ", Font.PLAIN, 30));
        AddressText.setBounds(140,530,300,50);
        AddressText.setFont(new Font(" ", Font.PLAIN, 20));
        HomeNumLabel.setBounds(750,170,300,100);
        HomeNumLabel.setFont(new Font(" ", Font.PLAIN, 30));
        HomeNumText.setBounds(800,240,300,50);
        HomeNumText.setFont(new Font(" ", Font.PLAIN, 20));
        PhoneNumLabel.setBounds(70,600,300,100);
        PhoneNumText.setBounds(140,670,300,50);
        PhoneNumLabel.setFont(new Font(" ", Font.PLAIN, 30));
        PhoneNumText.setFont(new Font(" ", Font.PLAIN, 20));
        GenderLabel.setBounds(750,460,300,100);
        GenderLabel.setFont(new Font(" ", Font.PLAIN, 30));
        GenderCb.setBounds(800,530,130,40);
        GenderCb.setFont(new Font(" ", Font.PLAIN, 25));
        DOBLabel.setBounds(750, 320, 300, 100);
        DOBLabel.setFont(new Font(" ", Font.PLAIN, 30));
        BirthJ.setBounds(800, 390, 300, 50);
        BirthJ.setFont(new Font(" ", Font.PLAIN, 20));
        JobTitleCb.setBounds(800,670,330,40);
        JobTitleCb.setFont(new Font(" ", Font.PLAIN, 25));
        JobTitleLabel.setBounds(750,600,300,100);
        JobTitleLabel.setFont(new Font(" ", Font.PLAIN, 30));
        Back.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Omar\\Desktop\\Hotel reservation system\\Back.png")
         .getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        Back.setBounds(20,20, 60, 60);
       
        
        add(fullNameLabel);
        add(fullNameText);
        add(IDLabel);
        add(IDText);
        add(AddressLabel);
        add(AddressText);
        add(lbl);
        add(btn);
        add(HomeNumLabel);
        add(HomeNumText);
        add(PhoneNumText);
        add(PhoneNumLabel);
        add(GenderLabel);
        add(GenderCb);        
        add(DOBLabel);     
        add(BirthJ);
        add(JobTitleCb);
        add(JobTitleLabel);
        add(Back);
        Back.addMouseListener(new ret()); 
        btn.addActionListener(new Action());
            
    }
    
    private class Action extends EmployeeInfo implements ActionListener, Serializable
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            in.setFullName(fullNameText.getText());
            in.setAddress(AddressText.getText());
            in.setID(IDText.getText());
            in.setHomeNum(HomeNumText.getText());
            in.setMobNum(PhoneNumText.getText());
            in.setGender((String) GenderCb.getSelectedItem());
            in.setJobTitle((String) JobTitleCb.getSelectedItem());
            in.setDOB(BirthJ.getDate());
            if (fullNameText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Name Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
           
            else if  (AddressText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Address Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            else if (IDText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "ID Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            else if (HomeNumText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Home Number Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            else if (PhoneNumText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Home Number Missing", "Empty Field",JOptionPane.ERROR_MESSAGE);
            }
            else  if(BirthJ.getDate() == null)
            {
              JOptionPane.showMessageDialog(null, "Please Choose a Date of Birth", "Empty Field",JOptionPane.ERROR_MESSAGE);

            }
            else
            {
            try {
                
                write();
                JOptionPane.showMessageDialog(null, " Form Saved! ");
                 AfterManagerUI m = new AfterManagerUI("Grand Hotel");
                    m.setLayout(new FlowLayout());
                    m.setVisible(true);
                    setVisible(false);
                    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
            } catch (IOException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
        }
        public void write() throws FileNotFoundException, IOException, ClassNotFoundException{
       
            ObjectInputStream readBin = new ObjectInputStream(new FileInputStream("D://Employees.bin"));
            emp=(ArrayList<EmployeeInfo>)readBin.readObject(); 
            emp.add(in);
            ObjectOutputStream bin = new ObjectOutputStream(new FileOutputStream("D://Employees.bin"));
            bin.writeObject(emp);
            bin.close();
        
        }
     
    }
           
    
     private class ret extends MouseAdapter implements MouseListener
     {
         @Override
         public void mouseClicked (MouseEvent e)
         {
            AfterManagerUI m = new AfterManagerUI("Grand Hotel");
            m.setLocationRelativeTo(null);
            m.setVisible(true);
            setVisible(false);
            m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
     }
    
}
