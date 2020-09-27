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
public abstract class Laundry implements Serializable{
    private int pieces;
   private double laundryBill;

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public double getLaundryBill() {
        return laundryBill;
    }

    public void setLaundryBill(double laundryBill) {
        this.laundryBill = laundryBill;
    }
}
