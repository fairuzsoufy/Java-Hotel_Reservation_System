/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobs;

import java.io.Serializable;

/**
 *
 * @author Hassan
 */
public abstract class Lemozine implements Serializable{
    private double trustLemo;
    private double Taxi;

    public double getTrustLemo() {
        return trustLemo;
    }

    public void setTrustLemo(double trustLemo) {
        this.trustLemo = trustLemo;
    }

    public double getTaxi() {
        return Taxi;
    }

    public void setTaxi(double Taxi) {
        this.Taxi = Taxi;
    }
    
}
