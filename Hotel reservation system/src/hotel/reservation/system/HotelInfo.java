/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.io.Serializable;

/**
 *
 * @author Hassan
 */
public class HotelInfo implements Serializable{
     private String hotline="15551";
  private String hotelAddress="Hill Villas Road, Gouna, Egypt"; 
  private String email="info@grandhotel.com";
    private String name="Grand Hotel";
     private String hotelNo="022020330";
     private int ZipCode=11234;

    public int getZipCode() {
        return ZipCode;
    }
   
    public String getHotelNo(){
        return hotelNo;
    }
    public String getHotelName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getHotelAddress(){
        return hotelAddress;
    }
    public String getHotline(){
        return hotline;
    }
}
