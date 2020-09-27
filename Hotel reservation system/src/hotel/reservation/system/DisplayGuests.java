
package hotel.reservation.system;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DisplayGuests extends JFrame implements Serializable{

    ArrayList<GuestInfo> guests = new ArrayList<GuestInfo>();
    
    Object[]Columns={"FirstName","MiddleName","Age","Room NO."};
    Object[]rows=new Object[4];
    DefaultTableModel model = new DefaultTableModel();
    JTable table=new JTable();
    
    
   public DisplayGuests(String title)
   {
       JButton btn = new JButton("Display");
       setTitle(title);
       setSize(1000,1000);
       setLayout( null);
       model.setColumnIdentifiers(Columns);
        table.setModel(model);
        table.setBackground(Color.lightGray);
        table.setForeground(Color.white);
        table.setRowHeight(100);
       // table.setSize(900, 300);
        table.setFont(new Font("",1,22));
        table.setBounds(20, 20, 700, 700);
        
        btn.setBounds(500,500,100,80);
        
        add(table);
        table.setVisible(false);
        add(btn);
        btn.addActionListener(new Action());
   }
    private class Action extends EmployeeInfo implements ActionListener, Serializable
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
                ObjectInputStream bin = null;
            try {
                //guests=null;
                bin = new ObjectInputStream(new FileInputStream("D://Guests.bin"));
                guests=(ArrayList<GuestInfo>)bin.readObject();
                for(int i=0;guests.size()>i;i++)
                    
                {
                    
                    rows[0]=guests.get(i).getFName();
                    rows[1]=guests.get(i).getMName();
                    rows[2]=guests.get(i).getAge();
                    rows[3]=guests.get(i).getAddress();
                    model.addRow(rows);
                    table.setVisible(true);
                    
                }   } catch (IOException ex) {
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
    
    public void in() {
      try{
                
                guests=null;
                ObjectInputStream bin = new ObjectInputStream(new FileInputStream("D://Guests.bin"));
                guests=(ArrayList<GuestInfo>)bin.readObject();
      
                for(int i=0;guests.size()>i;i++)
                    
                {
                    
                     rows[0]=guests.get(i).getFName();
                     rows[1]=guests.get(i).getMName();
                     rows[2]=guests.get(i).getAge();
                     rows[3]=guests.get(i).getAddress();
                    model.addRow(rows);
                }
                
                
                
      }catch(Exception e){
          System.out.println(e);
      }
                
                
}

     public void del(int roomNum) {
      try{
                ArrayList<GuestInfo> guests = new ArrayList<GuestInfo>();
                ObjectInputStream bin = new ObjectInputStream(new FileInputStream("D://Guests.bin"));
                guests=(ArrayList<GuestInfo>)bin.readObject();
                boolean found = false;
                for(int i=0;guests.size()>i;i++)
                    
                {
                    if(guests.get(i).getRoomNum().equals(roomNum))
                    {
                        found=true;
                        guests.remove(guests.get(i).getLName());
                        // we ytl3lo panel eny etmsah
                    }
                    
                     
                    
                }
                
                if(found=true)
                {
                    //pannel eno deleted
                }
                else
                {
                    //panell msh mawgod mslan
                }
                
      }catch(Exception e){
          System.out.println(e);
      }
         
      
                
                
}

    
  
    }
}

