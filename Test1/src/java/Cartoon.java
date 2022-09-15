/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hidayah
 */
public class Cartoon extends Book{
    private String title;
    private String publisher;
    private int quantity;
    private double price;

   /* public Cartoon(String title, String publisher, int quantity, double price) {
        this.title = title;
        this.publisher = publisher;
         this.quantity = quantity;
        this.price = price;
    }*/

    Cartoon(String title, String publisher, int quantity, double price) {
        this.title = title;
        this.publisher = publisher;
         this.quantity = quantity;
        this.price = price;
        
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public double computeSalePrice(){
         return quantity*price;
     }
    
    
}
