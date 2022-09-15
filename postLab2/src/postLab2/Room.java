/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postLab2;

/**
 *
 * @author hidayah
 */
public class Room extends Patient { //subclass

    String typeRoom; //strTypeRoom
    int noDay; //intDay

    public Room() {
        super();
        this.noDay = noDay;
        this.typeRoom = typeRoom;
    }   

    public Room(String patientName, String patientAddress, int patientNumber, String typeRoom, int noDay) {
        super(patientName, patientNumber, patientAddress);
        this.noDay = noDay;
        this.typeRoom = typeRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public int getNoDay() {
        return noDay;
    }

    public void setTypeRoom() {
        this.typeRoom = typeRoom;
    }

    public void setNoDay() {
        this.noDay = noDay;
    }

    public double calcPayment(String typeRoom, int noDay) {
        double payment = 0; //float ok too dblPayment
        double discount = 0.75; //dblDiscount

        if (typeRoom.equalsIgnoreCase("Diamond")) { //can use == && || too but time consuming
            if (noDay > 20) {
                payment = 200.00 * noDay * discount;
            } else {
                payment = 200.00 * noDay;
            }
        } else if (typeRoom.equalsIgnoreCase("Gold")) {
            if (noDay > 20) {
                payment = 100.00 * noDay * discount;
            } else {
                payment = 100.00 * noDay;
            }
        } else if (typeRoom.equalsIgnoreCase("Silver")) {
            if (noDay > 20) {
                payment = 80.00 * noDay * discount;
            } else {
                payment = 80.00 * noDay;
            }
        } else if (typeRoom.equalsIgnoreCase("Bronze")) {
            if (noDay > 20) {
                payment = 50.00 * noDay * discount;
            } else {
                payment = 50.00 * noDay;
            }
        } else {
            System.out.println("Wrong input");
        }
        return payment;
    }
}
