/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Omar
 */
public class GraphicsStat extends JPanel{
    JLabel Back=new JLabel();
    public void paintComponent(Graphics g)
    {
        
        super.paintComponent(g);
        
        this.setBackground(Color.white);
        g.setColor(Color.BLUE);
        g.fillRect(200, 400, 100, 500);
        g.setFont(new Font(" ", Font.PLAIN, 20));
        g.drawString("December", 210, 930);
        
        
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(400, 500, 100, 400);
        g.drawString("November", 410, 930);
        g.setFont(new Font(" ", Font.PLAIN, 20));
        
        g.setColor(Color.red);
        g.fillRect(600, 600, 100, 300);
        g.drawString("October", 610,930);
        g.setFont(new Font(" ", Font.PLAIN, 20));
        
        g.setColor(Color.BLACK);
        g.drawLine(50, 200, 50, 900);
        //setFont(new Font(" ", Font.PLAIN, 20));
        g.setColor(Color.BLACK);
        g.drawLine(-100, 900, 900, 900);
        
        g.drawString("No. of Guests", 55, 210);
        g.setFont(new Font(" ", Font.PLAIN, 20));
        
        Back.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Omar\\Desktop\\Hotel reservation system\\Back.png")
         .getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        
        Back.setBounds(20,20, 60, 60);
        
    }
    public GraphicsStat(){
        
        add(Back);
        Back.addMouseListener(new GraphicsStat.ret()); 
        
    
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
