/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import static java.util.logging.Logger.global;

/**
 *
 * @author Hassan
 */




public class GuestInfo implements Serializable {

  

    

   
    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomeNum() {
        return HomeNum;
    }

    public void setHomeNum(String HomeNum) {
        this.HomeNum = HomeNum;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAccType() {
        return AccType;
    }

    public void setAccType(String AccType) {
        this.AccType = AccType;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public int getKids() {
        return Kids;
    }

    public void setKids(int Kids) {
        this.Kids = Kids;
    }

    public int getAdults() {
        return Adults;
    }

    public void setAdults(int Adults) {
        this.Adults = Adults;
    }

    public Date getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(Date CheckIn) {
        this.CheckIn = CheckIn;
    }

    public Date getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(Date CheckOut) {
        this.CheckOut = CheckOut;
    }

    public String getPlate() {
        return Plate;
    }

    public void setPlate(String Plate) {
        this.Plate = Plate;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getRoomNum() {
        return RoomNum;
    }

    public void setRoomNum(String RoomNum) {
        this.RoomNum = RoomNum;
    }

   

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getFirstComp() {
        return firstComp;
    }

    public void setFirstComp(String firstComp) {
        this.firstComp = firstComp;
    }

    public String getSecondComp() {
        return secondComp;
    }

    public void setSecondComp(String secondComp) {
        this.secondComp = secondComp;
    }


    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public double getExtraBed() {
        return extraBed;
    }

    public void setExtraBed(double extraBed) {
        this.extraBed = extraBed;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    
    

  
    
    
    
    
    
private String idNum;
private String LName;
private String FName;
private String MName;
private String Age;
private int Kids;
private int Adults;
private String address;
private String HomeNum;
private String PhoneNum;
private String Gender;
private String AccType;
private String RoomType;
private String RoomNum;
private Date CheckIn;
private Date CheckOut; 
private String Plate;
private String vehicle;
private double deposit;
private String firstComp;
private String secondComp;
private double extraBed;
private double food;
private double Total;






}