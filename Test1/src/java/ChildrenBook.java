/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hidayah
 */
public class ChildrenBook extends Book{
    private String title;
    private String publisher;
    private int quantity;
    private double price;

    public ChildrenBook(String title, String publisher, int quantity, double price) {
        this.title = title;
        this.publisher = publisher;
        this.quantity = quantity;
        this.price = price;
    }
    
    public double computeSalePrice(){
         return quantity*price;
     }
}
