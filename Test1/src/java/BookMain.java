/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hidayah
 */
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String title = "", publisher = "";
        int quantity = 0;
        double price = 0.00;
        double totalprice =0.00;

        Book[] bookArray = new Book[2];
        ChildrenBook[] childrenArray = new ChildrenBook[2];
        Cartoon[] cartoonArray = new Cartoon[2];

        for (int i = 0; i < bookArray.length; i++) {

            System.out.println("Title: ");
            title = in.next();
            System.out.println("Publisher: ");
            publisher = in.next();
            System.out.println("Quantity: ");
            quantity = in.nextInt();
            System.out.println("Price: RM");
            price = in.nextDouble();

            //Book book1 = new Book(title, publisher,quantity,price); //
            bookArray[i] = new Book();
            childrenArray[i] = new ChildrenBook(title, publisher, quantity, price);
            cartoonArray[i] = new Cartoon(title, publisher, quantity, price);

            totalprice = childrenArray[i].computeSalePrice() + cartoonArray[i].computeSalePrice();

        }
        System.out.println("total Sales is RM" + totalprice);
    }

}

