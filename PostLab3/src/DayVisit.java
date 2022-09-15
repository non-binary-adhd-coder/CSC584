/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hidayah
 */
public class DayVisit extends ZooTaiping {

    private String category;

    public DayVisit() {
        super();
        category = "";
    }

    public DayVisit(String name, String icNumber, boolean govServant, String c) {
        super(name, icNumber, govServant);
        category = c;
    }

    public void DayVisit(String name, String ic, boolean govServ, String c) {
        super.setZooTaiping(name, ic, govServ);
        category = c;
    }

    public double totalCharges() {
        double price = 0;
        if (category.equalsIgnoreCase("Adult")) {
            price = 25;
        } else if (category.equalsIgnoreCase("Children")) {
            price = 15;
        }

        if (govServant == true) {
            price = price * 0.85;
        }
        return price;
    }

    public String toString() {
        return (super.toString() + " Category:" + category);
    }
}
