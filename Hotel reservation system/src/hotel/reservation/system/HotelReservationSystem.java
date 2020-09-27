
package hotel.reservation.system;

import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;



public class HotelReservationSystem implements Serializable{

   
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
AfterManagerUI i = new AfterManagerUI("");
      try{
            InputStream music=new FileInputStream(new File("C:\\Users\\Omar\\Desktop\\Hotel reservation system\\hotel.wav"));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
            } 
        
        
        AddGuestUI d = new AddGuestUI("Grand Hotel");  
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.setLocationRelativeTo(null);
        
        
       
    
    }
   
}
