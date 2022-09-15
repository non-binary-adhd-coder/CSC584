/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hidayah
 */
public abstract class ZooTaiping {

    private String visitorName;
    private String icNumber;
    public boolean govServant;

    public ZooTaiping(String name, String ic, boolean govServ) {
        visitorName = name;
        icNumber = ic;
        govServant = govServ;
    }

    public ZooTaiping() {
    }

    public String getName() {
        return visitorName;
    }

    public String getIC() {
        return icNumber;
    }

    public boolean getGovServant() {
        return govServant;
    }

    public abstract double totalCharges();
    
    public void setZooTaiping(String name, String ic, boolean govServ) {
        this.visitorName = visitorName;
        this.icNumber = icNumber;
        this.govServant = govServant;
    }  
        
    public String toString() {
        return ("Name: " + visitorName + " IC No: " + icNumber + " Visitor is a a goverment servant: " + govServant);
    }
}
